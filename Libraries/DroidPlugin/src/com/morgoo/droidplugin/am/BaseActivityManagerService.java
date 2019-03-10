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

package com.morgoo.droidplugin.am;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.RemoteCallbackList;
import android.os.RemoteException;

import com.morgoo.droidplugin.pm.IPluginManagerImpl;
import com.morgoo.droidplugin.pm.parser.PluginPackageParser;
import com.morgoo.helper.Log;

import java.util.List;
import java.util.Map;

/**
 * Created by Andy Zhang(zhangyong232@gmail.com) on 2015/3/10.
 */
public abstract class BaseActivityManagerService {

    private static final String TAG = BaseActivityManagerService.class.getSimpleName();
    protected Context mHostContext;

    public BaseActivityManagerService(Context hostContext) {
        mHostContext = hostContext;
    }


    public abstract ActivityInfo selectStubActivityInfo(int callingPid, int callingUid, ActivityInfo targetInfo) throws RemoteException;


    public void onPkgDeleted(Map<String, PluginPackageParser> pluginCache, PluginPackageParser parser, String packageName) throws Exception {
    }

    public void onPkgInstalled(Map<String, PluginPackageParser> pluginCache, PluginPackageParser parser, String packageName) throws Exception {
    }

    public void onCreate(IPluginManagerImpl pluginManagerImpl) throws Exception {

    }



    public String getProcessNameByPid(int pid) {
        return null;
    }

    public void onReportMyProcessName(int callingPid, int callingUid, String stubProcessName, String targetProcessName, String targetPkg) {
    }


    private static class ProcessCookie {
        private ProcessCookie(int pid, int uid) {
            this.pid = pid;
            this.uid = uid;
        }

        private final int pid;
        private final int uid;
    }




    public boolean registerApplicationCallback(int callingPid, int callingUid ) {
        return true;
    }

    public boolean unregisterApplicationCallback(int callingPid, int callingUid ) {
        return true;
    }

    public void onActivityCreated(int callingPid, int callingUid, ActivityInfo stubInfo, ActivityInfo targetInfo) {
    }

    public void onActivityDestroy(int callingPid, int callingUid, ActivityInfo stubInfo, ActivityInfo targetInfo) {
    }



    public void onDestroy() {
    }
}
