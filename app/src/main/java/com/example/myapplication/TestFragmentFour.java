package com.example.myapplication;

import com.example.myapplication.databinding.FramgentTestOneBinding;

public class TestFragmentFour extends BaseFragment<FramgentTestOneBinding>{
    @Override
    protected void initEventAndData() {
        mBinding.mText.setText("第四个");
    }
}
