package com.example.mdd.mytestproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class myFragment extends Fragment {
    private TextView textView;
    String Title;

    public void setTitle(String title) {
        Title = title;
        textView.setText(title);
    }

    public static myFragment newInstance(String str) {
        myFragment f = new myFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        f.setArguments(bundle);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle=getArguments();
        Title = bundle.getString("title");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, container, false);
        textView = view.findViewById(R.id.textView2);
        textView.setText(Title);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        textView = view.findViewById(R.id.textView2);
    }

    /*公开私有变量属性*/
    public void setGreeting(String text) {
        this.textView.setText(text);
    }
}
