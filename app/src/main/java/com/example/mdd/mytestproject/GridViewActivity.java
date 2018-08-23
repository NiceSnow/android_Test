package com.example.mdd.mytestproject;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class GridViewActivity extends Activity {

    private static final String[] data = {"上海", "北京", "大连", "沈阳"};

    private GridView gridView;
    private GridView gridView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_view);
        gridView = (GridView) findViewById(R.id.gridView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                data
        );
//        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(GridViewActivity.this, data[i], Toast.LENGTH_LONG).show();
            }
        });

        gridView2 = (GridView) findViewById(R.id.gridView2);

        myGrideAdapt grideAdapt = new myGrideAdapt();
        gridView2.setAdapter(grideAdapt);
    }

    class myGrideAdapt extends BaseAdapter {

        private int[] imageResId = {
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.mipmap.ic_launcher,
                R.drawable.ic_dashboard_black_24dp,
        };

        private String[] name={
                "123",
                "123",
                "123",
                "123",
                "123",
                "123",
                "123",
                "qwe",
        };

        @Override
        public int getCount() {
            return imageResId.length;
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

            View Cell;
            HolderView holderView;
            if (view == null){
                LayoutInflater inflater = LayoutInflater.from(GridViewActivity.this);
                Cell = inflater.inflate(R.layout.layout,null);
                holderView = new HolderView();
                holderView.image = (ImageView) Cell.findViewById(R.id.imageView1);
                holderView.tv = (TextView) Cell.findViewById(R.id.textView1);
                Cell.setTag(holderView);
            }else {
                Cell = view;
                holderView = (HolderView) Cell.getTag();
            }


            TextView text = holderView.tv;
            ImageView image = holderView.image;
            String tit = name[i];
            text.setText(tit);
            image.setImageResource(imageResId[i]);
            return Cell;
        }

        class HolderView {
            ImageView image;
            TextView tv;
        }
    }
}
