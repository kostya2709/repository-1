package com.example.world;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		TextView myTextView = (TextView) findViewById(R.id.myText);
		myTextView.setText("new Text");
		
		Button myBtn = (Button)findViewById(R.id.myBtn);
		myBtn.setText("I, knopka");
		myBtn.setEnabled(false);
		
		CheckBox myChb = (CheckBox)findViewById(R.id.myChb);
		myChb.setChecked(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
