package com.example.joyal.unlguide.Infopage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.joyal.unlguide.Home;
import com.example.joyal.unlguide.MainActivity;
import com.example.joyal.unlguide.R;
import com.example.joyal.unlguide.user.Login;

/**
 * Created by Joyal on 2017/6/19.
 */

public class Rate extends Activity {
    private RatingBar ratingbar;	//星级评分条

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starbar);
        ratingbar = (RatingBar) findViewById(R.id.ratingBar1);	//获取星级评分条


        Button button=(Button)findViewById(R.id.button1);		//获取提交按钮
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int result=ratingbar.getProgress();	//获取进度
                float rating=ratingbar.getRating();	//获取等级
                float step=ratingbar.getStepSize();	//获取每次最少要改变多少个星级

                Toast.makeText(Rate.this, "You rated me"+rating+"points!Thanks!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Rate.this,Home.class);
                startActivity(intent);
            }
        });

    }
}


