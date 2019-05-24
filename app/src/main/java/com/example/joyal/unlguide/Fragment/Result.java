package com.example.joyal.unlguide.Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.example.joyal.unlguide.R;

/**
 * Created by Joyal on 2017/6/17.
 */

public class Result extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.result);

    }
}
