package com.example.mdd.mytestproject;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mdd.mytestproject.Interface.changeMainText;

import java.util.ArrayList;
import java.util.List;

//AppCompatActivity
public class FragmentActivity extends AppCompatActivity implements changeMainText {
    Button honeBtn ;
    Button mainBtn;
    Button myBtn;

    myFragment fg;
    ViewPager pager ;
    myPageAdpater adpater;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activity_layout);

        mainBtn = findViewById(R.id.main);
        honeBtn = findViewById(R.id.home);
        myBtn =   findViewById(R.id.my);

        mainBtn.setOnClickListener(new btnListener());
        honeBtn.setOnClickListener(new btnListener());
        myBtn.setOnClickListener(new btnListener());

        pager = (ViewPager) findViewById(R.id.viewpager);

        List<Fragment> list = new ArrayList<>();
        List<String> DataList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (i == 0){
                myFragment f = myFragment.newInstance("动态添加");;
                fg = f;
                list.add(f);
                DataList.add("首页");
            }else if (i == 1){
                myFragment1 f1 = new myFragment1();
                list.add(f1);
            }else if (i == 2){
                myFragment2 f2 =  new myFragment2();
                f2.setChangeText(FragmentActivity.this);
                list.add(f2);
            }

        }

        pager.setAdapter(new myPageAdpater(getSupportFragmentManager(), list,DataList));
    }

    @Override
    public void changeText(String text) {
        Log.i("test123",text);
        fg.setTitle(text);
    }

    public class btnListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.main:
                    Toast.makeText(FragmentActivity.this,"main",Toast.LENGTH_LONG).show();
                    pager.setCurrentItem(0);
                    break;

                case R.id.home:
                    Toast.makeText(FragmentActivity.this,"home",Toast.LENGTH_LONG).show();
                    pager.setCurrentItem(1);
                    break;

                case R.id.my:
                    Toast.makeText(FragmentActivity.this,"my",Toast.LENGTH_LONG).show();
                    pager.setCurrentItem(2);
                    break;
            }
        }
    }
}
