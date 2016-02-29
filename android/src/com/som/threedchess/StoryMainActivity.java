package com.som.threedchess;



import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.amazon.device.ads.AdRegistration;

import android.net.NetworkInfo.State;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

public class StoryMainActivity extends Activity implements View.OnClickListener {
	Button a1,a2,a3,a4,a5,a6,a7,a8;
	WebView myWebView;
	
	private Button mBtnGetIntAd;
	private Button mBtnShowIntAd;
		
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_main);
        
        AdRegistration.setAppKey("531ee8a153a14a45a4e1d6600bd31b32");
    
        a1=(Button)findViewById(R.id.a1);
        a2=(Button)findViewById(R.id.a2);
        
        
        
        final Map<String,String>  epList = new HashMap<String,String>();
        epList.put("a1", "file:///android_asset/index.html");
        
       
        
        
     final AP ap = (AP)getApplication();   
        
       
    
a1.setOnClickListener(new OnClickListener() {
    		
    		public void onClick(View v) {
    			// TODO Auto-generated method stub
    			
    			 ap.clearAP();
 				ap.setValueForKey("ep",epList.get("a1") );	
                startActivity(new Intent(StoryMainActivity.this,AboutApp.class));
    		}
    	});
   

a2.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		 ap.clearAP();
			ap.setValueForKey("ep",epList.get("a2") );	
        startActivity(new Intent(StoryMainActivity.this,AboutApp1.class));
        
        
	}
});



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_story_main, menu);
        return true;
    }
    
    
    
  

	
	
	public void optinCompleted(Context context, boolean accepted, boolean
			previouslyAnswered) {
			// user is done interacting with opt-in. proceed with app workflow...
			}



	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}



	public void onAdError(String arg0) {
		// TODO Auto-generated method stub
		
	}



	public void onSDKIntegrationError(String arg0) {
		// TODO Auto-generated method stub
		
	}



	public void onSmartWallAdClosed() {
		// TODO Auto-generated method stub
		
	}



	public void onSmartWallAdShowing() {
		// TODO Auto-generated method stub
		
	}
	
	public void onBackPressed() {
		finish();
		//android.os.Process.killProcess(android.os.Process.myPid());
		
		super.onBackPressed();
	}
	
	@Override
	public void onResume() {
	    super.onResume();
	    
	}
	
	@Override
	public void onPause() {
	    super.onPause();
	    
	}
   
}
