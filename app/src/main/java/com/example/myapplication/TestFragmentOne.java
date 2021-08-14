package com.example.myapplication;

import android.view.View;

import com.example.myapplication.databinding.FramgentTestOneBinding;

import java.util.ArrayList;
import java.util.Arrays;

public class TestFragmentOne extends BaseFragment<FramgentTestOneBinding> {


    @Override
    protected void initEventAndData() {
        setTitle("首页");
        mBinding.mText.setOnClickListener(v -> {
            getNavigationFragment().pushFragment(new TestPagerFragment());
        });
        //setOnclick(mBinding.mText,mBinding.mText);
    }

    private void setOnclick(View... views) {
        ArrayList<View> view = new ArrayList<>(Arrays.asList(views));
        for (View mView : view) {
            mView.setOnClickListener(v -> {

            });
        }
    }
}
