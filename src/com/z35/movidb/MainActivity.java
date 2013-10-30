package com.z35.movidb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/**
	 * 
	 * @param v
	 */
	public void onClear(View v) {
		
		EditText et = (EditText) findViewById(R.id.edTitle);
		et.setText("");
		et = (EditText) findViewById(R.id.edGenre);
		et.setText("");
		et = (EditText) findViewById(R.id.edLength);
		et.setText("");
		
	}
	
	/**
	 * 
	 * @param v
	 */
	public void onHelpdesk(View v) {
		
		EditText etTitle = (EditText) findViewById(R.id.edTitle);

		EditText etGenre = (EditText) findViewById(R.id.edGenre);

		EditText etLength = (EditText) findViewById(R.id.edLength);
		
//		Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 0301234567"));
		Intent intent = new Intent(this, SecondActivity.class);
		
		intent.putExtra("title", etTitle.getText().toString());
		intent.putExtra("genre", etGenre.getText().toString());
		intent.putExtra("length", etLength.getText().toString());
		
		startActivity(intent);
		
	}
	
	
}