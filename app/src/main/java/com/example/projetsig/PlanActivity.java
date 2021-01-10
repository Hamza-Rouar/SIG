package com.example.projetsig;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class PlanActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
        webView = (WebView)findViewById(R.id.map);
        webView.loadUrl("file:///android_asset/plan.html");
        webView.getSettings().setJavaScriptEnabled(true);
    }
}