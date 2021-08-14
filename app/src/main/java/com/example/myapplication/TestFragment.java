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
public class TestFragment extends AwesomeFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //使用ViewBinding报错写法一：FragmentTestBinding.inflate(inflater,container,false).getRoot()
        //报错写法二：FragmentTestBinding.inflate(getLayoutInflater()).getRoot()
        //不报错写法：inflater.inflate(R.layout.fragment_test, container, true)
        return FramgentTestOneBinding.inflate(getLayoutInflater()).getRoot();
    }
}
