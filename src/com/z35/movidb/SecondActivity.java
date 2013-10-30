package com.z35.movidb;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		Bundle b = getIntent().getExtras();
		
		b.getString("title");
		
		TextView tv_title = (TextView) findViewById(R.id.textView1);
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.second, menu);
		return true;
	}
	
	/**
	 * 
	 * @param v
	 */
	public void onBack(View v) {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

}