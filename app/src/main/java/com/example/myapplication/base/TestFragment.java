package com.example.myapplication.base;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;

import com.dylanc.loadinghelper.LoadingHelper;
import com.dylanc.viewbinding.base.ViewBindingUtil;
import com.example.myapplication.R;
import com.example.myapplication.adapter.NavIconType;
import com.example.myapplication.adapter.ToolbarAdapter;
import com.gyf.immersionbar.ImmersionBar;
import com.taoweiji.navigation.Ability;
import com.taoweiji.navigation.StatusBarHelper;

/**
 * 该文件或类的作用 :
 * 作者 : Fomovet
 * Email : Fomovet@Gmail.com
 * 创建时间 : 2021/09/09 15:30
 */
public abstract class TestFragment<T extends ViewBinding> extends Ability implements LoadingHelper.OnReloadListener {

    protected T mBinding;
    protected LoadingHelper loadingHelper;

    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = ViewBindingUtil.inflateWithGeneric(this, inflater, container, false);
        loadingHelper = new LoadingHelper(mBinding.getRoot());
        loadingHelper.setOnReloadListener(this);
        return loadingHelper.getDecorView();
    }

    @SuppressLint("ResourceType")
    @Override
    protected void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initEventAndData();
        //setContentViewMarginTop(50);
        //setStatusBarStyle(StatusBarHelper.STYLE_WHITE);
//        ImmersionBar.with(getActivity())
//                .statusBarDarkFont(true, 0.2f)
//                .statusBarColor("#FFFFFF")
//                //.hideBar(BarHide.FLAG_HIDE_NAVIGATION_BAR)//隐藏底部导航
//                .init();
    }


    public Toolbar setTitle(String title, NavIconType type) {
        ToolbarAdapter mToolbarAdapter = new ToolbarAdapter(getActivity(),title, type);
        mToolbarAdapter.setOnFinishListener(() -> finish());
        loadingHelper.addChildDecorHeader(mToolbarAdapter);
        return mToolbarAdapter.getToolbar();
    }


    @Override
    protected Toolbar createDefaultToolbar() {
        return null;
    }

    protected abstract void initEventAndData();


    @Override
    public void onReload() {

    }
}
