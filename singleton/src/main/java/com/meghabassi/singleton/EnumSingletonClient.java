package com.meghabassi.singleton;

public class EnumSingletonClient {
	public enum EnumSingleton{
		UNIQUEINSTANCE;
	}
	
	public static void main(String[] args) {
		EnumSingleton enumSingleton= EnumSingleton.UNIQUEINSTANCE;
		
	}
}
