package com.example.mpholublab11;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://www.wikipedia.org/");
    }

    public void goBack(View v) {
        if (webView.canGoBack()) {
            webView.goBack();
        }
    }

    public void goHome(View v) {
        webView.loadUrl("https://www.wikipedia.org/");
    }

    public void goForward(View v) {
        if (webView.canGoForward()) {
            webView.goForward();
        }
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
