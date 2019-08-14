package com.patterns.composite;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {
	
	public NullIterator() {		
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {		
		return null;
	}

}
