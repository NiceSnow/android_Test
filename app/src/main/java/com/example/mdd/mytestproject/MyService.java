package com.example.mdd.mytestproject;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyService extends Service {

    private final String STR_TAG = "TAG";

    @Override
    public IBinder onBind(Intent intent) {

        // TODO Auto-generated method stub

        return null;

    }

    @Override
    public void onCreate() {
        
        Log.v(STR_TAG, "My Service Create");
    }

    @Override

    public void onStart(Intent intent, int startId)

    {

        Log.v(STR_TAG, "My Service Started");

    }

    @Override

    public void onDestroy() {
        Log.v(STR_TAG, "My Service Destroy");

    }
}
