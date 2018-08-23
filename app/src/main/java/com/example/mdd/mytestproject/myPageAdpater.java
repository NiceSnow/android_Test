package com.example.mdd.mytestproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class myPageAdpater extends FragmentPagerAdapter {


    private FragmentManager mfragmentManager;
    private List<Fragment> mlist;
    private List<String> Datalist;

    public myPageAdpater (FragmentManager fm, List<Fragment> list, List<String> datalist) {
        super(fm);
        this.mlist = list;
        this.Datalist = datalist;

    }

    @Override
    public Fragment getItem(int i) {

        if (i == 0){
            myFragment f = (myFragment)mlist.get(i);

            String title = Datalist.get(i);
            return f;
        }
        Fragment f = mlist.get(i);
        return f;
    }

    @Override
    public int getCount() {
        return mlist.size();
    }
}
