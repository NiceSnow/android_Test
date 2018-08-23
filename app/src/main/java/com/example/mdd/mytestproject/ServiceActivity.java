package com.example.mdd.mytestproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ServiceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activicy_service);
        Button btnStartService = (Button)this.findViewById(R.id.btnStartService);
        Button btnStopService = (Button)this.findViewById(R.id.btnStopService);
        btnStartService.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                startService(new Intent(ServiceActivity.this, MyService.class));
            }
        });
        btnStopService.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                stopService(new Intent(ServiceActivity.this, MyService.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
