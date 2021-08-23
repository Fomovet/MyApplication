package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.github.fragivity.Fragivity;
import com.gyf.immersionbar.BarHide;
import com.gyf.immersionbar.ImmersionBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //设置共同沉浸式样式
        super.onCreate(savedInstanceState);
        ActivityMainBinding mBinDing = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(mBinDing.getRoot());
        if (savedInstanceState == null) {
            NavHostFragment mNavHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.mFragmentContainerView);
            Fragivity.loadRoot(mNavHostFragment, HomeFragment.class);
        }
    }
}