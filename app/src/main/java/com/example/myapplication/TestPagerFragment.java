package com.example.myapplication;

import com.example.myapplication.adapter.NavIconType;
import com.example.myapplication.databinding.FramgentTestPagerBinding;
import com.github.fragivity.swipeback.SwipeBackUtil;

public class TestPagerFragment extends BaseFragment<FramgentTestPagerBinding> {
    @Override
    protected void initEventAndData() {
        SwipeBackUtil.setEnableGesture(this, true);
        //System.out.println(getArguments().get("key"));
    }


}
