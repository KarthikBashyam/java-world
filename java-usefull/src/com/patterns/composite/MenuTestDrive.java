package com.patterns.composite;

public class MenuTestDrive {
	
	
	public static void main(String[] args) {
		
		Menu dinerMenu = new Menu("LUNCH", "This is lunch menu");
		
		MenuItem menuItem = new MenuItem("Chickem", "Organic Chicken roast");
		Menu dessertMenu = new Menu("DESSERT", "This is dessert menu");
		menuItem.add(dessertMenu);
		
		dinerMenu.add(menuItem);
		
		
		
		
		
	}

}
