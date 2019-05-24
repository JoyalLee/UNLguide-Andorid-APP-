package com.example.joyal.unlguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.joyal.unlguide.Fragment.CataFrag;
import com.example.joyal.unlguide.Fragment.HomeFrag;
import com.example.joyal.unlguide.Fragment.InfoFrag;
import com.example.joyal.unlguide.Fragment.SearchFrag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Joyal on 2017/6/7.
 */

public class Home extends FragmentActivity implements View.OnClickListener{
    private ViewPager myviewpager;
    private LinearLayout mtabhome;
    private LinearLayout mtabcate;
    private LinearLayout mtabsearch;
    private LinearLayout mtabinfo;
    private ImageButton mpichome;
    private ImageButton mpiccate;
    private ImageButton mpicsearch;
    private ImageButton mpicinfo;
    private FragmentPagerAdapter madapter;
    private List<Fragment> mfragments;



    private Fragment hometab;
    private Fragment othertab;
    private Fragment tooltab;



    private PagerAdapter adapter;






    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.home);

        initView();
        initEvents();

        setSelect(0);




    }




    private void initEvents(){
        mtabhome.setOnClickListener(this);
        mtabcate.setOnClickListener(this);
        mtabsearch.setOnClickListener(this);
        mtabinfo.setOnClickListener(this);

    }


    private void initView(){
        myviewpager = (ViewPager) findViewById(R.id.viewpager);
        mtabhome =(LinearLayout) findViewById(R.id.tab_ic_home);
        mtabcate =(LinearLayout) findViewById(R.id.tab_ic_catalog);
        mtabsearch =(LinearLayout) findViewById(R.id.tab_ic_search);
        mtabinfo =(LinearLayout) findViewById(R.id.tab_ic_info);
        mpichome=(ImageButton)findViewById(R.id.home_ic) ;
        mpiccate=(ImageButton)findViewById(R.id.catalog_ic) ;
        mpicsearch=(ImageButton)findViewById(R.id.search_ic) ;
        mpicinfo=(ImageButton)findViewById(R.id.info_ic) ;


        mfragments = new ArrayList<Fragment>();
//
        Fragment mtab1 = new HomeFrag();
        Fragment mtab2= new CataFrag();
        Fragment mtab3= new SearchFrag();
        Fragment mtab4= new InfoFrag();
        mfragments.add(mtab1);
        mfragments.add(mtab2);
        mfragments.add(mtab3);
        mfragments.add(mtab4);

        madapter=new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mfragments.get(position);
            }

            @Override
            public int getCount() {
                return mfragments.size();
            }
        };
        myviewpager.setAdapter(madapter);
        myviewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                int currentItem = myviewpager.getCurrentItem();
                setTab(currentItem);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {

            case R.id.tab_ic_home:
                setSelect(0);

                break;
            case R.id.tab_ic_catalog:
                setSelect(1);

                break;
            case R.id.tab_ic_search:
                setSelect(2);

                break;
            case R.id.tab_ic_info:
                setSelect(3);

                break;
            default:break;
        }

    }
    private void setSelect(int i){



        setTab(i);
        myviewpager.setCurrentItem(i);
    }



    private void resetImg(){
        mpichome.setImageResource(R.drawable.home_ic);
        mpiccate.setImageResource(R.drawable.cate_ic);
        mpicsearch.setImageResource(R.drawable.search_ic);
        mpicinfo.setImageResource(R.drawable.info_ic);
    }
    private void setTab(int i){                 //重置Tab方法
        resetImg();
        //图票变亮 pressed
        switch (i){
            case 0 :
                mpichome.setImageResource(R.drawable.home_ic_press);break;
            case 1 :
                mpiccate.setImageResource(R.drawable.cate_ic_press);break;
            case 2 :
                mpicsearch.setImageResource(R.drawable.search_ic_press);break;
            case 3 :
                mpicinfo.setImageResource(R.drawable.info_ic_press);break;

        }
    }
}
