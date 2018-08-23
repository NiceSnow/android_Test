package com.example.mdd.mytestproject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CustomView extends View {

    Paint myPaint;
    Bitmap myBtimap;
    public CustomView(Context context) {
        super(context);
        init();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init(){
        myPaint = new Paint();
        myPaint.setColor(Color.BLUE);
        myPaint.setStyle(Paint.Style.STROKE);
        myPaint.setStrokeWidth(3);

        myBtimap = BitmapFactory.decodeResource(getResources(),R.drawable.image);
        myBtimap=Bitmap.createScaledBitmap(myBtimap,200,200,true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(50,50,50,myPaint);
        canvas.drawRect(10,120,110,170,myPaint);
        canvas.drawBitmap(myBtimap,10,200,null);
        super.onDraw(canvas);
    }
}
