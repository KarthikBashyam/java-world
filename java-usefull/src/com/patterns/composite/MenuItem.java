package com.patterns.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {

	private String name;

	private String description;

	public MenuItem(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator();
	}
	
	

}
