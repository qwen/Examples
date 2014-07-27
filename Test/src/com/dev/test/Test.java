package com.dev.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Test extends Activity {
	
	Button button1;
	Button button2;
	Button button3;
	TextView text1;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		button2	= (Button) findViewById(R.id.button2);
		text1 = (TextView) findViewById(R.id.text1);
		OnClickListener oclbutton2 = new OnClickListener() {
						
			@Override
			public void onClick(View v) {
				text1.setText(R.string.text);				
			}			
		};
		
	button2.setOnClickListener(oclbutton2);
	}
	
	public void OnClickbutton1 (View v){
		Toast.makeText(Test.this,R.string.button1, Toast.LENGTH_SHORT).show();
	}
	
	public void OnClickbutton3 (View v){
		text1.setText(R.string.text2);
	}
	
	

}
