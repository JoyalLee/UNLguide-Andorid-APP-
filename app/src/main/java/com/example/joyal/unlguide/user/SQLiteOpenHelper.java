package com.example.joyal.unlguide.user;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Joyal on 2017/6/7.
 */

public class SQLiteOpenHelper extends android.database.sqlite.SQLiteOpenHelper {

    //构造方法
    public SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    //执行建表语句
    @Override
    public void onCreate(SQLiteDatabase db) {
        //建表语句
        db.execSQL("create table User(id integer primary key autoincrement,namenum varchar(200),useremail varchar(200),userpwd varchar(200))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



}
