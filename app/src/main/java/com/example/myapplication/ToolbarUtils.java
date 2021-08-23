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

package com.example.myapplication;

import android.app.Activity;
import android.view.MenuItem;
import android.view.View;

import androidx.fragment.app.Fragment;

import com.dylanc.loadinghelper.LoadingHelper;
import com.dylanc.loadinghelper.ViewType;
import com.example.myapplication.adapter.NavIconType;
import com.example.myapplication.adapter.ToolbarAdapter;


import kotlin.jvm.functions.Function1;

/**
 * @author Dylan Cai
 */
@SuppressWarnings("UnusedReturnValue")
public class ToolbarUtils {
    public static LoadingHelper setToolbar(Activity activity, Fragment fragment, String title, NavIconType type) {
        LoadingHelper loadingHelper = new LoadingHelper(activity);
        loadingHelper.register(ViewType.TITLE, new ToolbarAdapter(fragment, title, type));
        loadingHelper.setDecorHeader(ViewType.TITLE);
        return loadingHelper;
    }


//  public static LoadingHelper setCustomToolbar(Activity activity, View.OnClickListener onMessageClick, int firstDrawableId, View.OnClickListener onFirstBtnClick, int secondDrawableId, View.OnClickListener onSecondBtnClick) {
//    LoadingHelper loadingHelper = new LoadingHelper(activity);
//    loadingHelper.register(ViewType.TITLE, new CustomHeaderAdapter(onMessageClick, firstDrawableId, onFirstBtnClick, secondDrawableId, onSecondBtnClick));
//    loadingHelper.setDecorHeader(ViewType.TITLE);
//    return loadingHelper;
//  }

//  public static LoadingHelper setScrollingToolbar(Activity activity, String title) {
//    LoadingHelper loadingHelper = new LoadingHelper(activity);
//    loadingHelper.setDecorAdapter(new ScrollingDecorAdapter(title));
//    return loadingHelper;
//  }
}
