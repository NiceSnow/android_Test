package com.example.mdd.mytestproject;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class NoScrollViewPager extends ViewPager {


    boolean noScroll;

    public NoScrollViewPager(Context context) {
        this(context, null);
    }

    public NoScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray tArray = context.obtainStyledAttributes(attrs, R.styleable.NoScrollViewPager);//获取配置属性
        noScroll = tArray.getBoolean(R.styleable.NoScrollViewPager_noScroll, false);
        tArray.recycle();
    }


    @Override
    public boolean onTouchEvent(MotionEvent arg0) {
        if (noScroll) {
            return false;
        }
        return super.onTouchEvent(arg0);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        if (noScroll) {
            return false;
        }
        return super.onInterceptTouchEvent(arg0);
    }

    @Override
    public void setCurrentItem(int item) {
        //false 去除滚动效果
        super.setCurrentItem(item, false);
    }
}
