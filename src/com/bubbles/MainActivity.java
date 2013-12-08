package com.bubbles;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Button log_in_button = (Button) findViewById(R.id.log_in_button);
		log_in_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	System.out.println("Log in button pressed");
            }
        });
		
		final Button sign_up_button = (Button) findViewById(R.id.sign_up_button);
		sign_up_button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				System.out.println("Sign up button pressed");
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
