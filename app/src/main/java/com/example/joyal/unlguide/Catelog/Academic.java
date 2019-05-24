package com.example.joyal.unlguide.Catelog;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.joyal.unlguide.R;
import com.example.joyal.unlguide.Web;
import com.example.joyal.unlguide.Webpage;

/**
 * Created by Joyal on 2017/6/16.
 */

public class Academic extends Activity {
    private int[] imageIda = new int[] { R.drawable.major11, R.drawable.major22,
            R.drawable.major33, R.drawable.major44, R.drawable.major55,
            R.drawable.major66, R.drawable.major77, R.drawable.major88,
            R.drawable.major99 }; // 定义并初始化保存图片id的数组

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.major);
        Gallery gallery = (Gallery) findViewById(R.id.gallery2); // 获取Gallery组件
        /********************** 使用BaseAdapter指定要显示的内容 *****************************/
        BaseAdapter adapter = new BaseAdapter() {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageview; // 声明ImageView的对象
                if (convertView == null) {
                    imageview = new ImageView(Academic.this); // 实例化ImageView的对象
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
//                    case 0: Uri uri = Uri.parse("");
//                        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                    case 0:
                        Intent intent = new Intent(Academic.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent.putExtra("web","http://casnr.unl.edu");
                        startActivity(intent);


//                    Intent intent = new Intent(Academic.this, Webpage.class);//tip：跳转网页的方法一定要加http：
//                    intent.putExtra("web","");
//
//                        startActivity(intent);
                        Toast.makeText(Academic.this,
                                " AGRICULTURAL SCIENCES & NATURAL RESOURCES",
                                Toast.LENGTH_SHORT).show();break;
                    case 1:
                        Intent intent1 = new Intent(Academic.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent1.putExtra("web","http://architecture.unl.edu/");
                        startActivity(intent1);
//                        Uri uri1 = Uri.parse("");
//                        Intent intent1 = new Intent(Intent.ACTION_VIEW,uri1);
//                        startActivity(intent1);
                        Toast.makeText(Academic.this,
                                " ARCHITECTURE",
                                Toast.LENGTH_SHORT).show();break;

                    case 2:
                        Intent intent2 = new Intent(Academic.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent2.putExtra("web","http://cas.unl.edu/");
                        startActivity(intent2);
//                        Uri uri2= Uri.parse("http://cas.unl.edu/");
//                    Intent intent2 = new Intent(Intent.ACTION_VIEW,uri2);
//                    startActivity(intent2);
                    Toast.makeText(Academic.this,
                            " Art and Science",
                            Toast.LENGTH_SHORT).show();break;
                    case 3:
                        Intent intent3 = new Intent(Academic.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent3.putExtra("web","http://cba.unl.edu/");
                        startActivity(intent3);
//                        Uri uri3 = Uri.parse("http://cba.unl.edu/");
//                    Intent intent3 = new Intent(Intent.ACTION_VIEW,uri3);
//                    startActivity(intent3);
                    Toast.makeText(Academic.this,
                            " BUSINESS",
                            Toast.LENGTH_SHORT).show();break;
                    case 4:
                        Intent intent4 = new Intent(Academic.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent4.putExtra("web","http://cehs.unl.edu/");
                        startActivity(intent4);
//                        Uri uri4 = Uri.parse("http://cehs.unl.edu/");
//                    Intent intent4 = new Intent(Intent.ACTION_VIEW,uri4);
//                    startActivity(intent4);
                    Toast.makeText(Academic.this,
                            " EDUCATION & HUMAN SCIENCES",
                            Toast.LENGTH_SHORT).show();break;
                    case 5:
                        Intent intent5 = new Intent(Academic.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent5.putExtra("web","http://engineering.unl.edu/");
                        startActivity(intent5);
//                        Uri uri5 = Uri.parse("http://engineering.unl.edu/");
//                    Intent intent5 = new Intent(Intent.ACTION_VIEW,uri5);
//                    startActivity(intent5);
                    Toast.makeText(Academic.this,
                            " ENGINEERING",
                            Toast.LENGTH_SHORT).show();break;
                    case 6:
                        Intent intent6 = new Intent(Academic.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent6.putExtra("web","http://arts.unl.edu/");
                        startActivity(intent6);
//                        Uri uri6 = Uri.parse("http://arts.unl.edu/");
//                    Intent intent6 = new Intent(Intent.ACTION_VIEW,uri6);
//                    startActivity(intent6);
                    Toast.makeText(Academic.this,
                            " FINE & PERFORMING ARTS",
                            Toast.LENGTH_SHORT).show();break;
                    case 7:
                        Intent intent7 = new Intent(Academic.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent7.putExtra("web","http://journalism.unl.edu/");
                        startActivity(intent7);
//                        Uri uri7 = Uri.parse("http://journalism.unl.edu/");
//                    Intent intent7 = new Intent(Intent.ACTION_VIEW,uri7);
//                    startActivity(intent7);
                    Toast.makeText(Academic.this,
                            " JOURNALISM & MASS COMMUNICATIONS",
                            Toast.LENGTH_SHORT).show();break;
                    case 8:
                        Intent intent8 = new Intent(Academic.this, Web.class);//tip：跳转网页的方法一定要加http：
                        intent8.putExtra("web","http://law.unl.edu/");
                        startActivity(intent8);
//                        Uri uri8 = Uri.parse("http://law.unl.edu/");
//                    Intent intent8 = new Intent(Intent.ACTION_VIEW,uri8);
//                    startActivity(intent8);
                    Toast.makeText(Academic.this,
                            "LAW ",
                            Toast.LENGTH_SHORT).show();break;


                }
            }
        });

    }
}