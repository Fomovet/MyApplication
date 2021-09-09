package com.example.myapplication;

import com.example.myapplication.adapter.NavIconType;
import com.example.myapplication.databinding.FramgentTestPagerBinding;
import com.github.fragivity.swipeback.SwipeBackUtil;
import com.gyf.immersionbar.ImmersionBar;

public class TestPagerFragment extends BaseFragment<FramgentTestPagerBinding> {
    @Override
    protected void initEventAndData() {
        setTitle("测试标题", NavIconType.BACK);
        //System.out.println(getArguments().get("key"));
    }


}
