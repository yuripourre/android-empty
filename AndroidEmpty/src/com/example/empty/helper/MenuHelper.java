package com.example.empty.helper;

import android.view.Menu;
import android.view.MenuItem;

public class MenuHelper {

	private int menuItems = 0;
	
	private Menu menu;

	public MenuHelper(Menu menu){
		super();
		
		this.menu = menu;
		
		this.menuItems = 0;
		
	}

	public MenuItem addItem(String title, int iconId){
		
		menuItems++;
		
		MenuItem item = menu.add(Menu.NONE, menuItems, Menu.NONE, title);
		
		item.setIcon(iconId);
		
		item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		
		return item;
		
	}
	
	public MenuItem addItem(int titleId, int iconId){
		
		menuItems++;
				
		MenuItem item = menu.add(Menu.NONE, menuItems, Menu.NONE, titleId);
		
		item.setIcon(iconId);
		
		item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		
		return item;
		
	}
	
}
