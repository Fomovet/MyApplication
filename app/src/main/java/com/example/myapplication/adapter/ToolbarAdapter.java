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
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.dylanc.loadinghelper.LoadingHelper;
import com.example.myapplication.R;
import com.github.fragivity.Fragivity;
import com.gyf.immersionbar.ImmersionBar;
import com.taoweiji.navigation.Ability;


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
    private Activity activity;


    public ToolbarAdapter(Activity activity,String title, NavIconType type) {
        this.title = title;
        this.type = type;
        this.activity = activity;
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
        ImmersionBar.with(activity)
                .titleBar(holder.toolbar)
                .init();

        if (!TextUtils.isEmpty(title)) {
            holder.toolbar.setTitle(title);
        }

        if (type == NavIconType.BACK) {
            holder.toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black);
            holder.toolbar.setNavigationOnClickListener(v -> {
                mOnFinishListener.OnFinishListener();
            });
        } else {
            holder.toolbar.setNavigationIcon(null);
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


    private OnFinishListener mOnFinishListener;

    public interface OnFinishListener {
        void OnFinishListener();
    }

    public void setOnFinishListener(OnFinishListener l) {
        this.mOnFinishListener = l;
    }
}
