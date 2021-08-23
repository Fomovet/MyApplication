package com.example.myapplication;

import com.example.myapplication.adapter.NavIconType;
import com.example.myapplication.databinding.FramgentTestOneBinding;
import com.gyf.immersionbar.ImmersionBar;

public class TestFragmentThree extends BaseFragment<FramgentTestOneBinding>{
    @Override
    protected void initEventAndData() {
        setTitle("SAAS", NavIconType.NONE);
        //setTitle("第三个", NavIconType.NONE);
        mBinding.mText.setText("第三个");
    }


}
