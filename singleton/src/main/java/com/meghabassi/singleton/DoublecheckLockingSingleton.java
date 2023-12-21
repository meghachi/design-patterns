package com.meghabassi.singleton;

//To reduce the overhead on getInstance() due to synchronized use, double check locking
public class DoublecheckLockingSingleton {
		
		//volatile is used when variable will be accessed by multiple threads
		//java volatile variable, which will instruct JVM threads to read the 
		//value of volatile variable from main memory and don’t cache it locally.
		private volatile static DoublecheckLockingSingleton uniqueInstance;
		
		//private constructor so only Singleton class can instantiate
		private DoublecheckLockingSingleton() {}
		
		//This method gives us a way to instantiate class and return instance of it
		//No need to synchronize this
		public static DoublecheckLockingSingleton getInstance() {
			// if instance does not exist, then synchronize it
			if(uniqueInstance==null) {
				synchronized(DoublecheckLockingSingleton.class) {
					if(uniqueInstance==null) {
						uniqueInstance=new DoublecheckLockingSingleton();
					}
				}
			}
			return uniqueInstance;
		}

}
