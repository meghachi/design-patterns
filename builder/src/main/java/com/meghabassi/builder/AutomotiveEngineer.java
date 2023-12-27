package com.meghabassi.builder;

/**
 * Director
 * @author megha
 *
 */
public class AutomotiveEngineer {
	private CarBuilder carBuilder;
	
	public void setCarBuilder(CarBuilder carBuilder) {
		this.carBuilder=carBuilder;
	}
	
	public Car getCar() {
		return carBuilder.getCar();
	}
	
	public void constructCar() {
		carBuilder.createNewCar();
		carBuilder.buildBody();
	    carBuilder.buildElectronics();
	    carBuilder.buildMechanicalComponents();
	    carBuilder.buildInterior();
	    carBuilder.buildEngine();
	}
}
