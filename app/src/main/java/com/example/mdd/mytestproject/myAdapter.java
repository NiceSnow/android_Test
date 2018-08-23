package com.example.mdd.mytestproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;

public class myAdapter extends BaseAdapter {

    private String[] listArray;

    public Context mContext;

    public myAdapter(Context context, String[] listArray){
        this.mContext = context;
        this.listArray = listArray;

    }


    @Override
    public int getCount() {
        return listArray.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        View Cell;
        if (view==null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            Cell = inflater.inflate(R.layout.cell_type,null);
            holder = new ViewHolder(Cell);
            Cell.setTag(holder);
        }else {
            Cell = view;
            holder = (ViewHolder) Cell.getTag();
        }


        TextView text = (TextView) Cell.findViewById(R.id.textView);

        String tit = listArray[i];
        text.setText(tit);
        return Cell;
    }

    class ViewHolder{
        private View view;
        private TextView tvTextView;

        public ViewHolder (View V){
            this.view = V;
        }

        public TextView getTvTextView(){
            if (tvTextView == null){
                tvTextView = (TextView) view.findViewById(R.id.textView);
            }
            return tvTextView;
        }
    }
}
