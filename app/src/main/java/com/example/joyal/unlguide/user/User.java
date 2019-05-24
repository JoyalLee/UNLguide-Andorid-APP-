package com.example.joyal.unlguide.user;

/**
 * Created by Joyal on 2017/6/7.
 */

public class User {
    private int id;//用户id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    private String namenum;//电话
    private String useremail;//用户名
    private String userpwd;//密码

    public String getNamenum()
    {
        return  namenum;
    }
    public void setNamenum(String namenum)
    {
        this.namenum = namenum;
    }

    public String getUseremail()
    {
        return useremail;
    }
    public void setUseremail(String useremail)
    {
        this.useremail = useremail;
    }

    public String getUserpwd()
    {
        return userpwd;
    }
    public void setUserpwd(String userpwd)
    {
        this.userpwd = userpwd;
    }


}
