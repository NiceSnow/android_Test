package com.example.mdd.mytestproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.mdd.mytestproject.Interface.changeMainText;

public class myFragment2 extends Fragment {

    Button btn ;

    private changeMainText changeText;


    public void setChangeText(changeMainText changeText) {
        this.changeText = changeText;
    }

        @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout2, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn = (Button)view.findViewById(R.id.button2);
        btn.setOnClickListener(new btnListener());
    }

    public class btnListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            changeText.changeText("第三个点击了");
        }
    }
}
