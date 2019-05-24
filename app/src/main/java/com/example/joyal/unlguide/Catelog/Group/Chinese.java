package com.example.joyal.unlguide.Catelog.Group;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.example.joyal.unlguide.R;

/**
 * Created by Joyal on 2017/6/25.
 */

public class Chinese extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.cssa);
    }

}
