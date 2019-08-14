package com.patterns.singleton;

public class Singleton {

	private static Singleton INSTANCE;

	private Singleton() {
	}

	// Double Checked Locking
	public Singleton getInstance() {

		if (INSTANCE == null) {

			synchronized (Singleton.class) {

				if (INSTANCE == null) {

					INSTANCE = new Singleton();

				}

			}

		}
		return INSTANCE;
	}

}
