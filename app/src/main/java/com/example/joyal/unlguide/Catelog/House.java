package com.example.joyal.unlguide.Catelog;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.joyal.unlguide.R;
import com.example.joyal.unlguide.Web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Joyal on 2017/6/16.
 */

public class House extends Activity {
    /** Called when the activity is first created. */
    private int[] imageId = new int[] { R.drawable.hall_abel_0, R.drawable.hallburr,
            R.drawable.hallfedde, R.drawable.hallcourtyards_0, R.drawable.halleastside,
            R.drawable.hallharper_0, R.drawable.hallknoll, R.drawable.halllove,
            R.drawable.hallsandoz_0, R.drawable.hallselleck, R.drawable.hallvillage_0,
            R.drawable.hallusuites_0, }; // 定义并初始化保存图片id的数组
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.house);
        GridView gridview = (GridView) findViewById(R.id.gridView1); // 获取GridView组件

        String[] title = new String[]{"Abel", "Burr", "Fedde", "Courtyard", "East side",
                "Harper", "Knoll", "Love", "Sandoz", "Selleck", "Village", "University suites"}; // 定义并初始化保存说明文字的数组
        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();// 创建一个list集合
        // 通过for循环将图片id和列表项文字放到Map中，并添加到list集合中
        for (int i = 0; i < imageId.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", imageId[i]);
            map.put("title", title[i]);
            listItems.add(map); // 将map对象添加到List集合中
        }

        SimpleAdapter adapter = new SimpleAdapter(this,
                listItems,
                R.layout.houseitem,
                new String[]{"title", "image"},
                new int[]{R.id.titleh, R.id.imageh}
        ); // 创建SimpleAdapter
        gridview.setAdapter(adapter); // 将适配器与GridView关联

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(House.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent.putExtra("web","http://housing.unl.edu/abel-hall");
                        startActivity(intent);
//                        Uri uri = Uri.parse("");
//                        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
//                        startActivity(intent);
                        Toast.makeText(House.this,
                                "You've choosed Abel",
                                Toast.LENGTH_SHORT).show();break;
                    case 1:
                        Intent intent1 = new Intent(House.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent1.putExtra("web","http://housing.unl.edu/burr-hall");
                        startActivity(intent1);
//                        Uri uri1 = Uri.parse("");
//                        Intent intent1 = new Intent(Intent.ACTION_VIEW,uri1);
//                        startActivity(intent1);
                        Toast.makeText(House.this,
                                "You've choosed Burr",
                                Toast.LENGTH_SHORT).show();break;
                    case 2:
                        Intent intent2 = new Intent(House.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent2.putExtra("web","http://housing.unl.edu/fedde-hall");
                        startActivity(intent2);
//                        Uri uri2 = Uri.parse("");
//                        Intent intent2 = new Intent(Intent.ACTION_VIEW,uri2);
//                        startActivity(intent2);
                        Toast.makeText(House.this,
                                "You've choosed Fedde",
                                Toast.LENGTH_SHORT).show();break;
                    case 3:
                        Intent intent3 = new Intent(House.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent3.putExtra("web","http://housing.unl.edu/courtyards");
                        startActivity(intent3);
//                        Uri uri3 = Uri.parse("");
//                        Intent intent3 = new Intent(Intent.ACTION_VIEW,uri3);
//                        startActivity(intent3);
                        Toast.makeText(House.this,
                                "You've choosed Courtyards",
                                Toast.LENGTH_SHORT).show();break;
                    case 4:
                        Intent intent4 = new Intent(House.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent4.putExtra("web","http://housing.unl.edu/eastside-suites");
                        startActivity(intent4);
//                        Uri uri4 = Uri.parse("");
//                        Intent intent4 = new Intent(Intent.ACTION_VIEW,uri4);
//                        startActivity(intent4);
                        Toast.makeText(House.this,
                                "You've choosed Eastside",
                                Toast.LENGTH_SHORT).show();break;
                    case 5:  Intent intent5 = new Intent(House.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent5.putExtra("web","http://housing.unl.edu/harper-hall");
                        startActivity(intent5);
//                        Uri uri5 = Uri.parse("");
//                        Intent intent5 = new Intent(Intent.ACTION_VIEW,uri5);
//                        startActivity(intent5);
                        Toast.makeText(House.this,
                                "You've choosed Harper",
                                Toast.LENGTH_SHORT).show();break;
                    case 6:
//                        Uri uri6 = Uri.parse("");
//                        Intent intent6 = new Intent(Intent.ACTION_VIEW,uri6);
//                        startActivity(intent6);
                        Intent intent6 = new Intent(House.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent6.putExtra("web","http://housing.unl.edu/robert-e-knoll-residential-center");
                        startActivity(intent6);
                        Toast.makeText(House.this,
                                "You've choosed Knoll",
                                Toast.LENGTH_SHORT).show();break;
                    case 7:
                        Intent intent7 = new Intent(House.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent7.putExtra("web","http://housing.unl.edu/love-memorial-hall");
                        startActivity(intent7);
//                        Uri uri7 = Uri.parse("");
//                        Intent intent7 = new Intent(Intent.ACTION_VIEW,uri7);
//                        startActivity(intent7);


                        Toast.makeText(House.this,
                                "You've choosed Love me",
                                Toast.LENGTH_SHORT).show();break;
                    case 8:
                        Intent intent8 = new Intent(House.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent8.putExtra("web","http://housing.unl.edu/sandoz-hall");
                        startActivity(intent8);
//                        Uri uri8 = Uri.parse("");
//                        Intent intent8 = new Intent(Intent.ACTION_VIEW,uri8);
//                        startActivity(intent8);
                        Toast.makeText(House.this,
                                "You've choosed Sandoz",
                                Toast.LENGTH_SHORT).show();break;
                    case 9:  Intent intent9 = new Intent(House.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent9.putExtra("web","http://housing.unl.edu/selleck-quadrangle");
                        startActivity(intent9);
//                        Uri uri9 = Uri.parse("");
//                        Intent intent9 = new Intent(Intent.ACTION_VIEW,uri9);
//                        startActivity(intent9);
                        Toast.makeText(House.this,
                                "You've choosed Selleck",
                                Toast.LENGTH_SHORT).show();break;
                    case 10:
                        Intent intent10 = new Intent(House.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent10.putExtra("web","http://housing.unl.edu/village");
                        startActivity(intent10);
//                        Uri uri10 = Uri.parse("");
//                        Intent intent10 = new Intent(Intent.ACTION_VIEW,uri10);
//                        startActivity(intent10);
                        Toast.makeText(House.this,
                                "You've choosed Village",
                                Toast.LENGTH_SHORT).show();break;
                    case 11:

                        Intent intent11 = new Intent(House.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent11.putExtra("web","http://housing.unl.edu/university-suites");
                        startActivity(intent11);

//                        Uri uri11 = Uri.parse("");
//                        Intent intent11 = new Intent(Intent.ACTION_VIEW,uri11);
//                        startActivity(intent11);
//
//
                        Toast.makeText(House.this,
                                "You've choosed University Suites Style",
                                Toast.LENGTH_SHORT).show();
                        break;

                }


            }
        });
    }
}
