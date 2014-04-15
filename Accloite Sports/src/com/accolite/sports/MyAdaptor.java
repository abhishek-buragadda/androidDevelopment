package com.accolite.sports;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdaptor extends BaseAdapter{

	private Context context ; 
	private List<Contact> list ;
	 	
	
	
	/**
	 * we have to pass the applicaitonContext (getApplicaitonocntext()) to the adaptor  which will be insed by the inflator when the 
	 * convertView is initally null. We can define our own adapaters by simply extending the BaseAdapter 
	 *   
	 * @param context
	 * @param list
	 */
	public MyAdaptor( Context context , List<Contact>  list  ) {
		this.list = list ; 
		this .context=context;
				
	}



	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}



	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}



	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}



	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder ; 
		if(convertView == null)
		{
			LayoutInflater infalter = LayoutInflater.from(context);
			convertView = infalter.inflate(R.layout.listviewlayout, null);
			holder = new ViewHolder(); 
			holder.name = (TextView) convertView.findViewById(R.id.contact_name);
			holder.phonenumber =(TextView)convertView.findViewById(R.id.contact_ph);
			convertView.setTag(holder);
			
		}
		holder = (ViewHolder) convertView.getTag();
		holder.name.setText(list.get(position).getName());
		holder.phonenumber.setText(list.get(position).getPhonenumber());
		return convertView;
					
	}

	static class ViewHolder{
		
			TextView name ; 
			TextView phonenumber ; 
		
	}

}
