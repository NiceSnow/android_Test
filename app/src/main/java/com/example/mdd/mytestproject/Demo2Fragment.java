package com.example.mdd.mytestproject;

import android.app.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Demo2Fragment extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo2gragment_layout);
    }

    public void addFragment(View view) {

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        myFragment fragment = myFragment.newInstance("动态添加");
//        fragment.setTitle("动态添加");
//        1添加的容器 2Fragment 3 Fragment tag
        ft.add(R.id.layout,fragment,"test");
        ft.addToBackStack(null);
        ft.commit();
    }

    public void removeFragment (View view){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        myFragment fg = (myFragment) fm.findFragmentByTag("test");

        ft.remove(fg);
        ft.commit();
    }

    public void showFragment (View view){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        myFragment fg = (myFragment) fm.findFragmentByTag("test");

        if (fg.isHidden()) {
            ft.show(fg);
        }else {
            ft.hide(fg);
        }
        ft.commit();
    }
}
