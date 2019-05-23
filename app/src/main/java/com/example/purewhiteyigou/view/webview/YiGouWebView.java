package com.example.purewhiteyigou.view.webview;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.purewhiteyigou.R;
import com.example.purewhiteyigou.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2019/5/21 0021
 * Time: 9:54
 * Describe: ${as}
 */
public class YiGouWebView extends BaseActivity {


    @BindView(R.id.webview_yigouwebview)
    WebView webviewYigouwebview;
    String url = "";
    @BindView(R.id.title_webview)
    TextView titleWebview;
    @BindView(R.id.constrain_webview)
    ConstraintLayout constrainWebview;
    @BindView(R.id.process_webview)
    ProgressBar processWebview;
    @BindView(R.id.image_back_webview)
    ImageView imageBackWebview;

    @Override
    protected int getContentView() {
        return R.layout.activity_webview;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        initView();
        initListener();
    }

    private void initListener() {

        imageBackWebview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YiGouWebView.this.finish();
            }
        });
    }

    private void initView() {
        webviewYigouwebview.loadUrl(url);
        WebSettings settings = webviewYigouwebview.getSettings();
        settings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        settings.setSupportZoom(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setJavaScriptEnabled(true);
        webviewYigouwebview.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(url);
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        webviewYigouwebview.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                processWebview.setProgress(newProgress);
                if(newProgress==100){
                    processWebview.setVisibility(View.GONE);
                }else{
                    processWebview.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);
                titleWebview.setText(title);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (webviewYigouwebview != null) {
            webviewYigouwebview.destroy();
        }
    }
}
