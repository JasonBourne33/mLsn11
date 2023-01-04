package com.example.mlsn11;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import org.jetbrains.annotations.Nullable;


public class MyService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("jett", "service:" + getApplication());
        Log.i("jett", "service:" + getApplicationContext());
        Log.i("jett", "service:" + getApplicationInfo().className);
    }
}
