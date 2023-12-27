package com.meghabassi.builder;

/**
 * Client Application where we make the car
 * @author megha
 *
 */
public class App{
	public static void main(String[] args) {
		//instantiate Director
		AutomotiveEngineer ae= new AutomotiveEngineer();
		
		//instantiate
		CarBuilder carBuilder= new ClassicCar("Michael Schumaker");
	
		ae.setCarBuilder(carBuilder);
		ae.constructCar();
		
		Car car= ae.getCar();
		System.out.println(car.getType()+"Car is ready for customer"+ car.getCustomer());
		
	}
	
}