package com.accolite.sports;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {
	String msg = "Android : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }*/
        Log.d(msg, "The onCreate() event");
    }

    @Override
    protected void onStart() {
       super.onStart();
       Log.d(msg, "The onStart() event");
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
       super.onResume();
       Log.d(msg, "The onResume() event");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
       super.onPause();
       Log.d(msg, "The onPause() event");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
       super.onStop();
       Log.d(msg, "The onStop() event");
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
       super.onDestroy();
       Log.d(msg, "The onDestroy() event");
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void startService(View view) {
        startService(new Intent(getBaseContext(), MyService.class));
     }

     // Method to stop the service
     public void stopService(View view) {
        stopService(new Intent(getBaseContext(), MyService.class));
     }
     public void showContacts(View view) {
    	 Intent activity2 = new Intent(getApplicationContext(),com.accolite.sports.Contacts.class);
         startActivity(activity2);    	 
      }
     public void showRules(View view) {
    	 Intent activity2 = new Intent(getApplicationContext(),com.accolite.sports.Rules.class);
         startActivity(activity2);    	 
      }
     public void register(View view) {
    	 Intent activity2 = new Intent(getApplicationContext(),com.accolite.sports.Register.class);
         startActivity(activity2);    	 
      }

     public void broadcastIntent(View view)
     {
        Intent intent = new Intent();
        intent.setAction("com.example.CUSTOM_INTENT");
        sendBroadcast(intent);
     }     
     
    /**
     * A placeholder fragment containing a simple view.
     */
    /*public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }*/

}
