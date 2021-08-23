package com.example.myapplication;

import com.example.myapplication.databinding.FramgentTestOneBinding;

public class TestFragmentTwo extends BaseFragment<FramgentTestOneBinding>{
    @Override
    protected void initEventAndData() {

        mBinding.mText.setText("第二个");
    }
}
