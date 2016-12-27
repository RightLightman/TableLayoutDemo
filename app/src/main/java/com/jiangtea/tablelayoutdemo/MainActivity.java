package com.jiangtea.tablelayoutdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTl;
    private ViewPager mViewPager;
    private ArrayList<MyFramgent> mShowItmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTl = (TabLayout)findViewById(R.id.tl);
        mViewPager = (ViewPager) findViewById(R.id.vp);
        initDate();
    }

    private void initDate() {
//        mTl.addTab(mTl.newTab().setText("体育"));
//        mTl.addTab(mTl.newTab().setText("科技"));
//        mTl.addTab(mTl.newTab().setText("生活"));
//        mTl.addTab(mTl.newTab().setText("教育"));

        //初始化我们viewpager数据
        mShowItmes.add(new MyFramgent("页面01"));
        mShowItmes.add(new MyFramgent("页面02"));
        mShowItmes.add(new MyFramgent("页面03"));
        mShowItmes.add(new MyFramgent("页面04"));

        //viewpager初始化
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

            @Override
            public Fragment getItem(int position) {
                return mShowItmes.get(position);
            }

            @Override
            public int getCount() {
                return mShowItmes.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return  "页签"+position;
            }
        });

        //页签关联我们的viewpager
        mTl.setupWithViewPager(mViewPager);
    }
}
