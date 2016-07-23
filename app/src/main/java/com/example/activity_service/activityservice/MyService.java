package com.example.activity_service.activityservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG = "MyServiceTAG" ;

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //System.out.println("We are in the onCreate of the Service");
        Log.d(TAG, "onCreate Service: " + this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy Service: " + this);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        //return null;
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
