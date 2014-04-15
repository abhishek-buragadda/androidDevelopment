package com.accolite.sports;


import com.accolite.sports.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

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
	
	public void teamRegister (View v)
	{
		Intent activity2 = new Intent(getApplicationContext(),com.accolite.sports.TeamEventRegister.class);    	     	 
         startActivity(activity2);
		
	}
	
	public void individualRegister(View v )
	{
			Intent activity = new Intent (getApplicationContext(), com.accolite.sports.IndividualEventRegister.class);
			startActivity(activity);
		
	}
	
	

}
