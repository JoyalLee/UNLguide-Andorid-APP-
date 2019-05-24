package com.example.joyal.unlguide.user;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Joyal on 2017/6/7.
 */

public class SQL {


    public static String DB_NAME = "sqlite_user";

    public static final int VERSION = 1;

    private static SQL SQL;

    private SQLiteDatabase db;

    //构造方法，创建名字为DB_NAME = "sqlite_user"的数据库
    private SQL(Context context){
        SQLiteOpenHelper dbHelper = new SQLiteOpenHelper(context,DB_NAME,null,VERSION);
        db = dbHelper.getWritableDatabase();
    }

    //获取SqliteDB实例
    public synchronized static SQL getInstance(Context context) {
        if (SQL == null) {
            SQL = new SQL(context);
        }
        return SQL;
    }

    /**
     * 将User实例存储到数据库，采用Insert语句。
     */
    public int saveUser(User user) {
        if (user != null) {
            //以电话号码为查询条件，来进行查找，判断用户是否已经存在，查询得到的结果放在cursor中
            Cursor cursor = db.rawQuery("select * from User where namenum=?", new String[]{(user.getNamenum().toString())});
            if (cursor.getCount() > 0) {
                //cursor中返回的个数大于0，说明用户已经存在，返回-1
                return -1;
            } else {
                try {
                    db.execSQL("insert into User(namenum,useremail,userpwd) values(?,?,?) ", new String[]{user.getNamenum().toString(),user.getUseremail().toString(), user.getUserpwd().toString()});
                } catch (Exception e) {
                    Log.d("Error", e.getMessage().toString());
                }
                return 1;
            }
        }
        else {
            return 0;
        }
    }

    /**
     * 从数据库读取User信息。
     */
    public List<User> loadUser() {
        List<User> list = new ArrayList<User>();
        Cursor cursor = db
                .query("User", null, null, null, null, null, null);
        if (cursor.moveToFirst()) {
            do {
                User user = new User();
                user.setId(cursor.getInt(cursor.getColumnIndex("id")));
                user.setNamenum(cursor.getString(cursor
                        .getColumnIndex("namenum")));
                user.setUseremail(cursor.getString(cursor
                        .getColumnIndex("useremail")));
                user.setUserpwd(cursor.getString(cursor
                        .getColumnIndex("userpwd")));
                list.add(user);
            } while (cursor.moveToNext());
        }
        return list;
    }

    //根据电话号码和密码去数据库中查找，如果存在，则登陆成功，否则失败；
    public int Quer(String pwd,String num)
    {

        HashMap<String,String> hashmap=new HashMap<String,String>();
        //首先用电话号码为条件进行查找，不存在则返回用户不存在，否则继续用电话号码加密码去查找，存在则登录成功，否则密码错误。
        Cursor cursor =db.rawQuery("select * from User where namenum=?", new String[]{num});

        if (cursor.getCount()>0)
        {
            Cursor pwdcursor =db.rawQuery("select * from User where userpwd=? and namenum=?",new String[]{pwd,num});
            if (pwdcursor.getCount()>0)
            {
                return 1;
            }
            else {
                return -1;
            }
        }
        else {
            return 0;
        }
    }




}
