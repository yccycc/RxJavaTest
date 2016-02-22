package com.yc.startservicett;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class ServiceToSeeLifCyc extends Service {
    public ServiceToSeeLifCyc() {
        Log.i("bitch-s","ServiceToSeeLifCyc()");
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Log.i("bitch-s", "onStart");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("bitch-s", "onCreate()");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("bitch-s", "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
