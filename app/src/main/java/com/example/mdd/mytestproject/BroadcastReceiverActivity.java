package com.example.mdd.mytestproject;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class BroadcastReceiverActivity extends Activity {
    mBroadcastReceiver mBroadcastReceiver;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onResume() {
        super.onResume();
        // 1. 实例化BroadcastReceiver子类 &  IntentFilter
        mBroadcastReceiver = new mBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();

        // 2. 设置接收广播的类型
        intentFilter.addAction("wwwwwww");

        // 3. 动态注册：调用Context的registerReceiver（）方法
        registerReceiver(mBroadcastReceiver, intentFilter);


        Intent intent = new Intent();
        //对应BroadcastReceiver中intentFilter的action
        intent.setAction("wwwwwww");
        //发送广播
        sendBroadcast(intent);

    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(mBroadcastReceiver);
        

    }


}
