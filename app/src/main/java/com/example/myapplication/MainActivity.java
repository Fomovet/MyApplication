package com.example.myapplication;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;


import com.navigation.androidx.AwesomeActivity;
import com.navigation.androidx.DrawerFragment;
import com.navigation.androidx.NavigationFragment;
import com.navigation.androidx.Style;
import com.navigation.androidx.TabBarFragment;
import com.navigation.androidx.TabBarItem;

public class MainActivity extends AwesomeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (savedInstanceState == null) {

            //TabBarFragment tabBarFragment = new TabBarFragment();


            NavigationFragment navigationFragmentOne = new NavigationFragment();
            navigationFragmentOne.setTabBarItem(new TabBarItem("首页",R.drawable.ic_launcher_background));
            navigationFragmentOne.setRootFragment(new TestFragment());

//
//            NavigationFragment navigationFragmentTwo = new NavigationFragment();
//            navigationFragmentTwo.setTabBarItem(new TabBarItem("工作台",R.drawable.ic_launcher_background));
//            navigationFragmentTwo.setRootFragment(new TestFragmentTwo());
//
//            NavigationFragment navigationFragmentThree= new NavigationFragment();
//            navigationFragmentThree.setTabBarItem(new TabBarItem("SAAS",R.drawable.ic_launcher_background));
//            navigationFragmentThree.setRootFragment(new TestFragmentThree());
//
//
//
//            NavigationFragment navigationFragmentFour =   new NavigationFragment();
//            navigationFragmentFour.setTabBarItem(new TabBarItem("我的",R.drawable.ic_launcher_background));
//            navigationFragmentFour.setRootFragment(new TestFragmentFour());


           // tabBarFragment.setChildFragments(navigationFragmentOne);



            setActivityRootFragment(navigationFragmentOne);
        }
    }

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCustomStyle(@NonNull Style style) {
        style.setSwipeBackEnabled(true);
        style.setScreenBackgroundColor(Color.parseColor("#FFFFFFFF"));
        style.setStatusBarColor(Color.parseColor("#FFFFFFFF"));
        style.setNavigationBarColor(Color.parseColor("#FFFFFFFF"));

        style.setToolbarBackgroundColor(Color.parseColor("#FFFFFFFF"));
    }
}