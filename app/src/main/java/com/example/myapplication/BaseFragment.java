package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;

import com.navigation.androidx.AwesomeFragment;

import org.jetbrains.annotations.NotNull;

public abstract class BaseFragment<T extends ViewBinding> extends AwesomeFragment {
    protected T mBinding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,  ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        mBinding = ViewBindingUtil.create(getClass(),inflater.from(getActivity()),container,false);
        FrameLayout frameLayout = new FrameLayout(getActivity());
        frameLayout.addView(mBinding.getRoot());
        return frameLayout;
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initEventAndData();
    }

    protected abstract void initEventAndData();

}
