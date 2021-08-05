package com.example.myapplication;

import android.os.Bundle;

import com.example.myapplication.databinding.FramgentTestOneBinding;
import com.github.fragivity.Fragivity;
import com.github.fragivity.LaunchMode;
import com.github.fragivity.NavOptionsBuilder;

public class TestFragmentOne extends BaseFragment<FramgentTestOneBinding> {


    @Override
    protected void initEventAndData() {
        mBinding.mText.setOnClickListener(v -> {
            Bundle bundle = new Bundle();
            bundle.putString("key", "我传过来的数据");
            Fragivity.of(this).push(TestPagerFragment.class, new NavOptionsBuilder()
                    .setArguments(bundle)
                    .setEnterAnim(R.anim.slide_in)
                    .setExitAnim(R.anim.slide_out)
                    .setPopEnterAnim(R.anim.slide_in_pop)
                    .setPopExitAnim(R.anim.slide_out_pop)
                    .setLaunchMode(LaunchMode.STANDARD)
                    .build());

        });
    }
}
