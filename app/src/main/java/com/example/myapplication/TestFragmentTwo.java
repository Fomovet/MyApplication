package com.example.myapplication;

import com.example.myapplication.adapter.NavIconType;
import com.example.myapplication.databinding.FramgentTestOneBinding;
import com.gyf.immersionbar.ImmersionBar;

public class TestFragmentTwo extends BaseFragment<FramgentTestOneBinding>{
    @Override
    protected void initEventAndData() {
        setTitle("工作台", NavIconType.NONE);
        //setTitle("第二个", NavIconType.NONE);
        mBinding.mText.setText("第二个");

    }

}
