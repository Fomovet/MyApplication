package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.databinding.FramgentTestOneBinding;
import com.navigation.androidx.AwesomeFragment;

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
