package com.example.joyal.unlguide.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.joyal.unlguide.R;

/**
 * Created by Joyal on 2017/6/22.
 */

public class NewsContent extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.news_layout);

        WebView view = (WebView)findViewById(R.id.webview);
        view.loadUrl(getUrl());

    }

    public String getUrl(){
        Intent intent = this.getIntent();
        return intent.getStringExtra("url");
    }
}
