package com.meghabassi.singleton;

public class ChocolateBoiler {
	
	private boolean empty;
	private boolean boiled;
	
	private ChocolateBoiler() {
		empty=true;
		boiled=false;
	}
	
	public void fill() {
		//if boiler is empty,fill it
		if(isEmpty())
		{
			empty=false;
			boiled=false;
			//fill the boiler
		}
		
	}
	
	public boolean isEmpty() {
		return empty;
	}
	public boolean isBoiled() {
		return boiled;
	}

}
