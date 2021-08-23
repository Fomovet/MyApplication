package com.example.myapplication;

import com.example.myapplication.adapter.NavIconType;
import com.example.myapplication.databinding.FramgentTestOneBinding;
import com.example.myapplication.databinding.FramgentTestTwoBinding;
import com.gyf.immersionbar.ImmersionBar;

public class TestFragmentFour extends BaseFragment<FramgentTestTwoBinding>{
    @Override
    protected void initEventAndData() {
        setTitle("我的", NavIconType.NONE);
        //setTitle("第四个", NavIconType.NONE);
        mBinding.mText.setText("第四个");
    }


}
