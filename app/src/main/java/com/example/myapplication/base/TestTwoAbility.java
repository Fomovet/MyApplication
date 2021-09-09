package com.example.myapplication.base;

import androidx.appcompat.widget.Toolbar;

import com.example.myapplication.adapter.NavIconType;
import com.example.myapplication.databinding.FramgentTestPagerBinding;
import com.taoweiji.navigation.StatusBarHelper;

/**
 * 该文件或类的作用 :
 * 作者 : Fomovet
 * Email : Fomovet@Gmail.com
 * 创建时间 : 2021/09/09 16:04
 */
public class TestTwoAbility extends TestFragment<FramgentTestPagerBinding> {


    @Override
    protected void initEventAndData() {
        //setStatusBarStyle(StatusBarHelper.STYLE_WHITE);
        setTitle("测试标题", NavIconType.BACK);

        mBinding.mText.setText(getArguments().getString("KEY"));
        mBinding.mText.setOnClickListener(v -> {
            findNavController().navigate(new LoginAbility());
        });

    }

}
