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

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.dylanc.loadinghelper.LoadingHelper;
import com.example.myapplication.R;


/**
 * @author Dylan Cai
 */
public class ErrorAdapter extends LoadingHelper.Adapter<ErrorAdapter.ViewHolder> {

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
    return new ViewHolder(inflater.inflate(R.layout.layout_error, parent, false));
  }

  @Override
  public void onBindViewHolder(@NonNull final ViewHolder holder) {
    holder.btnReload.setOnClickListener(v -> {
      if (holder.getOnReloadListener() != null) {
        holder.getOnReloadListener().onReload();
      }
    });
  }

  public static class ViewHolder extends LoadingHelper.ViewHolder {

    private final View btnReload;

    ViewHolder(@NonNull View rootView) {
      super(rootView);
      btnReload = rootView.findViewById(R.id.btn_reload);
    }
  }
}
