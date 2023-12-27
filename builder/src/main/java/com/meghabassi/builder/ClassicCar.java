package com.meghabassi.builder;

/**
 * Concrete Product 1
 * uses only some methods provided by the CarBuilder
 * @author megha
 *
 */
public class ClassicCar extends CarBuilder{
	
	ClassicCar(String customer){
		super.customer=customer;
		super.type="Classic car";
	}

	@Override
	public void buildBody() {
		
		car.setExtras("Classic car");
		car.setNumberOfDoors(4);
	}

	//Electronics not used in older cars
	@Override
	public void buildElectronics() {
		
		
	}

	@Override
	public void buildMechanicalComponents() {
		
		car.setMechanics("Sports car mechanics");
	}

	@Override
	public void buildInterior() {
		
		car.setNumberOfFrontSeats(1);
		car.setNumberOfBackSeats(2);
	}

	@Override
	public void buildEngine() {
		
		car.setEngineType("Old TimeyEngine");
	}

}
