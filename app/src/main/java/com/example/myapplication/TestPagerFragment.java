package com.example.myapplication;

import android.graphics.Color;

import androidx.annotation.NonNull;

import com.example.myapplication.databinding.FramgentTestPagerBinding;
import com.navigation.androidx.Style;

public class TestPagerFragment extends BaseFragment<FramgentTestPagerBinding>{
    @Override
    protected void initEventAndData() {
        setTitle("界面一");
        //System.out.println(getArguments().get("key"));
    }


}
