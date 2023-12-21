package com.meghabassi.singleton;
/**
 * Source code is from Head First Design Patterns
 * @author megha
 *
 */
public class EagerInitializedSingleton {
	
	//Eager initialization of singleton so it is initialized at the very beginning
	//Static inizialization is guaranteed to be  thread safe
	//JVM guarantees that static variable initialized before any thread can access it
	private static EagerInitializedSingleton uniqueInstance=new EagerInitializedSingleton();
	//private static int id;
	
	//private constructor so only Singleton class can instantiate
	private EagerInitializedSingleton() {}
	
	//This method gives us a way to instantiate class and return instance of it
	//No need to synchronize this
	public static EagerInitializedSingleton getInstance() {
		
		return uniqueInstance;
	}

	
	
}
