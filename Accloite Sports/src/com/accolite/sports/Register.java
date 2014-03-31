package com.accolite.sports;


import com.accolite.sports.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Register extends Activity{
	String msg = "Android : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        Log.d(msg, "The onCreate() event");
    }
	public Register() {
		// TODO Auto-generated constructor stub
	}

}
