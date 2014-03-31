package com.accolite.sports;


import com.accolite.sports.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Rules extends Activity{
	String msg = "Android : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);
        Log.d(msg, "The onCreate() event");
    }
	public Rules() {
		// TODO Auto-generated constructor stub
	}

}
