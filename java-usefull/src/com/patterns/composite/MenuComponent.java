package com.patterns.composite;

import java.util.Iterator;

public abstract class MenuComponent {
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	
	public void add(MenuComponent component) {
		throw new UnsupportedOperationException();
	}
	
	public Iterator<MenuComponent> createIterator() {
		throw new UnsupportedOperationException();
	}
}
