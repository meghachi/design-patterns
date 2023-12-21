package com.meghabassi.singleton;
/**
 * Source code is from Head First Design Patterns
 * @author megha
 *
 */
public class Singleton {
	
	private static Singleton uniqueInstance;
	//private static int id;
	
	//private constructor so only Singleton class can instantiate
	private Singleton() {}
	
	//This method gives us a way to instantiate class and return instance of it
	//Synchronized helps to make sure that only one thread can access it at a time
	public static synchronized Singleton getInstance() {
		if(uniqueInstance ==null) {
			uniqueInstance =new Singleton();
		}
		return uniqueInstance;
	}

	
	
}
