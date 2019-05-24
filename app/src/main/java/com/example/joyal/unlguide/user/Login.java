package com.example.joyal.unlguide.user;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.joyal.unlguide.Home;
import com.example.joyal.unlguide.MainActivity;
import com.example.joyal.unlguide.R;
import com.example.joyal.unlguide.Web;
import com.example.joyal.unlguide.Webpage;

/**
 * Created by Joyal on 2017/6/7.
 */

public class Login extends Activity {
    private EditText unid;
    private EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.login);


        //找到布局文件中对应的控件
        Button login = (Button)findViewById(R.id.login);
        Button register = (Button)findViewById(R.id.register);

        unid = (EditText)findViewById(R.id.unid);
        pass = (EditText)findViewById(R.id.pass);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(Login.this).setTitle("UNL") // 设置对话框的标题
                        .setMessage("Choose your Language to login") // 设置对话框的显示内容
                        .setPositiveButton("English", // 为确定按钮添加单击事件
                                new DialogInterface.OnClickListener() {

                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int which) { String stringName = unid.getText().toString();
                                        String stringPass = pass.getText().toString();

                                        int result = SQL.getInstance(getApplicationContext()).Quer(stringPass,stringName);

                                        if (result==1){
                                            Toast.makeText(Login.this,"Login success",Toast.LENGTH_LONG).show();






                                            startActivity(new Intent(Login.this,Home.class));
                                        }else {
                                            if (result == 0){
                                                Toast.makeText(Login.this,"Invalid User",Toast.LENGTH_LONG).show();
                                            }else if(result==-1){
                                                Toast.makeText(Login.this,"Wrong Password！",Toast.LENGTH_LONG).show();
                                            }
                                        }

                                    }
                                }).setNegativeButton("简体中文", // 为取消按钮添加单击事件
                        new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                Intent intent = new Intent(Login.this, Web.class);//tip：跳转网页的方法一定要加http：
                                intent.putExtra("web","http://www.unlguide.com");
                                startActivity(intent);


                            }
                        }).show();
            }
        });


//
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String stringName = unid.getText().toString();
//                String stringPass = pass.getText().toString();
//
//                int result = SQL.getInstance(getApplicationContext()).Quer(stringPass,stringName);
//
//                if (result==1){
//                    Toast.makeText(Login.this,"Login success",Toast.LENGTH_LONG).show();
//
//
//
//
//
//
//                    startActivity(new Intent(Login.this,Home.class));
//                }else {
//                    if (result == 0){
//                        Toast.makeText(Login.this,"Invalid User",Toast.LENGTH_LONG).show();
//                    }else if(result==-1){
//                        Toast.makeText(Login.this,"Wrong Password！",Toast.LENGTH_LONG).show();
//                    }
//                }
//            }
//        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,Agreement.class));
            }
        });
    }
}




