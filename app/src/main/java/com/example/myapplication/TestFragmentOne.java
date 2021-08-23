package com.example.myapplication;

import android.content.Intent;
import android.view.View;

import com.dylanc.loadinghelper.LoadingHelper;
import com.example.myapplication.adapter.NavIconType;
import com.example.myapplication.databinding.FramgentTestOneBinding;
import com.github.fragivity.Fragivity;
import com.github.fragivity.swipeback.SwipeBackUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class TestFragmentOne extends BaseFragment<FramgentTestOneBinding> {


    @Override
    protected void initEventAndData() {

        ToolbarUtils.setToolbar(getActivity(), this, "Fragment(empty)", NavIconType.NONE);
        //setTitle("ces", NavIconType.NONE);
        mBinding.mText.setOnClickListener(v -> {
            Fragivity.of(this).push(TestPagerFragment.class);
            // startActivity(new Intent(mContext, TestActivity.class));
        });

    }

}
