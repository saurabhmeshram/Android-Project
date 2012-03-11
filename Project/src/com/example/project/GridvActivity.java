package com.example.project;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class GridvActivity extends Activity {
    /** Called when the activity is first created. */
    GridView grid_main;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_switch);
		
		//Search Box initially hidden
		
		final EditText Searchbox = (EditText)findViewById(R.id.searchbox);
		Searchbox.setVisibility(View.INVISIBLE);
		
		final Button searchbutton = (Button)findViewById(R.id.searchbutton);
		searchbutton.setVisibility(View.INVISIBLE);
		
		Button searchicon = (Button) findViewById(R.id.searchiconbutton);
	    searchicon.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {					// Search Box becomes Visible
				Searchbox.setVisibility(View.VISIBLE);
				searchbutton.setVisibility(View.VISIBLE);
			}
			
	    });
		
		Button loginbutton = (Button) findViewById(R.id.loginbutton);
	    loginbutton.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent in = new Intent(GridvActivity.this, LoginActivity.class);
				startActivity(in);
			}
	    });
	    
		grid_main = (GridView)findViewById(R.id.GridView01);
		grid_main.setAdapter(new ImageAdapter(this));
	}
	public class ImageAdapter extends BaseAdapter{
		Context mContext;
		public static final int ACTIVITY_CREATE = 10;
		public ImageAdapter(Context c){
			mContext = c;
		}
		public int getCount() {
			// TODO Auto-generated method stub
			return 5;
		}
		
		
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			View v;
			


			if(convertView==null){
				LayoutInflater li = getLayoutInflater();
				v = li.inflate(R.layout.icon, null);
				TextView tv = (TextView)v.findViewById(R.id.icon_text);
				tv.setText("File "+position);
				ImageView iv = (ImageView)v.findViewById(R.id.icon_image);
				iv.setImageResource(R.drawable.ic_launcher);

			}
			else
			{
				v = convertView;
			}
			return v;
		}
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
}

	
/*	 */

