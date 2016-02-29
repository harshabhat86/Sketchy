package com.som.threedchess;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class AboutApp1 extends Activity{
	
	
	Button back;
	
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	
	
	setContentView(R.layout.aboutapp1);
	back = (Button)findViewById(R.id.back);
		
	back.setOnClickListener(new OnClickListener() {
		
		public void onClick(View v) {
			finish();
			
			startActivity(new Intent(AboutApp1.this,StoryMainActivity.class));
		}
	});

	
	
}
}