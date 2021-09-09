package com.example.myapplication;

import android.os.Bundle;

import com.example.myapplication.base.TestAbility;
import com.gyf.immersionbar.BarHide;
import com.gyf.immersionbar.ImmersionBar;
import com.taoweiji.navigation.Destination;
import com.taoweiji.navigation.NavController;
import com.taoweiji.navigation.NavControllerActivity;
import com.taoweiji.navigation.NavOptions;

public class MainActivity extends NavControllerActivity {

    @Override
    public NavController.Builder createNavControllerBuilder() {
        return new NavController.Builder().defaultDestination(Destination.with(new TestAbility())).defaultNavOptions(NavOptions.NONE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}