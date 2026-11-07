package com.ankamotors.tycoon;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.JsResult;

public class MainActivity extends Activity {
    private WebView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.setStatusBarColor(Color.rgb(23, 18, 14));
        window.setNavigationBarColor(Color.rgb(23, 18, 14));
        window.getDecorView().setSystemUiVisibility(0);

        gameView = new WebView(this);
        gameView.setBackgroundColor(Color.rgb(23, 18, 14));
        gameView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        WebSettings settings = gameView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSupportMultipleWindows(false);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setTextZoom(100);

        gameView.setWebViewClient(new WebViewClient());
        gameView.setWebChromeClient(new WebChromeClient() {
            @Override
            public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
                new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Otomobil İmparatorluğu")
                    .setMessage(message)
                    .setPositiveButton("Tamam", (dialog, which) -> result.confirm())
                    .setOnCancelListener(dialog -> result.cancel())
                    .show();
                return true;
            }

            @Override
            public boolean onJsConfirm(WebView view, String url, String message, JsResult result) {
                new AlertDialog.Builder(MainActivity.this)
                    .setTitle("Otomobil İmparatorluğu")
                    .setMessage(message)
                    .setPositiveButton("Onayla", (dialog, which) -> result.confirm())
                    .setNegativeButton("Vazgeç", (dialog, which) -> result.cancel())
                    .setOnCancelListener(dialog -> result.cancel())
                    .show();
                return true;
            }
        });
        setContentView(gameView);
        gameView.loadUrl("file:///android_asset/index.html");
    }

    @Override
    public void onBackPressed() {
        if (gameView != null && gameView.canGoBack()) gameView.goBack();
        else super.onBackPressed();
    }

    @Override
    protected void onPause() {
        if (gameView != null) gameView.onPause();
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (gameView != null) gameView.onResume();
    }

    @Override
    protected void onDestroy() {
        if (gameView != null) {
            gameView.loadUrl("about:blank");
            gameView.destroy();
            gameView = null;
        }
        super.onDestroy();
    }
}
