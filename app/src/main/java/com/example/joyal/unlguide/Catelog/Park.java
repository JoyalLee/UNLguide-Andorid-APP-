package com.example.joyal.unlguide.Catelog;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.ViewSwitcher;

import com.example.joyal.unlguide.R;

/**
 * Created by Joyal on 2017/6/16.
 */

public class Park extends Activity {
    private TabHost tabHost;		//声明TabHost组件的对象
    private int[] imageId = new int[]{R.drawable.sun, R.drawable.sunk,
            R.drawable.sunken, R.drawable.sunkengardens, R.drawable.sunnnn,R.drawable.sunnnnn,R.drawable.sunken_gardens_in_lincolne}; // 声明并初始化一个保存要显示图像ID的数组
    private int index = 0; // 当前显示图像的索引
    private ImageSwitcher imageSwitcher; // 声明一个图像切换器对象

    private int[] imageId2 = new int[]{R.drawable.hom, R.drawable.hooooooooooooooooo,
    R.drawable.hoooooooooooooooooooo, R.drawable.hooooooooooooooooooooooooo, R.drawable.hooooooooooooooooooooooooooooooo}; // 声明并初始化一个保存要显示图像ID的数组
private ImageSwitcher imageSwitcher2; // 声明一个图像切换器对象
    private int index2 = 0; // 当前显示图像的索引


    private int[] imageId3 = new int[]{R.drawable.piiiiiiiii, R.drawable.piiiiiiiiiiiiii,
            R.drawable.piiiiiiiiiiiiiiiii, R.drawable.piiiiiiiiiiiiiiiiii, R.drawable.piiiiiiiiiiiiiiiiiiiiii,R.drawable.piiiiiiiiiiiiiiiiiiiiiiiiiiiii}; // 声明并初始化一个保存要显示图像ID的数组
    private ImageSwitcher imageSwitcher3; // 声明一个图像切换器对象
    private int index3 = 0; // 当前显示图像的索引

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.park);

        tabHost=(TabHost)findViewById(android.R.id.tabhost);	//获取TabHost对象
        tabHost.setup();	//初始化TabHost组件
        LayoutInflater inflater = LayoutInflater.from(this); 	// 声明并实例化一个LayoutInflater对象
        inflater.inflate(R.layout.park01, tabHost.getTabContentView());
        inflater.inflate(R.layout.park02, tabHost.getTabContentView());
        inflater.inflate(R.layout.park03, tabHost.getTabContentView());
        tabHost.addTab(tabHost.newTabSpec("tab01")

                .setIndicator("Sunken Garden")
                .setContent(R.id.park01));   //添加第一个标签页
        tabHost.addTab(tabHost.newTabSpec("tab02")
                .setIndicator("Holmes Park")
                .setContent(R.id.park02));  	//添加第二个标签页
        tabHost.addTab(tabHost.newTabSpec("tab03")
                .setIndicator("Pioneer Lake")
                .setContent(R.id.park03));   //添加第一个标签页




//tab2


        imageSwitcher2 = (ImageSwitcher) findViewById(R.id.imageSwitcher2); // 获取图像切换器
        // 设置动画效果
        imageSwitcher2.setInAnimation(AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in)); // 设置淡入动画
        imageSwitcher2.setOutAnimation(AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out)); // 设置淡出动画
        imageSwitcher2.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imageView = new ImageView(Park.this); // 实例化一个ImageView类的对象
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER); // 设置保持纵横比居中缩放图像
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
                return imageView; // 返回imageView对象
            }

        });
        imageSwitcher2.setImageResource(imageId2[index2]);// 显示默认的图片
        Button up2 = (Button) findViewById(R.id.button3); // 获取“上一张”按钮
        Button down2 = (Button) findViewById(R.id.button4); // 获取“下一张”按钮
        up2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (index2 > 0) {
                    index2--;
                } else {
                    index2 = imageId2.length - 1;
                }
                imageSwitcher.setImageResource(imageId2[index2]); // 显示当前图片
            }
        });
        down2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (index2 < imageId2.length - 1) {
                    index2++;
                } else {
                    index2 = 0;
                }
                imageSwitcher2.setImageResource(imageId2[index2]); // 显示当前图片
            }
        });








//tab3
        imageSwitcher3 = (ImageSwitcher) findViewById(R.id.imageSwitcher3); // 获取图像切换器
        // 设置动画效果
        imageSwitcher3.setInAnimation(AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in)); // 设置淡入动画
        imageSwitcher3.setOutAnimation(AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out)); // 设置淡出动画
        imageSwitcher3.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imageView = new ImageView(Park.this); // 实例化一个ImageView类的对象
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER); // 设置保持纵横比居中缩放图像
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                return imageView; // 返回imageView对象
            }

        });
        imageSwitcher3.setImageResource(imageId3[index3]);// 显示默认的图片
        Button up3 = (Button) findViewById(R.id.button5); // 获取“上一张”按钮
        Button down3 = (Button) findViewById(R.id.button6); // 获取“下一张”按钮
        up3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (index3 > 0) {
                    index3--;
                } else {
                    index3 = imageId3.length - 1;
                }
                imageSwitcher3.setImageResource(imageId3[index3]); // 显示当前图片
            }
        });
        down3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (index3 < imageId3.length - 1) {
                    index3++;
                } else {
                    index3 = 0;
                }
                imageSwitcher3.setImageResource(imageId3[index3]); // 显示当前图片
            }
        });




















        imageSwitcher = (ImageSwitcher) findViewById(R.id.imageSwitcher1); // 获取图像切换器
        // 设置动画效果
        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in)); // 设置淡入动画
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out)); // 设置淡出动画
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {

            @Override
            public View makeView() {
                ImageView imageView = new ImageView(Park.this); // 实例化一个ImageView类的对象
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER); // 设置保持纵横比居中缩放图像
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
                        ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                return imageView; // 返回imageView对象
            }

        });
        imageSwitcher.setImageResource(imageId[index]);// 显示默认的图片




        Button up = (Button) findViewById(R.id.button1); // 获取“上一张”按钮
        Button down = (Button) findViewById(R.id.button2); // 获取“下一张”按钮
        up.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (index > 0) {
                    index--;
                } else {
                    index = imageId.length - 1;
                }
                imageSwitcher.setImageResource(imageId[index]); // 显示当前图片
            }
        });
        down.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (index < imageId.length - 1) {
                    index++;
                } else {
                    index = 0;
                }
                imageSwitcher.setImageResource(imageId[index]); // 显示当前图片
            }
        });


    }
}
