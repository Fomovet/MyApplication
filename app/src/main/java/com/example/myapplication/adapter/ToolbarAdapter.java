/*
 * Copyright (c) 2019. Dylan Cai
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.myapplication.adapter;

import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.dylanc.loadinghelper.LoadingHelper;
import com.example.myapplication.R;
import com.github.fragivity.Fragivity;
import com.gyf.immersionbar.ImmersionBar;


import org.jetbrains.annotations.NotNull;

import kotlin.jvm.functions.Function1;

/**
 * @author Dylan Cai
 */
public class ToolbarAdapter extends LoadingHelper.Adapter<ToolbarAdapter.ViewHolder> {

    private String title;
    private NavIconType type;
    private Toolbar mToolbar;
    private int menuId;
    private Function1<? super MenuItem, Boolean> onMenuItemClick;
    private Fragment mFragment;

    public ToolbarAdapter(Fragment fragment, String title, NavIconType type) {
        this.title = title;
        this.type = type;
        this.mFragment = fragment;
    }

    public ToolbarAdapter(String title, NavIconType type, int menuId, Function1<? super MenuItem, Boolean> onMenuItemClick) {
        this.title = title;
        this.type = type;
        this.menuId = menuId;
        this.onMenuItemClick = onMenuItemClick;
    }

    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NotNull LayoutInflater inflater, @NotNull ViewGroup parent) {
        return new ViewHolder(inflater.inflate(R.layout.layout_toolbar, parent, false));
    }

    @Override
    public void onBindViewHolder(@NotNull ViewHolder holder) {
        if (holder.toolbar != null) {//设置沉浸式
            ImmersionBar.with(mFragment).titleBar(holder.toolbar).init();
        }


        if (!TextUtils.isEmpty(title)) {
            holder.toolbar.setTitle(title);
        }

        if (type == NavIconType.BACK) {
            holder.toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black);
            holder.toolbar.setNavigationOnClickListener(v -> {
                Fragivity.of(mFragment).pop();
                //holder.getActivity().finish();
            });
        } else {
            holder.toolbar.setNavigationIcon(null);
        }

        if (menuId > 0 && onMenuItemClick != null) {
            holder.toolbar.inflateMenu(menuId);
            holder.toolbar.setOnMenuItemClickListener(item -> onMenuItemClick.invoke(item));
        }
    }

    public class ViewHolder extends LoadingHelper.ViewHolder {

        public Toolbar toolbar;

        ViewHolder(@NonNull View rootView) {
            super(rootView);
            toolbar = (Toolbar) rootView;
        }

        private Activity getActivity() {
            return (Activity) getRootView().getContext();
        }
    }

    public Toolbar getToolbar() {
        return mToolbar;
    }
}
