package com.example.joyal.unlguide.Catelog;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.joyal.unlguide.Fragment.NewsContent;
import com.example.joyal.unlguide.R;
import com.example.joyal.unlguide.Web;
import com.example.joyal.unlguide.user.Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Joyal on 2017/6/16.
 */

public class Event extends Activity{
    private int[] imageId = new int[] { R.drawable.news1, R.drawable.news2,
            R.drawable.news3, R.drawable.news4 }; // 定义并初始化保存图片id的数组
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event);
        GridView gridview = (GridView) findViewById(R.id.gridViewe); // 获取GridView组件

//        String[] title = new String[]{"Abel", "Burr", "Fedde", "Courtyard"}; // 定义并初始化保存说明文字的数组
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();// 创建一个list集合
        // 通过for循环将图片id和列表项文字放到Map中，并添加到list集合中
        for (int i = 0; i < imageId.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", imageId[i]);
//            map.put("title", title[i]);
            listItems.add(map); // 将map对象添加到List集合中
        }

        SimpleAdapter adapter = new SimpleAdapter(this,
                listItems,
                R.layout.eventitem,
                new String[]{ "image"},
                new int[]{ R.id.imagee}
        ); // 创建SimpleAdapter
        gridview.setAdapter(adapter); // 将适配器与GridView关联

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(Event.this,Example.class));
                        break;
                    case 1:
                        //Uri uri2 = Uri.parse("http://news.unl.edu/newsrooms/today/article/student-led-effort-funds-establishes-green-roof/");
                        //Intent intent2 = new Intent(Event.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        Intent intent2 = new Intent(Event.this,NewsContent.class);
                        intent2.putExtra("url","http://news.unl.edu/newsrooms/today/article/student-led-effort-funds-establishes-green-roof/");
                        startActivity(intent2);

                        break;
                    case 2:
                        Uri uri3 = Uri.parse("");
                        ;
                        Intent intent3 = new Intent(Event.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent3.putExtra("url","http://news.unl.edu/newsrooms/today/article/huskers-come-out-in-force-for-burr-fedde-reunion/");
                        startActivity(intent3);
                        break;
                    case 3:
                        Uri uri4 = Uri.parse("");
                        Intent intent4 = new Intent(Event.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent4.putExtra("url","http://news.unl.edu/newsrooms/today/article/the-four-paths-to-heroism/");

                        startActivity(intent4);
                        break;
                    case 4:
                        Uri uri5 = Uri.parse("http://admissions.unl.edu/events/on-campus/red-letter-days.aspx");
                        Intent intent5 = new Intent(Event.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent5.putExtra("url","http://admissions.unl.edu/events/on-campus/red-letter-days.aspx");

                        startActivity(intent5);
                        break;
                    case 5:
                        Uri uri6 = Uri.parse("");
                        Intent intent6 = new Intent(Event.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent6.putExtra("url","http://admissions.unl.edu/events/on-campus.aspx");

                        startActivity(intent6);
                        break;
                    case 6:
                        Uri uri7 = Uri.parse("");
                        Intent intent7 = new Intent(Event.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent7.putExtra("url","http://www.gobigred.com/");

                        startActivity(intent7);
                        break;

                }


            }
        });


        ListView listview2 = (ListView) findViewById(R.id.listViewe); // 获取列表视图
        int[] imageId2 = new int[] {  R.drawable.news1,R.drawable.news2,R.drawable.news3,R.drawable.news4,R.drawable.news5}; // 定义并初始化保存图片id的数组
        String[] title2 = new String[] { "Chancellor Green to be awarded national association's highest honor","Student-led effort funds, establishes green roof","Huskers come out in force for Burr-Fedde reunion","The four paths to heroism","Experience for yourself what life is like as a student at NEBRASKA. "}; // 定义并初始化保存列表项文字的数组
        List<Map<String, Object>> listItems2 = new ArrayList<Map<String, Object>>(); // 创建一个list集合
        // 通过for循环将图片id和列表项文字放到Map中，并添加到list集合中
        for (int i = 0; i < imageId2.length; i++) {
            Map<String, Object> map2 = new HashMap<String, Object>(); // 实例化Map对象
            map2.put("image", imageId2[i]);
            map2.put("title", title2[i]);
            listItems2.add(map2); // 将map对象添加到List集合中
        }

        SimpleAdapter adapter2 = new SimpleAdapter(this, listItems2,
                R.layout.eventitem2, new String[] { "title", "image" }, new int[] {
                R.id.titlee2, R.id.imagee2 }); // 创建SimpleAdapter
        listview2.setAdapter(adapter2); // 将适配器与ListView关联


       listview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(Event.this,Example.class));
                        break;
                    case 1:
                        //Uri uri2 = Uri.parse("http://news.unl.edu/newsrooms/today/article/student-led-effort-funds-establishes-green-roof/");
                        //Intent intent2 = new Intent(Event.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        Intent intent2 = new Intent(Event.this,NewsContent.class);
                        intent2.putExtra("url","http://news.unl.edu/newsrooms/today/article/student-led-effort-funds-establishes-green-roof/");
                        startActivity(intent2);

                        break;
                    case 2:
                        Uri uri3 = Uri.parse("");
                        ;
                        Intent intent3 = new Intent(Event.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent3.putExtra("url","http://news.unl.edu/newsrooms/today/article/huskers-come-out-in-force-for-burr-fedde-reunion/");
                        startActivity(intent3);
                        break;
                    case 3:
                        Uri uri4 = Uri.parse("");
                        Intent intent4 = new Intent(Event.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent4.putExtra("url","http://news.unl.edu/newsrooms/today/article/the-four-paths-to-heroism/");

                        startActivity(intent4);
                        break;
                    case 4:
                        Uri uri5 = Uri.parse("http://admissions.unl.edu/events/on-campus/red-letter-days.aspx");
                        Intent intent5 = new Intent(Event.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent5.putExtra("url","http://admissions.unl.edu/events/on-campus/red-letter-days.aspx");

                        startActivity(intent5);
                        break;
                    case 5:
                        Uri uri6 = Uri.parse("");
                        Intent intent6 = new Intent(Event.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent6.putExtra("url","http://admissions.unl.edu/events/on-campus.aspx");

                        startActivity(intent6);
                        break;
                    case 6:
                        Uri uri7 = Uri.parse("");
                        Intent intent7 = new Intent(Event.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent7.putExtra("url","http://www.gobigred.com/");

                        startActivity(intent7);
                        break;

                }


            }
        });










    }


}
