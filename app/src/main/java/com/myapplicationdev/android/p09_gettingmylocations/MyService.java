package com.myapplicationdev.android.p09_gettingmylocations;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {
    boolean started;
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        Log.d("Service", "Service created");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if (started == false){
            started = true;
            Log.d("Service", "Service started");
            Toast.makeText(this, "Service started", Toast.LENGTH_SHORT).show();
        } else {
            Log.d("Service", "Service is still running");
            Toast.makeText(this, "Service is still running", Toast.LENGTH_SHORT).show();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d("Service", "Service exited");
        Toast.makeText(this, "Service exited", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

}
