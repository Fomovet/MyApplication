package com.example.myapplication;

import android.graphics.Color;

import androidx.annotation.NonNull;

import com.example.myapplication.databinding.FramgentTestOneBinding;
import com.navigation.androidx.Style;

public class TestFragmentFour extends BaseFragment<FramgentTestOneBinding>{
    @Override
    protected void initEventAndData() {
        setTitle("状态栏");
        mBinding.mText.setText("第四个");
    }


}
