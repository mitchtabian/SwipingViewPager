package com.codingwithmitch.swipingviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.codingwithmitch.swipingviewpager.models.Hat;
import com.codingwithmitch.swipingviewpager.resources.Hats;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // widgets
    private ViewPager mMyViewPager;
    private TabLayout mTabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = findViewById(R.id.tab_layout);
        mMyViewPager = findViewById(R.id.view_pager);

        init();
    }

    private void init(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        Hat[] hats = Hats.getHats();
        for(Hat hat: hats){
            ViewPagerItemFragment fragment = ViewPagerItemFragment.getInstance(hat);
            fragments.add(fragment);
        }
        MyPagerAdapter pagerAdapter = new MyPagerAdapter(getSupportFragmentManager(), fragments);
        mMyViewPager.setAdapter(pagerAdapter);
        mTabLayout.setupWithViewPager(mMyViewPager, true);
    }

}















