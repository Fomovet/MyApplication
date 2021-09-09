package com.example.myapplication.base;

import com.example.myapplication.databinding.TestLodingBinding;
import com.taoweiji.navigation.Destination;

/**
 * 该文件或类的作用 :
 * 作者 : Fomovet
 * Email : Fomovet@Gmail.com
 * 创建时间 : 2021/09/09 16:43
 */
public class LoginAbility extends TestFragment<TestLodingBinding> {
    @Override
    protected void initEventAndData() {
        mBinding.mLoding.setText("退出登录");
        mBinding.mLoding.setOnClickListener(v -> findNavController().relaunch(Destination.with(new TestAbility())));
    }
}
