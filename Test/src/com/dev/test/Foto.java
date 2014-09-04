package com.dev.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;


public class Foto extends Activity {
	
	WebView webView1;
	WebView webView2;
	ProgressBar progressBar1;
	ProgressBar progressBar2;
	// commit 1
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main2);
		
		final ProgressBar progressBar1 = (ProgressBar)findViewById(R.id.progressBar1);
		progressBar1.setMax(100);
		
        webView1 = (WebView) findViewById(R.id.webview1);
		
		webView1.getSettings().setSupportZoom(true);
		webView1.getSettings().setBuiltInZoomControls(true);
		webView1.getSettings().setLoadWithOverviewMode(true);
		webView1.getSettings().setUseWideViewPort(true);
		
		webView1.setWebChromeClient(new WebChromeClient(){
			@Override
			public void onProgressChanged(WebView webView, int progress){
				if (progress == 100){
					progressBar1.setVisibility(View.GONE); // Прячем Layout с ProgressBar
				} else {
					progressBar1.setVisibility(View.VISIBLE);
					progressBar1.setProgress(progress);
				}
			}

		});
	
		webView1.loadUrl("http://www.picshare.ru/uploads/140622/PXKOL58Mm3.jpg");
		
		final ProgressBar progressBar2 = (ProgressBar)findViewById(R.id.progressBar2);
		progressBar2.setMax(100);
		
        webView2 = (WebView) findViewById(R.id.webview2);
		
		webView2.getSettings().setSupportZoom(true);
		webView2.getSettings().setBuiltInZoomControls(true);
		webView2.getSettings().setLoadWithOverviewMode(true);
		webView2.getSettings().setUseWideViewPort(true);
		
		webView2.setWebChromeClient(new WebChromeClient(){
			@Override
			public void onProgressChanged(WebView webView, int progress){
				if (progress == 100){
					progressBar2.setVisibility(View.GONE); // Прячем Layout с ProgressBar
				} else {
					progressBar2.setVisibility(View.VISIBLE);
					progressBar2.setProgress(progress);
				}
			}

		});
	
		webView2.loadUrl("http://www.picshare.ru/uploads/140622/kLQO9t7hH8.jpg");
	}
}
