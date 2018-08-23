package com.example.mdd.mytestproject;

import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.app.ListActivity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.widget.SimpleCursorAdapter;

import com.example.mdd.mytestproject.tools.Profile;

public class ContentProviderActivity extends ListActivity {

    private SimpleCursorAdapter adapter = null;
    private Cursor mCursor = null;
    private ContentResolver mContentResolver = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
        initAdapter();
    }

    public class PersonObserver extends ContentObserver {
        public PersonObserver(Handler handler) {
            super(handler);
        }

        public void onChange(boolean selfChange) {
            //to do something
            Log.i("123","456");
        }
    }

        public void initData() {
            mContentResolver = getContentResolver();
            mContentResolver.registerContentObserver(Profile.CONTENT_URI, true, new PersonObserver(new Handler()));
            for (int i = 0; i < 100; i++) {
                ContentValues values = new ContentValues();
                values.put(Profile.COLUMN_NAME, "Wang " + i);
                mContentResolver.insert(Profile.CONTENT_URI, values);
            }
        }


        public void initAdapter() {
            mCursor = mContentResolver.query(Profile.CONTENT_URI, new String[]{Profile.COLUMN_ID, Profile.COLUMN_NAME}, null, null, null);

            startManagingCursor(mCursor);

            //设置adapter
            adapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_2, mCursor, new String[]{Profile.COLUMN_ID, Profile.COLUMN_NAME}, new int[]{android.R.id.text1, android.R.id.text2});
            setListAdapter(adapter);
        }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

    }
