package com.example.joyal.unlguide.Catelog;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TabHost;

import com.example.joyal.unlguide.Catelog.Group.Chinese;
import com.example.joyal.unlguide.Fragment.NewsContent;
import com.example.joyal.unlguide.R;
import com.example.joyal.unlguide.user.Example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Joyal on 2017/6/16.
 */

public class Other extends Activity {
    private TabHost tabHost;		//声明TabHost组件的对象
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);
        tabHost=(TabHost)findViewById(android.R.id.tabhost);	//获取TabHost对象
        tabHost.setup();	//初始化TabHost组件
        LayoutInflater inflater = LayoutInflater.from(this); 	// 声明并实例化一个LayoutInflater对象
        inflater.inflate(R.layout.othertab1, tabHost.getTabContentView());
        inflater.inflate(R.layout.othertab2, tabHost.getTabContentView());
        tabHost.addTab(tabHost.newTabSpec("tab01")
                .setIndicator("Tools")
                .setContent(R.id.LinearLayout01));   //添加第一个标签页
        tabHost.addTab(tabHost.newTabSpec("tab02")
                .setIndicator("We the People")
                .setContent(R.id.LinearLayout02));  	//添加第二个标签页



        ListView listview = (ListView) findViewById(R.id.listViewo1); // 获取列表视图
        int[] imageId = new int[] { R.drawable.bb, R.drawable.canvas,
                R.drawable.bb, R.drawable.canvas, R.drawable.bb, R.drawable.canvas,
                R.drawable.bb,}; // 定义并初始化保存图片id的数组
        String[] title = new String[] { "GradeBook", "GPA Calculator", "BlackBoard", "Canvans", "MyRed",
                "Bus Tracker", "More" }; // 定义并初始化保存列表项文字的数组
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>(); // 创建一个list集合
        // 通过for循环将图片id和列表项文字放到Map中，并添加到list集合中
        for (int i = 0; i < imageId.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>(); // 实例化Map对象
            map.put("image", imageId[i]);
            map.put("title", title[i]);
            listItems.add(map); // 将map对象添加到List集合中
        }

        SimpleAdapter adapter = new SimpleAdapter(this, listItems,
                R.layout.itemo1, new String[] { "title", "image" }, new int[] {
                R.id.titleo1, R.id.imageo1 }); // 创建SimpleAdapter
        listview.setAdapter(adapter); // 将适配器与ListView关联




        ListView listview2 = (ListView) findViewById(R.id.listViewo2); // 获取列表视图
        int[] imageId2 = new int[] { R.drawable.flag_zh, R.drawable.flag_us,
                R.drawable.flag_ca, R.drawable.flag_jp,R.drawable.flag_ko, R.drawable.flag_en,R.drawable.flag_ge, R.drawable.flag_om, R.drawable.flag_ml, R.drawable.flag_ind}; // 定义并初始化保存图片id的数组
        String[] title2 = new String[] { "Chinese Association", "American Association", "Canadian Association", "Japanese Association", "Korean Association",
                 "UK Association", "German Association" ,"Mid-East Association","Malaysia Association","Indian Association",}; // 定义并初始化保存列表项文字的数组
        List<Map<String, Object>> listItems2 = new ArrayList<Map<String, Object>>(); // 创建一个list集合
        // 通过for循环将图片id和列表项文字放到Map中，并添加到list集合中
        for (int i = 0; i < imageId2.length; i++) {
            Map<String, Object> map2 = new HashMap<String, Object>(); // 实例化Map对象
            map2.put("image", imageId2[i]);
            map2.put("title", title2[i]);
            listItems2.add(map2); // 将map对象添加到List集合中
        }

        SimpleAdapter adapter2 = new SimpleAdapter(this, listItems2,
                R.layout.itemo1, new String[] { "title", "image" }, new int[] {
                R.id.titleo1, R.id.imageo1 }); // 创建SimpleAdapter
        listview2.setAdapter(adapter2); // 将适配器与ListView关联
        listview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(Other.this,Chinese.class));
                        break;
                    case 1:
                        //Uri uri2 = Uri.parse("http://news.unl.edu/newsrooms/today/article/student-led-effort-funds-establishes-green-roof/");
                        //Intent intent2 = new Intent(Other.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        Intent intent2 = new Intent(Other.this,NewsContent.class);
                        intent2.putExtra("url","https://www.facebook.com/UNLincoln/");
                        startActivity(intent2);

                        break;
                    case 2:
                        Uri uri3 = Uri.parse("");
                        ;
                        Intent intent3 = new Intent(Other.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent3.putExtra("url","https://www.facebook.com/UNLincoln/");
                        startActivity(intent3);
                        break;
                    case 3:
                        Uri uri4 = Uri.parse("");
                        Intent intent4 = new Intent(Other.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent4.putExtra("url","https://www.facebook.com/UNLincoln/");

                        startActivity(intent4);
                        break;
                    case 4:
                        Uri uri5 = Uri.parse("http://admissions.unl.edu/Others/on-campus/red-letter-days.aspx");
                        Intent intent5 = new Intent(Other.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent5.putExtra("url","https://www.facebook.com/UNLincoln/");

                        startActivity(intent5);
                        break;
                    case 5:
                        Uri uri6 = Uri.parse("");
                        Intent intent6 = new Intent(Other.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent6.putExtra("url","https://www.facebook.com/UNLincoln/");

                        startActivity(intent6);
                        break;
                    case 6:
                        Uri uri7 = Uri.parse("");
                        Intent intent7 = new Intent(Other.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent7.putExtra("url","https://www.facebook.com/UNLincoln/");

                        startActivity(intent7);
                        break;

                }


            }
        });

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(Other.this,Chinese.class));
                        break;
                    case 1:
                        //Uri uri2 = Uri.parse("http://news.unl.edu/newsrooms/today/article/student-led-effort-funds-establishes-green-roof/");
                        //Intent intent2 = new Intent(Other.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        Intent intent2 = new Intent(Other.this,NewsContent.class);
                        intent2.putExtra("web","http://news.unl.edu/newsrooms/today/article/student-led-effort-funds-establishes-green-roof/");
                        startActivity(intent2);

                        break;
                    case 2:
                        Uri uri3 = Uri.parse("");
                        ;
                        Intent intent3 = new Intent(Other.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent3.putExtra("web","https://blackboard.unl.edu/webapps/login/?action=relogin");
                        startActivity(intent3);
                        break;
                    case 3:
                        Uri uri4 = Uri.parse("");
                        Intent intent4 = new Intent(Other.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent4.putExtra("web","https://login.unl.edu/cas/login?service=https%3A%2F%2Fcanvas.unl.edu%2Flogin%2Fcas");

                        startActivity(intent4);
                        break;
                    case 4:
                        Uri uri5 = Uri.parse("https://myred.nebraska.edu/psp/myred/NBL/HRMS/?cmd=login&languageCd=ZHS&");
                        Intent intent5 = new Intent(Other.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent5.putExtra("web","http://admissions.unl.edu/Others/on-campus/red-letter-days.aspx");

                        startActivity(intent5);
                        break;
                    case 5:
                        Uri uri6 = Uri.parse("");
                        Intent intent6 = new Intent(Other.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent6.putExtra("web","http://getonboard.lincoln.ne.gov/");

                        startActivity(intent6);
                        break;
                    case 6:
                        Uri uri7 = Uri.parse("");
                        Intent intent7 = new Intent(Other.this,NewsContent.class);//tip：跳转网页的方法一定要加http：
                        intent7.putExtra("web","http://www.gobigred.com/");

                        startActivity(intent7);
                        break;

                }


            }
        });



    }
}



