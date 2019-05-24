package com.example.joyal.unlguide.Catelog;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.joyal.unlguide.R;

/**
 * Created by Joyal on 2017/6/16.
 */

public class Building extends Activity {

    private int[] imageIdh = new int[] { R.drawable.cba, R.drawable.avery,
            R.drawable.union, R.drawable.andrews,R.drawable.morrill_hall,
            R.drawable.jorgensenhall, R.drawable.seaton, R.drawable.burnett,
            R.drawable.stadum }; // 定义并初始化保存图片id的数组

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.building);
        Gallery gallery = (Gallery) findViewById(R.id.gallery1); // 获取Gallery组件
        /********************** 使用BaseAdapter指定要显示的内容 *****************************/
        BaseAdapter adapter = new BaseAdapter() {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageview; // 声明ImageView的对象
                if (convertView == null) {
                    imageview = new ImageView(Building.this); // 实例化ImageView的对象
                    imageview.setScaleType(ImageView.ScaleType.CENTER); // 设置缩放方式
                    imageview
                            .setLayoutParams(new Gallery.LayoutParams(600, 500));
                    TypedArray typedArray = obtainStyledAttributes(R.styleable.Gallery);
                    imageview.setBackgroundResource(typedArray.getResourceId(
                            R.styleable.Gallery_android_galleryItemBackground,
                            0));
                    imageview.setPadding(5, 0, 5, 0); // 设置ImageView的内边距
                } else {
                    imageview = (ImageView) convertView;
                }
                imageview.setImageResource(imageIdh[position]); // 为ImageView设置要显示的图片
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
                return imageIdh.length;
            }
        };
        gallery.setAdapter(adapter); // 将适配器与Gallery关联
        /*********************************************************************************/
        gallery.setSelection(imageIdh.length / 2); // 让中间的图片选中
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                TextView t1 = (TextView)findViewById(R.id.building1);
                TextView t2 = (TextView)findViewById(R.id.building2);
                TextView t3 = (TextView)findViewById(R.id.building3);
                TextView t4 = (TextView)findViewById(R.id.building4);
                TextView t5 = (TextView)findViewById(R.id.building5);
                TextView t6 = (TextView)findViewById(R.id.building6);
                TextView t7 = (TextView)findViewById(R.id.building7);
                TextView t8 = (TextView)findViewById(R.id.building8);
                TextView t9 = (TextView)findViewById(R.id.building9);

                switch (position){
                    case 0:
                        t1.setVisibility(View.VISIBLE);
                        t2.setVisibility(View.GONE);
                        t3.setVisibility(View.GONE);
                        t4.setVisibility(View.GONE);
                        t5.setVisibility(View.GONE);
                        t6.setVisibility(View.GONE);
                        t7.setVisibility(View.GONE);
                        t8.setVisibility(View.GONE);
                        t9.setVisibility(View.GONE);
                        break;
                    case 1:
                        t2.setVisibility(View.VISIBLE);
                        t1.setVisibility(View.GONE);
                        t3.setVisibility(View.GONE);
                        t4.setVisibility(View.GONE);
                        t5.setVisibility(View.GONE);
                        t6.setVisibility(View.GONE);
                        t7.setVisibility(View.GONE);
                        t8.setVisibility(View.GONE);
                        t9.setVisibility(View.GONE);
                        break;
                    case 2:
                        t3.setVisibility(View.VISIBLE);
                        t2.setVisibility(View.GONE);
                        t1.setVisibility(View.GONE);
                        t4.setVisibility(View.GONE);
                        t5.setVisibility(View.GONE);
                        t6.setVisibility(View.GONE);
                        t7.setVisibility(View.GONE);
                        t8.setVisibility(View.GONE);
                        t9.setVisibility(View.GONE);
                        break;
                    case 3:
                        t4.setVisibility(View.VISIBLE);
                        t2.setVisibility(View.GONE);
                        t3.setVisibility(View.GONE);
                        t1.setVisibility(View.GONE);
                        t5.setVisibility(View.GONE);
                        t6.setVisibility(View.GONE);
                        t7.setVisibility(View.GONE);
                        t8.setVisibility(View.GONE);
                        t9.setVisibility(View.GONE);
                        break;
                    case 4:
                        t5.setVisibility(View.VISIBLE);
                        t2.setVisibility(View.GONE);
                        t3.setVisibility(View.GONE);
                        t4.setVisibility(View.GONE);
                        t1.setVisibility(View.GONE);
                        t6.setVisibility(View.GONE);
                        t7.setVisibility(View.GONE);
                        t8.setVisibility(View.GONE);
                        t9.setVisibility(View.GONE);
                        break;
                    case 5:
                        t6.setVisibility(View.VISIBLE);
                        t2.setVisibility(View.GONE);
                        t3.setVisibility(View.GONE);
                        t4.setVisibility(View.GONE);
                        t5.setVisibility(View.GONE);
                        t1.setVisibility(View.GONE);
                        t7.setVisibility(View.GONE);
                        t8.setVisibility(View.GONE);
                        t9.setVisibility(View.GONE);
                        break;
                    case 6:
                        t7.setVisibility(View.VISIBLE);
                        t2.setVisibility(View.GONE);
                        t3.setVisibility(View.GONE);
                        t4.setVisibility(View.GONE);
                        t5.setVisibility(View.GONE);
                        t6.setVisibility(View.GONE);
                        t1.setVisibility(View.GONE);
                        t8.setVisibility(View.GONE);
                        t9.setVisibility(View.GONE);
                        break;
                    case 7:
                        t8.setVisibility(View.VISIBLE);
                        t2.setVisibility(View.GONE);
                        t3.setVisibility(View.GONE);
                        t4.setVisibility(View.GONE);
                        t5.setVisibility(View.GONE);
                        t6.setVisibility(View.GONE);
                        t7.setVisibility(View.GONE);
                        t1.setVisibility(View.GONE);
                        t9.setVisibility(View.GONE);
                        break;
                    case 8:
                        t9.setVisibility(View.VISIBLE);
                        t2.setVisibility(View.GONE);
                        t3.setVisibility(View.GONE);
                        t4.setVisibility(View.GONE);
                        t5.setVisibility(View.GONE);
                        t6.setVisibility(View.GONE);
                        t7.setVisibility(View.GONE);
                        t8.setVisibility(View.GONE);
                        t1.setVisibility(View.GONE);
                        break;
                }





            }
        });

    }
}
