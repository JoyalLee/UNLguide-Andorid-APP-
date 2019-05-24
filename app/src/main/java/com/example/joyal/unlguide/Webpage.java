package com.example.joyal.unlguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebView;

/**
 * Created by Joyal on 2017/6/23.
 */

public class Webpage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.webpage);

        WebView view = (WebView)findViewById(R.id.webpage);
        view.loadUrl(getUrl());

    }

    public String getUrl(){
        Intent intent = this.getIntent();
        return intent.getStringExtra("map");
    }
}

