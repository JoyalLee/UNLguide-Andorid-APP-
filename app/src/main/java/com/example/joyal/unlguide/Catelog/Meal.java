package com.example.joyal.unlguide.Catelog;

import android.app.Activity;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.example.joyal.unlguide.Catelog.Location.AbelLocation;
import com.example.joyal.unlguide.Catelog.Location.CPNLocation;
import com.example.joyal.unlguide.Catelog.Location.EastLocation;
import com.example.joyal.unlguide.Catelog.Location.HarperLocation;
import com.example.joyal.unlguide.Catelog.Location.SelleckLocation;
import com.example.joyal.unlguide.Catelog.Menu.AbelMenu;
import com.example.joyal.unlguide.Catelog.Menu.CpnMenu;
import com.example.joyal.unlguide.Catelog.Menu.EastMenu;
import com.example.joyal.unlguide.Catelog.Schedule.Schedule1;
import com.example.joyal.unlguide.Catelog.Schedule.Schedule2;
import com.example.joyal.unlguide.Home;
import com.example.joyal.unlguide.R;
import com.example.joyal.unlguide.user.Agreement;
import com.example.joyal.unlguide.user.Register;

import java.util.Calendar;

/**
 * Created by Joyal on 2017/6/16.
 */

public class Meal extends Activity {
    private Button check;
    private int[] imageIdm = new int[] { R.drawable.dc_abel, R.drawable.dc_cpn,
            R.drawable.dc_east, R.drawable.dc_harper, R.drawable.dc_selleck}; // 定义并初始化保存图片id的数组
    private ImageSwitcher imageSwitcherm; // 声明一个图像切换器对象


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.meal);
        Button check =(Button)findViewById(R.id.checktime);

        Calendar cal = Calendar.getInstance();// 当前日期
      final  int hour = cal.get(Calendar.HOUR_OF_DAY);// 获取小时
       final int minute = cal.get(Calendar.MINUTE);// 获取分钟
       final int minuteOfDay = hour * 60 + minute;// 从0:00分开是到目前为止的分钟数
        final int start = 16 * 60 + 30;// 起始时间 16:30的分钟数
        final int end = 20 * 60+30;// 结束时间 19:00的分钟数

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (minuteOfDay >= start && minuteOfDay <= end) {

                    String right = "It's Time to Eat Dinner";
                    Toast.makeText(Meal.this,
                            right,
                            Toast.LENGTH_LONG).show();

                } else if(minuteOfDay>= 630 && minuteOfDay <= 870){
                    String right = "It's Time to Eat Lunch";
                    Toast.makeText(Meal.this,
                        right,
                        Toast.LENGTH_LONG).show();}
                else if(minuteOfDay>= 390 && minuteOfDay <= 510){
                    String right = "It's Time to Eat Breakfast";
                    Toast.makeText(Meal.this,
                            right,
                            Toast.LENGTH_LONG).show();}


                else{
                    String no = "Not the Right Time to Eat";
                    Toast.makeText(Meal.this,
                            no,
                            Toast.LENGTH_LONG).show();

                }

            }
        });
        Gallery gallery = (Gallery) findViewById(R.id.gallerym); // 获取Gallery组件
        imageSwitcherm = (ImageSwitcher) findViewById(R.id.imageSwitcherm); // 获取图像切换器
        // 设置动画效果
        imageSwitcherm.setInAnimation(AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in)); // 设置淡入动画
        imageSwitcherm.setOutAnimation(AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out)); // 设置淡出动画
        imageSwitcherm.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imageView = new ImageView(Meal.this); // 实例化一个ImageView类的对象
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER); // 设置保持纵横比居中缩放图像
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                return imageView; // 返回imageView对象
            }

        });
        /********************** 使用BaseAdapter指定要显示的内容 *****************************/
        BaseAdapter adapter = new BaseAdapter() {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageview; // 声明ImageView的对象
                if (convertView == null) {
                    imageview = new ImageView(Meal.this); // 实例化ImageView的对象
                    imageview.setScaleType(ImageView.ScaleType.FIT_XY); // 设置缩放方式
                    imageview
                            .setLayoutParams(new Gallery.LayoutParams(360, 270));
                    TypedArray typedArray = obtainStyledAttributes(R.styleable.Gallery);
                    imageview.setBackgroundResource(typedArray.getResourceId(
                            R.styleable.Gallery_android_galleryItemBackground,
                            0));
                    imageview.setPadding(5, 0, 5, 0); // 设置ImageView的内边距
                } else {
                    imageview = (ImageView) convertView;
                }
                imageview.setImageResource(imageIdm[position]); // 为ImageView设置要显示的图片
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
                return imageIdm.length;
            }
        };
        gallery.setAdapter(adapter); // 将适配器与Gallery关联
        /*********************************************************************************/
        gallery.setSelection(imageIdm.length / 2); // 让中间的图片选中
        gallery.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       final int position, long id) {

                imageSwitcherm.setImageResource(imageIdm[position]);
                ImageView price=(ImageView)findViewById(R.id.price);
                ImageView menu=(ImageView)findViewById(R.id.menu);
                ImageView schedule=(ImageView)findViewById(R.id.schedule);
                ImageView location=(ImageView)findViewById(R.id.location);
                price.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        switch (position){
                            case 0: Toast.makeText(Meal.this, "Price of Abel/Sandoz", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,Price.class));break;
                            case 1: Toast.makeText(Meal.this, "Price of CPN", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,Price.class));break;
                            case 2: Toast.makeText(Meal.this, "Price of EastUnion", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,Price.class));break;
                            case 3: Toast.makeText(Meal.this, "Price of Haper", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,Price.class));break;
                            case 4: Toast.makeText(Meal.this, "Price of Selleck", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,Price.class));break;
                            default: Toast.makeText(Meal.this, "error", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,Price.class));break;	//显示消息提示框
                        }
                    }
                });
                menu.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        switch (position){
                            case 0: Toast.makeText(Meal.this, "Menu of Abel/Sandoz", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,EastMenu.class));break;
                            case 1: Toast.makeText(Meal.this, "Menu of CPN", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,EastMenu.class));break;
                            case 2: Toast.makeText(Meal.this, "Menu of EastUnion", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,EastMenu.class));break;
                            case 3: Toast.makeText(Meal.this, "Menu of Haper", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,EastMenu.class));break;
                            case 4: Toast.makeText(Meal.this, "Menu of Selleck", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,EastMenu.class));break;
                            default: Toast.makeText(Meal.this, "error", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,EastMenu.class));break;	//显示消息提示框
                        }
                    }
                });
                location.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        switch (position){
                            case 0: Toast.makeText(Meal.this, "Location of Abel/Sandoz", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,AbelLocation.class));break;
                            case 1: Toast.makeText(Meal.this, "Location of CPN", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,CPNLocation.class));break;
                            case 2: Toast.makeText(Meal.this, "Location of EastUnion", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,EastLocation.class));break;
                            case 3: Toast.makeText(Meal.this, "Location of Haper", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,HarperLocation.class));break;
                            case 4: Toast.makeText(Meal.this, "Location of Selleck", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,SelleckLocation.class));break;
                            default: Toast.makeText(Meal.this, "error", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,Meal.class));break;	//显示消息提示框
                        }
                    }
                });
                schedule.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        switch (position){
                            case 0: Toast.makeText(Meal.this, "Schedule of Abel/Sandoz", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,Schedule1.class));break;
                            case 1: Toast.makeText(Meal.this, "Schedule of CPN", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,Schedule2.class));break;
                            case 2: Toast.makeText(Meal.this, "Schedule of EastUnion", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,Schedule2.class));break;
                            case 3: Toast.makeText(Meal.this, "Schedule of Haper", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,Schedule1.class));break;
                            case 4: Toast.makeText(Meal.this, "Schedule of Selleck", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,Schedule1.class));break;
                            default: Toast.makeText(Meal.this, "error", Toast.LENGTH_LONG).show();startActivity(new Intent(Meal.this,Meal.class));break;	//显示消息提示框
                        }
                    }
                });
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }

        });






    }
}