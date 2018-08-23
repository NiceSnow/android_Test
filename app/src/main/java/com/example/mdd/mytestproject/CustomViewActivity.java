package com.example.mdd.mytestproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class CustomViewActivity extends Activity {

    private CustomView2 customView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.custom_layout1);
//        customView = new CustomView2(this);
//        setContentView(customView);

        CodeView codeView = new CodeView(this,"qews23asdcxzc");
        setContentView(codeView);

    }
}
