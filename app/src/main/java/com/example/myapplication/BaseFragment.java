package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBinding;


import com.dylanc.loadinghelper.LoadingHelper;
import com.dylanc.loadinghelper.ViewType;
import com.dylanc.viewbinding.base.ViewBindingUtil;
import com.example.myapplication.adapter.NavIconType;
import com.example.myapplication.adapter.ToolbarAdapter;


import com.github.fragivity.swipeback.SwipeBackUtil;
import com.gyf.immersionbar.BarHide;
import com.gyf.immersionbar.ImmersionBar;
import com.gyf.immersionbar.components.ImmersionFragment;


import org.jetbrains.annotations.NotNull;

public abstract class BaseFragment<T extends ViewBinding> extends ImmersionFragment implements LoadingHelper.OnReloadListener {
    protected T mBinding;

    protected FragmentActivity mActivity;
    protected Context mContext;
    protected LoadingHelper loadingHelper;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        mBinding = ViewBindingUtil.inflateWithGeneric(this, inflater, container, false);
        loadingHelper = new LoadingHelper(mBinding.getRoot());
        loadingHelper.setOnReloadListener(this);
        return loadingHelper.getDecorView();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initEventAndData();

    }

    private void initToolbar() {
//        ImmersionBar.with(this)
////                .fitsSystemWindows(true)
////                .statusBarColor(R.color.white)
//                .statusBarDarkFont(true, 0.2f)
//                .hideBar(BarHide.FLAG_HIDE_NAVIGATION_BAR)//隐藏底部导航
//                .keyboardEnable(true).init();
    }


    public void setTitle(String title, NavIconType type) {
        ToolbarAdapter mToolbarAdapter = new ToolbarAdapter(getActivity(), title, type);
        loadingHelper.addChildDecorHeader(mToolbarAdapter);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        mActivity = getActivity();
        mContext = context;
        super.onAttach(context);
    }

    @Override
    public void onReload() {

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mBinding = null;
    }

    protected abstract void initEventAndData();

    @Override
    public void initImmersionBar() {
        ImmersionBar.with(this)
//                .fitsSystemWindows(true)
//                .statusBarColor(R.color.white)
                .statusBarDarkFont(true, 0.2f)
                .hideBar(BarHide.FLAG_HIDE_NAVIGATION_BAR)//隐藏底部导航
                .keyboardEnable(true).init();
    }
}
