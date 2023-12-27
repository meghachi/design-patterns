package com.meghabassi.builder;

/**
 * @author: Megha
 * Product
 * 
 **/
public class Car {

	private String type;
	private int numberOfDoors;
	private String engineType;
	private int numberOfFrontSeats;
	private int numberOfBackSeats;
	private String electronics;
	private String extras;
	private String mechanics;
	private String customer;

	
	Car(String customer,String type){
		this.customer=customer;
		this.type=type;
	}
	
	public String getCustomer() {
		return this.customer;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors=numberOfDoors;
	}
	
	public void setNumberOfFrontSeats(int numberOfFrontSeats) {
		this.numberOfFrontSeats=numberOfFrontSeats;
	}
	public void setNumberOfBackSeats(int numberOfBackSeats) {
		this.numberOfBackSeats=numberOfBackSeats;
	}	
	public void setExtras(String extras) {
		this.extras=extras;
	}
	public void setElectronics(String electronics) {
		this.electronics=electronics;
	}
	public void setMechanics(String mechanics) {
		this.mechanics=mechanics;
	}
	public void setType(String type) {
		this.type=type;
	}
	public void setCustomer(String customer) {
		this.customer=customer;
	}
	
	public void setEngineType(String engineType) {
		this.engineType=engineType;
	}
	
	
	
}
