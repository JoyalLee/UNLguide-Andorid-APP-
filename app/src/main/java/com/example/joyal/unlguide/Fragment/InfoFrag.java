package com.example.joyal.unlguide.Fragment;


import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.joyal.unlguide.Catelog.Lib;

import com.example.joyal.unlguide.Infopage.Rate;
import com.example.joyal.unlguide.Infopage.Reset;
import com.example.joyal.unlguide.Infopage.Setting;
import com.example.joyal.unlguide.MainActivity;
import com.example.joyal.unlguide.R;
import com.example.joyal.unlguide.user.Agreement;
import com.example.joyal.unlguide.user.Login;
import com.example.joyal.unlguide.user.SQL;
import com.example.joyal.unlguide.user.User;

import java.io.FileNotFoundException;

import static android.app.Activity.RESULT_OK;
import static android.content.Context.CONTEXT_IGNORE_SECURITY;

/**
 * Created by Joyal on 2017/6/14.
 */

public class InfoFrag extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab04, container, false);
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ImageView iv =(ImageView)getActivity().findViewById(R.id.info_pic) ;

        iv.setOnClickListener(new ImageView.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                /* 开启Pictures画面Type设定为image */
                intent.setType("image/*");
                /* 使用Intent.ACTION_GET_CONTENT这个Action */
                intent.setAction(Intent.ACTION_GET_CONTENT);
                /* 取得相片后返回本画面 */
                startActivityForResult(intent, 1);
            }

        });

        ImageView reset = (ImageView) getActivity().findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(getActivity()).setTitle("Important Message") // 设置对话框的标题
                        .setMessage("If you reset your info, you need to register to login next time! Are you sure to reset your information??") // 设置对话框的显示内容
                        .setPositiveButton("Definitely", // 为确定按钮添加单击事件
                                new DialogInterface.OnClickListener() {

                                    @Override
                                    public void onClick(DialogInterface dialog,
                                                        int which) {
                                        Toast.makeText(getActivity(), "You've clean your info in this App", Toast.LENGTH_LONG).show();
                                  
                                    }
                                }).setNegativeButton("No", // 为取消按钮添加单击事件
                        new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which) {


                            }
                        }).show();
            }
        });
        ImageView logout = (ImageView) getActivity().findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), Login.class));
            }
        });

        ImageView rate = (ImageView) getActivity().findViewById(R.id.rate);
        rate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), Rate.class));
            }
        });
        ImageView setting = (ImageView) getActivity().findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                startActivity(new Intent(getActivity(), Setting.class));
            }
        });

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            Uri uri = data.getData();
            Log.e("uri", uri.toString());
            ContentResolver cr = getActivity().getContentResolver();
            try {
                Bitmap bitmap = BitmapFactory.decodeStream(cr.openInputStream(uri));
                ImageView imageView = (ImageView) getActivity().findViewById(R.id.info_pic);
                /* 将Bitmap设定到ImageView */
                imageView.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                Log.e("Exception", e.getMessage(), e);
            }
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

}
