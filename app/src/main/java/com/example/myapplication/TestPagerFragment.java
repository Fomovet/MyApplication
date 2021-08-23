package com.example.myapplication;

import com.example.myapplication.adapter.NavIconType;
import com.example.myapplication.databinding.FramgentTestPagerBinding;
import com.github.fragivity.swipeback.SwipeBackUtil;
import com.gyf.immersionbar.ImmersionBar;

public class TestPagerFragment extends BaseFragment<FramgentTestPagerBinding> {
    @Override
    protected void initEventAndData() {
        setTitle("测试返回", NavIconType.BACK);
        SwipeBackUtil.setEnableGesture(this, true);
        //System.out.println(getArguments().get("key"));
    }


}
