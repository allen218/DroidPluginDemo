/*
**        DroidPlugin Project
**
** Copyright(c) 2015 Andy Zhang <zhangyong232@gmail.com>
**
** This file is part of DroidPlugin.
**
** DroidPlugin is free software: you can redistribute it and/or
** modify it under the terms of the GNU Lesser General Public
** License as published by the Free Software Foundation, either
** version 3 of the License, or (at your option) any later version.
**
** DroidPlugin is distributed in the hope that it will be useful,
** but WITHOUT ANY WARRANTY; without even the implied warranty of
** MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
** Lesser General Public License for more details.
**
** You should have received a copy of the GNU Lesser General Public
** License along with DroidPlugin.  If not, see <http://www.gnu.org/licenses/lgpl.txt>
**
**/

package com.morgoo.droidplugin.hook.proxy;

import android.content.Context;
import android.text.TextUtils;

import com.morgoo.droidplugin.hook.Hook;
import com.morgoo.droidplugin.hook.BaseMethodHandle;
import com.morgoo.helper.MyProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Andy Zhang(zhangyong232@gmail.com) on 2015/3/14.
 */
public abstract class BaseProxyHook extends Hook implements InvocationHandler {

    protected Object mOldObj;

    public BaseProxyHook(Context hostContext) {
        super(hostContext);
    }

    public void setOldObj(Object oldObj) {
        this.mOldObj = oldObj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try {
            if (!isEnable()) {
                return method.invoke(mOldObj, args);
            }
            BaseMethodHandle hookedMethodHandler = mHookHandles.getHookedMethodHandler(method);
            if (hookedMethodHandler != null) {
                return hookedMethodHandler.doHookInner(mOldObj, method, args);
            }
            return method.invoke(mOldObj, args);
        } catch (InvocationTargetException e) {
            Throwable cause = e.getTargetException();
            if (cause != null && MyProxy.isMethodDeclaredThrowable(method, cause)) {
                throw cause;
            } else if (cause != null) {
                RuntimeException runtimeException = !TextUtils.isEmpty(cause.getMessage()) ? new RuntimeException(cause.getMessage()) : new RuntimeException();
                runtimeException.initCause(cause);
                throw runtimeException;
            } else {
                RuntimeException runtimeException = !TextUtils.isEmpty(e.getMessage()) ? new RuntimeException(e.getMessage()) : new RuntimeException();
                runtimeException.initCause(e);
                throw runtimeException;
            }
        } catch (IllegalArgumentException e) {

        }
        return null;
    }
}
