package com.example.myapplication;

import com.example.myapplication.databinding.FramgentTestOneBinding;

/**
 * 该文件或类的作用 :
 * 作者 : Fomovet
 * Email : Fomovet@Gmail.com
 * 创建时间 : 2021/08/14 18:42
 */
public class TestFragment extends BaseFragment<FramgentTestOneBinding> {

    @Override
    protected void initEventAndData() {
        mBinding.mText.setText("");
    }
}
