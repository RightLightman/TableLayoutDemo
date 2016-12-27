package com.jiangtea.tablelayoutdemo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class MyFramgent extends Fragment {

    String mtitle = "";

    public MyFramgent(String title) {
        mtitle = title;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //        return

        View view = inflater.inflate(R.layout.fragment_show, null);
        TextView textView = (TextView) view.findViewById(R.id.tv);
        textView.setText(mtitle);
        //        return super.onCreateView(inflater, container, savedInstanceState);

        return view;
    }
}

