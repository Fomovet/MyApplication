package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.adapter.NavIconType;
import com.example.myapplication.databinding.FramgentTestPagerBinding;

/**
 * 该文件或类的作用 :
 * 作者 : Fomovet
 * Email : Fomovet@Gmail.com
 * 创建时间 : 2021/08/23 10:41
 */
public class TestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(FramgentTestPagerBinding.inflate(getLayoutInflater()).getRoot());
        ToolbarUtils.setToolbar(this, null, "test", NavIconType.BACK);
    }
}
