package com.example.joyal.unlguide.Catelog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.joyal.unlguide.R;
import com.example.joyal.unlguide.TxtReader;

import java.io.InputStream;

/**
 * Created by Joyal on 2017/6/16.
 */

public class Involve extends Activity {
    Button button;
    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.involve);

        button = (Button) findViewById(R.id.button1);
        textView = (TextView) findViewById(R.id.textView1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputStream inputStream = getResources().openRawResource(R.raw.a);
                String string = TxtReader.getString(inputStream);
                textView.setText(string);
            }
        });

    }
}


