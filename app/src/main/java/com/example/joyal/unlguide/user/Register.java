package com.example.joyal.unlguide.user;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.joyal.unlguide.R;

/**
 * Created by Joyal on 2017/6/7.
 */

public class Register extends Activity {
    private EditText name;
    private EditText pass;
    private EditText email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.register);

        name = (EditText)findViewById(R.id.name);
        pass = (EditText)findViewById(R.id.Rpass);
        email = (EditText)findViewById(R.id.email);

        ImageButton commit = (ImageButton)findViewById(R.id.commit);

        commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 = name.getText().toString().trim();
                String email1 = email.getText().toString().trim();
                String pass1 = pass.getText().toString().trim();

                User user=new User();
                user.setNamenum(name1);
                user.setUseremail(email1);
                user.setUserpwd(pass1);

                int result= SQL.getInstance(getApplicationContext()).saveUser(user);
                if (result==1){
                    Toast.makeText(Register.this,"Register succeed!",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(Register.this,Login.class));
                }else  if (result==-1)
                {
                    Toast.makeText(Register.this,"This name has already registed ",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(Register.this,"This name has already registed ",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

