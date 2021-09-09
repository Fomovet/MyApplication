package com.example.myapplication.base;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Handler;

import androidx.appcompat.widget.Toolbar;

import com.example.myapplication.adapter.NavIconType;
import com.example.myapplication.databinding.FragmentHomeBinding;
import com.example.myapplication.databinding.TestLodingBinding;
import com.gyf.immersionbar.ImmersionBar;
import com.taoweiji.navigation.Ability;
import com.taoweiji.navigation.BundleBuilder;
import com.taoweiji.navigation.StatusBarHelper;

/**
 * 该文件或类的作用 :
 * 作者 : Fomovet
 * Email : Fomovet@Gmail.com
 * 创建时间 : 2021/09/09 15:44
 */
public class TestAbility extends TestFragment<TestLodingBinding> {
    @SuppressLint("ResourceType")
    @Override
    protected void initEventAndData() {
        setTitle("测试", NavIconType.NONE);
        //ImmersionBar.with(getActivity()).titleBar(mBinding.mToolbar).init();
        mBinding.mLoding.setOnClickListener(v -> {
            findNavController().navigate(new TestTwoAbility(), new BundleBuilder().put("KEY", "我是传递过来的数据").build());
            //setToolbarBackgroundColor(Color.RED);
        });
    }
}
