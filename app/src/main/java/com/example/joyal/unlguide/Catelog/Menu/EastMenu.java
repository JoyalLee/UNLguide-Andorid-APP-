package com.example.joyal.unlguide.Catelog.Menu;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.joyal.unlguide.Catelog.Academic;
import com.example.joyal.unlguide.R;
import com.example.joyal.unlguide.user.Agreement;
import com.example.joyal.unlguide.user.Register;

/**
 * Created by Joyal on 2017/6/20.
 */

public class EastMenu extends Activity {
    private int[] imageIda = new int[] { R.drawable.breakfast, R.drawable.lunch,
            R.drawable.dinner, }; // 定义并初始化保存图片id的数组

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu1);
        Gallery gallery = (Gallery) findViewById(R.id.gallerym); // 获取Gallery组件
        /********************** 使用BaseAdapter指定要显示的内容 *****************************/
        BaseAdapter adapter = new BaseAdapter() {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageview; // 声明ImageView的对象
                if (convertView == null) {
                    imageview = new ImageView(EastMenu.this); // 实例化ImageView的对象
                    imageview.setScaleType(ImageView.ScaleType.FIT_CENTER); // 设置缩放方式
                    imageview
                            .setLayoutParams(new Gallery.LayoutParams(1000, 1000));
                    TypedArray typedArray = obtainStyledAttributes(R.styleable.Gallery);
                    imageview.setBackgroundResource(typedArray.getResourceId(
                            R.styleable.Gallery_android_galleryItemBackground,
                            0));
                    imageview.setPadding(5, 0, 5, 0); // 设置ImageView的内边距
                } else {
                    imageview = (ImageView) convertView;
                }
                imageview.setImageResource(imageIda[position]); // 为ImageView设置要显示的图片
                return imageview; // 返回ImageView
            }

            /*
             * 功能：获得当前选项的ID (non-Javadoc)
             *
             * @see android.widget.Adapter#getItemId(int)
             */
            @Override
            public long getItemId(int position) {
                return position;
            }

            /*
             * 功能：获得当前选项 (non-Javadoc)
             *
             * @see android.widget.Adapter#getItem(int)
             */
            @Override
            public Object getItem(int position) {
                return position;
            }

            /*
             * 获得数量 (non-Javadoc)
             *
             * @see android.widget.Adapter#getCount()
             */
            @Override
            public int getCount() {
                return imageIda.length;
            }
        };
        gallery.setAdapter(adapter); // 将适配器与Gallery关联
        /*********************************************************************************/
        gallery.setSelection(imageIda.length / 2); // 让中间的图片选中
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(EastMenu.this,Register.class));break;
                    case 1:
                        startActivity(new Intent(EastMenu.this,Register.class));break;

                    case 2:
                        startActivity(new Intent(EastMenu.this,Register.class));break;



                }
            }
        });

    }
}