package com.example.joyal.unlguide.Fragment;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.joyal.unlguide.Catelog.Event;
import com.example.joyal.unlguide.Catelog.Lib;
import com.example.joyal.unlguide.R;
import com.example.joyal.unlguide.Webpage;
import com.example.joyal.unlguide.user.Agreement;
import com.example.joyal.unlguide.user.Example;
import com.example.joyal.unlguide.user.Login;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Joyal on 2017/6/14.
 */

public class HomeFrag extends Fragment {
    private ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab01,container,false);
        listView=(ListView)view.findViewById(R.id.Home_list);


        List<Map<String,Object>> list =getData();
        listView.setAdapter(new ListAD(getActivity(), list));

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageView unlnews = (ImageView) getActivity().findViewById(R.id.unlnews);
        unlnews.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Event.class));
            }
        });
        TextView more = (TextView) getActivity().findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Event.class));
            }
        });


        ImageView map = (ImageView) getActivity().findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                Uri uri2 = Uri.parse("http://cn.bing.com/ditu/?q=University+of+Nebraska-Lincoln&mkt=zh&FORM=HDRSC8");
                Intent intent2 = new Intent(getActivity(), Webpage.class);//tip：跳转网页的方法一定要加http：
                intent2.putExtra("map","http://cn.bing.com/ditu/?q=University+of+Nebraska-Lincoln&mkt=zh&FORM=HDRSC8");
                startActivity(intent2);
            }
        });
        ImageView contact = (ImageView) getActivity().findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri uri2 = Uri.parse("https://www.facebook.com/UNLincoln/");
                Intent intent2 = new Intent(Intent.ACTION_VIEW,uri2);//tip：跳转网页的方法一定要加http：
                startActivity(intent2);
            }
        });


        RollPagerView mRollViewPager = (RollPagerView)getActivity().findViewById(R.id.lunbo);

        //设置播放时间间隔
        mRollViewPager.setPlayDelay(3000);
        //设置透明度
        mRollViewPager.setAnimationDurtion(500);
        //设置适配器
        mRollViewPager.setAdapter(new TestNormalAdapter());

        //设置指示器（顺序依次）
        //自定义指示器图片
        //设置圆点指示器颜色
        //设置文字指示器
        //隐藏指示器
        //mRollViewPager.setHintView(new IconHintView(this, R.drawable.point_focus, R.drawable.point_normal));
        mRollViewPager.setHintView(new ColorPointHintView(getActivity(), Color.YELLOW, Color.WHITE));
        ListItemClick();


    }


    private class TestNormalAdapter extends StaticPagerAdapter {
        private int[] imgs = {
                R.drawable.bigred,
                R.mipmap.welcome_lunbo,
                R.drawable.lunbo8,
                R.drawable.event_lunbo,
                R.drawable.bigred,
        };

        @Override
        public View getView(ViewGroup container, int position) {
            ImageView view = new ImageView(container.getContext());
            view.setImageResource(imgs[position]);
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            return view;
        }


        @Override
        public int getCount() {
            return imgs.length;
        }
    }

    public void ListItemClick(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(getActivity(),Example.class));
                        break;
                    case 1:
                        //Uri uri2 = Uri.parse("http://news.unl.edu/newsrooms/today/article/student-led-effort-funds-establishes-green-roof/");
                        //Intent intent2 = new Intent(getActivity(),NewsContent.class);//tip：跳转网页的方法一定要加http：
                        Intent intent2 = new Intent(getActivity(),NewsContent.class);
                        intent2.putExtra("url","http://news.unl.edu/newsrooms/today/article/student-led-effort-funds-establishes-green-roof/");
                        startActivity(intent2);

                        break;
                    case 2:
                        Uri uri3 = Uri.parse("");
                       ;
                        Intent intent3 = new Intent(getActivity(),NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent3.putExtra("url","http://news.unl.edu/newsrooms/today/article/huskers-come-out-in-force-for-burr-fedde-reunion/");
                        startActivity(intent3);
                        break;
                    case 3:
                        Uri uri4 = Uri.parse("");
                        Intent intent4 = new Intent(getActivity(),NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent4.putExtra("url","http://news.unl.edu/newsrooms/today/article/the-four-paths-to-heroism/");

                        startActivity(intent4);
                        break;
                    case 4:
                        Uri uri5 = Uri.parse("http://admissions.unl.edu/events/on-campus/red-letter-days.aspx");
                        Intent intent5 = new Intent(getActivity(),NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent5.putExtra("url","http://admissions.unl.edu/events/on-campus/red-letter-days.aspx");

                        startActivity(intent5);
                        break;
                    case 5:
                        Uri uri6 = Uri.parse("");
                        Intent intent6 = new Intent(getActivity(),NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent6.putExtra("url","http://admissions.unl.edu/events/on-campus.aspx");

                        startActivity(intent6);
                        break;
                    case 6:
                        Uri uri7 = Uri.parse("");
                        Intent intent7 = new Intent(getActivity(),NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent7.putExtra("url","http://www.gobigred.com/");

                        startActivity(intent7);
                        break;
                }
            }
        });
    }

    public List<Map<String,Object>> getData() {
        int[] imageId = new int[] { R.drawable.news1,R.drawable.news2,R.drawable.news3,R.drawable.news4,R.drawable.news5,R.drawable.facility_ic,R.drawable.bigred2,}; // 定义并初始化保存图片id的数组
        String[] title = new String[] { "Chancellor Green to be awarded national association's highest honor","Student-led effort funds, establishes green roof","Huskers come out in force for Burr-Fedde reunion","The four paths to heroism","Experience for yourself what life is like as a student at NEBRASKA. ","Campus tour","BIG RED!" }; // 定义并初始化保存列表项文字的数组
        String[] info = new String[] {"2017.6.13 Tuesday MBA","2017.6.15 Thursday Agriculture","2017.6.16 Friday Event","2017.6.18 Sunday Article","2017.6.19 Monday Health","2017.6.22 Thursday Visitor","2017.6.24 Sunday Sports",};

                List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        for(int i = 0; i<imageId.length; i++){
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("gamepic",imageId[i]);
            map.put("gametitle",title[i]);
            map.put("gameinfo",info[i]);
            list.add(map);
        }
        return list;
    }
}
