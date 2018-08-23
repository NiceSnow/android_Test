package com.example.mdd.mytestproject;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CommonBaseHolder {
    private View convertView;

    private SparseArray<View> mViews;

    private Context mContext;

    public CommonBaseHolder(Context context, ViewGroup parent, int layoutId) {
        this.mContext = context;
        convertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        convertView.setTag(this);
        mViews = new SparseArray<>();
    }

    public static CommonBaseHolder newInstance(Context context, View convertView, ViewGroup parent, int layoutId) {
        if (convertView == null) {
            return new CommonBaseHolder(context, parent, layoutId);
        } else {
            return (CommonBaseHolder) convertView.getTag();
        }
    }

    public View getConvertView() {
        return convertView;
    }

    public <V extends View> V getView(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = convertView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (V) view;
    }

    public void setText(int viewId, String value) {
        TextView tv = getView(viewId);
        tv.setText(value);
    }

    public void setText(int viewId, String value, int color) {
        TextView tv = getView(viewId);
        tv.setTextColor(color);
        tv.setText(value);
    }

    public void setImage(int viewId, String url, int errorRes) {
        ImageView imageView = getView(viewId);

    }

    /**
     * 借款暂用
     * @param viewId
     * @param errorRes
     */
    public void setImage(int viewId, int errorRes) {
        ImageView imageView = getView(viewId);
        imageView.setImageResource(errorRes);
    }
}
