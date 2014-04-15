package com.accolite.sports;


import java.util.ArrayList;
import java.util.List;

import com.accolite.sports.R;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class Contacts extends Activity{
	String msg = "Android : ";
	private ListView listView;
	private List<Contact> list ; 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts);
        Log.d(msg, "The onCreate() event");
        

		listView = (ListView) findViewById(R.id.contactslistView);
		
		list  = new ArrayList<Contact>() ;
		
	// adding contacts 
		list.add(new Contact("Ankit", "9008592345"));
		list.add(new Contact("Abhishek","9535791251"));
		
		MyAdaptor adapter = new MyAdaptor(getApplicationContext(), list);
		listView.setAdapter(adapter);
        
        
        
    }
	public Contacts() {
		// TODO Auto-generated constructor stub
	}
	
	

}
