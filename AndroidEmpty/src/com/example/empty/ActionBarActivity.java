package com.example.empty;

import com.example.empty.R;
import com.example.empty.helper.MenuHelper;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;

public class ActionBarActivity extends Activity {

	private MenuHelper helper;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		createLayout();
	}
	
	private void createLayout(){
		
		LinearLayout layout = new LinearLayout(this.getBaseContext());

		layout.setLayoutParams(new LinearLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));

		layout.setBackgroundColor(0xFF0000FF);

		setContentView(layout);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		helper = new MenuHelper(menu);
		
		MenuItem item = helper.addItem(R.string.action_search, R.drawable.ic_action_search);
		
		MenuItem item2 = helper.addItem("New", R.drawable.ic_action_new);
				
		item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {

			@Override
			public boolean onMenuItemClick(MenuItem item) {
				itemAction();
				return true;
			}
			
		});

		return super.onCreateOptionsMenu(menu);
		
	}

	private void itemAction(){
		Toast.makeText(getApplicationContext(), "Item Action", Toast.LENGTH_SHORT).show();
	}
	
}
