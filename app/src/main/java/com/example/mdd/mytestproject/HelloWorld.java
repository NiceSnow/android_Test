package com.example.mdd.mytestproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.mdd.mytestproject.MainActivity;
import com.example.mdd.mytestproject.TestActivity;

public class HelloWorld extends Activity {


    TextView text;
    Button btn1;
    Button btn2;

    TextView scrollText;
    ImageView image1;
    ImageView image2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.helloworld);


        text = (TextView) findViewById(R.id.helloTextView);
        btn1 = (Button) findViewById(R.id.helloButton1);
        btn2 = (Button) findViewById(R.id.helloButton2);

        scrollText = (TextView)findViewById(R.id.scrollTextView);

        image1 = (ImageView) findViewById(R.id.scrollImage1);
        image2 = (ImageView) findViewById(R.id.scrollImage2);

//        btn1.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//                Log.i("匿名内部类", "点击事件");
//
//            }
//        });

        btn1.setOnClickListener(new MyListener());

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollText.setText("第一个图片呗点击");
                Intent intent = new Intent();
                intent.setAction("android.intent.action.test");
                startActivity(intent);
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollText.setText("第二个图片呗点击");

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });

    }

    class MyListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Log.i("123", "定义内部类，实现OnClickListene接口");
            text.setText("按钮1被点击");
        }
    }

    /**/
    public void buttonPress(View v) {
        Log.i("123", "按钮点击");
        text.setText("按钮2被点击");
    }
}
