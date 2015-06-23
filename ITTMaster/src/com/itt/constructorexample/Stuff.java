package com.itt.constructorexample;

public class Stuff {
	
	static int count = 0;
	public Stuff() {
		count = count + 1;
		System.out.println("Created Object Number = " + count);
	}

}
