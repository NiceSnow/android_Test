package com.example.mdd.mytestproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;


// adapter.notifyDataSeChanged(); reloadView;
public class ListViewActivity extends Activity {


    private String[] title = {
            "123","qwe","asd","zxc","123","qwe","asd","zxc","123","qwe","asd","zxc"
    };

    private ListView listView;
    private myAdapter adapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        listView = (ListView) findViewById(R.id.list_view);
        adapter = new myAdapter(this,title);
        listView.setAdapter(adapter);
    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 5;
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
            LayoutInflater inflater = LayoutInflater.from(ListViewActivity.this);
            View Cell = inflater.inflate(R.layout.cell_type,null);
            TextView text = (TextView) Cell.findViewById(R.id.textView);
            String tit = title[i];
            text.setText(tit);
            return Cell;
        }
    }

}
