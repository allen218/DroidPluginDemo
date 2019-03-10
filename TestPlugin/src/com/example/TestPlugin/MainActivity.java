package com.example.TestPlugin;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.morgoo.droidplugin.pm.PluginManager;
import com.morgoo.helper.Log;

import java.io.File;


public class MainActivity extends AppCompatActivity {
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

    }

    public Activity getActivity() {
        return this;
    }

    private void doInstall(final File apkPath) {
        try {
            final PackageInfo info = getPackageManager().getPackageArchiveInfo(apkPath.getAbsolutePath(), PackageManager.GET_ACTIVITIES);
            if (info == null) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getActivity(), "apk损坏\n" + apkPath.getAbsolutePath(), Toast.LENGTH_SHORT).show();
                    }
                });
                return;
            }
            final int re = PluginManager.getInstance().installPackage(apkPath.getAbsolutePath(), 0);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void load(View view) {
    }
}
