package com.example.joyal.unlguide.Catelog;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.joyal.unlguide.Fragment.HomeFrag;
import com.example.joyal.unlguide.R;
import com.example.joyal.unlguide.Web;
import com.example.joyal.unlguide.user.Agreement;
import com.example.joyal.unlguide.user.Login;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.StaticPagerAdapter;
import com.jude.rollviewpager.hintview.ColorPointHintView;

/**
 * Created by Joyal on 2017/6/16.
 */

public class Lib extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.lib);

        RollPagerView mRollViewPager = (RollPagerView)this.findViewById(R.id.lunbo_lib);

        //设置播放时间间隔
        mRollViewPager.setPlayDelay(3000);
        //设置透明度
        mRollViewPager.setAnimationDurtion(500);
        //设置适配器
        mRollViewPager.setAdapter(new Lib.TestNormalAdapter());

        //设置指示器（顺序依次）
        //自定义指示器图片
        //设置圆点指示器颜色
        //设置文字指示器
        //隐藏指示器
        //mRollViewPager.setHintView(new IconHintView(this, R.drawable.point_focus, R.drawable.point_normal));
        mRollViewPager.setHintView(new ColorPointHintView(this, Color.YELLOW, Color.WHITE));


        LinearLayout ll =(LinearLayout)findViewById(R.id.lib_ll1);
        LinearLayout ll2 =(LinearLayout)findViewById(R.id.lib_ll2);
        ImageView go =(ImageView)findViewById(R.id.lib_go) ;
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lib.this, Web.class);//tip：跳转网页的方法一定要加http：
                intent.putExtra("web","http://libraries.unl.edu/libraries");
                startActivity(intent);



            }
        });
        ll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri uri = Uri.parse("http://libraries.unl.edu/askus-1");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);//tip：跳转网页的方法一定要加http：
                startActivity(intent);
            }
        });
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent2 = new Intent(Lib.this, Web.class);//tip：跳转网页的方法一定要加http：
                intent2.putExtra("web","http://libraries.unl.edu/library-branches");
                startActivity(intent2);

            }
        });

    }


    private class TestNormalAdapter extends StaticPagerAdapter {
        private int[] imgs = {
                R.drawable.lib1,
                R.drawable.lib2,
                R.drawable.lib3,
                R.drawable.lib4,
                R.drawable.lib5,
                R.drawable.lib6,

        };

        @Override
        public View getView(ViewGroup container, int position) {
            ImageView view = new ImageView(container.getContext());
            view.setImageResource(imgs[position]);
            view.setScaleType(ImageView.ScaleType.FIT_CENTER);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            return view;
        }


        @Override
        public int getCount() {
            return imgs.length;
        }
    }
}
