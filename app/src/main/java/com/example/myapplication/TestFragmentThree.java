package com.example.myapplication;

import android.graphics.Color;

import androidx.annotation.NonNull;

import com.example.myapplication.databinding.FramgentTestOneBinding;
import com.navigation.androidx.Style;

public class TestFragmentThree extends BaseFragment<FramgentTestOneBinding>{
    @Override
    protected void initEventAndData() {
        mBinding.mText.setText("第三个");
    }



}
