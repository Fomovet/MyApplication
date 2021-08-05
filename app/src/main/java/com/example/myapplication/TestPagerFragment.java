package com.example.myapplication;

import android.os.Bundle;

import com.example.myapplication.databinding.FramgentTestPagerBinding;
import com.github.fragivity.FragivityUtil;

public class TestPagerFragment extends SwipeBackBaseFragment<FramgentTestPagerBinding>{
    @Override
    protected void initEventAndData() {

        System.out.println(getArguments().get("key"));
    }
}
