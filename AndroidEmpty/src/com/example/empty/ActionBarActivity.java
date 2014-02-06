package com.example.empty;

import com.example.empty.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;

public class ActionBarActivity extends Activity {

	private int menuItems = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		this.menuItems = 0;
		
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

		MenuItem item = addActionBarItem(menu, R.string.action_search, R.drawable.ic_action_search);
		
		MenuItem item2 = addActionBarItem(menu, "New", R.drawable.ic_action_new);
				
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
		
	protected MenuItem addActionBarItem(Menu menu, String title, int iconId){
		
		menuItems++;
		
		MenuItem item = menu.add(Menu.NONE, menuItems, Menu.NONE, title);
		
		item.setIcon(iconId);
		
		item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		
		return item;
		
	}
	
	protected MenuItem addActionBarItem(Menu menu, int titleId, int iconId){
		
		menuItems++;
		
		MenuItem item = menu.add(Menu.NONE, menuItems, Menu.NONE, titleId);
		
		item.setIcon(iconId);
		
		item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		
		return item;
		
	}
	
}
