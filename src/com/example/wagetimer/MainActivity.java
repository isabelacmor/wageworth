package com.example.wagetimer;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;
import android.app.Activity;

public class MainActivity extends Activity implements OnClickListener {

	private Chronometer chronometer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		chronometer = (Chronometer) findViewById(R.id.chronometer);
		((Button) findViewById(R.id.start_button)).setOnClickListener(this);
		((Button) findViewById(R.id.stop_button)).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.start_button:
			chronometer.setBase(SystemClock.elapsedRealtime());
			chronometer.start();
			break;
		case R.id.stop_button:
			chronometer.stop();
			break;
		}
	}
	
}

