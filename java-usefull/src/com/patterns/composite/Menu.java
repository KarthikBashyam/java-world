package com.patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {

	private String name;

	private String description;

	private List<MenuComponent> menuItems = new ArrayList<>();

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public void add(MenuComponent component) {
		this.menuItems.add(component);
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		return menuItems.iterator();
	}

}
