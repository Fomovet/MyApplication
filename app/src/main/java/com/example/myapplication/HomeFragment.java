package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.myapplication.databinding.FragmentHomeBinding;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class HomeFragment extends Fragment {


    private ArrayList<Fragment> fragments;
    private FragmentHomeBinding mBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = FragmentHomeBinding.inflate(getLayoutInflater());
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mBinding.mViewPager2.setAdapter(new MyAdapter(this));
        mBinding.mViewPager2.setUserInputEnabled(false);//设置不可滑动

        fragments = new ArrayList<>();
        fragments.add(new TestFragmentOne());
        fragments.add(new TestFragmentTwo());
        fragments.add(new TestFragmentThree());
        fragments.add(new TestFragmentFour());

        mBinding.mRadioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId) {
                case R.id.mRadioButton_one:
                    mBinding.mViewPager2.setCurrentItem(0, false);//第二个参数是禁止Viewpager切换动画
                    break;
                case R.id.mRadioButton_two:
                    mBinding.mViewPager2.setCurrentItem(1, false);
                    break;
                case R.id.mRadioButton_three:
                    mBinding.mViewPager2.setCurrentItem(2, false);
                    break;
                case R.id.mRadioButton_four:
                    mBinding.mViewPager2.setCurrentItem(3, false);
                    break;
            }
        });
    }

    @Override
    public void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    private class MyAdapter extends FragmentStateAdapter {

        public MyAdapter(@NonNull Fragment fragment) {
            super(fragment);
        }


        @Override
        public Fragment createFragment(int position) {
            return fragments.get(position);
        }

        @Override
        public int getItemCount() {
            return 4;
        }
    }
}
