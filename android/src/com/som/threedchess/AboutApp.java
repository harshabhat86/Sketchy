package com.som.threedchess;




import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class AboutApp extends Activity{
	
	
	WebView myWebView;
		
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	setContentView(R.layout.aboutapp);
	myWebView = (WebView) findViewById(R.id.webview);
	
	WebSettings webSettings = myWebView.getSettings();
	webSettings.setJavaScriptEnabled(true);
	myWebView.addJavascriptInterface(new WebAppInterface(this), "Android");
	myWebView.getSettings().setDomStorageEnabled(true);
	final AP ap = (AP)getApplication();
    String ep = (String)ap.getValueForKey("ep");
	myWebView.loadUrl(ep);	
	
	

myWebView.setDownloadListener(new DownloadListener() {
  public void onDownloadStart(String url, String userAgent,
            String contentDisposition, String mimetype,
            long contentLength) {
      Intent i = new Intent(Intent.ACTION_VIEW);
      i.setType("image/*");
      i.setData(Uri.parse(url));
      startActivity(i);
    }
});	



	
}
public void onBackPressed() {
	
	super.onBackPressed();
	finish();
	
}

public void onPause()
{
	super.onPause();
	finish();
}
}


