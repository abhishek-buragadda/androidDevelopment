package com.accolite.sports;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class TeamEventRegister extends Activity  {

	
	String msg = "team event " ; 
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teamregister);
        Log.d(msg, "The onCreate() event");
        
    }
	

}
