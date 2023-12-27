package com.meghabassi.builder;

/**
 * Concrete Builder Product2
 * Uses some of the methods provided by Car Builder
 * @author megha
 *
 */
public class SportsCar extends CarBuilder {
	
	SportsCar(String customer){
		super.customer=customer;
		super.type= "SportsCar";
		
	}

	@Override
	public void buildBody() {
		
		car.setExtras("Sports car Extras");
		car.setNumberOfDoors(4);
	}

	

	@Override
	public void buildElectronics() {
		
		car.setElectronics("Sports Car electronics");
	}

	@Override
	public void buildMechanicalComponents() {
		
		car.setMechanics("Sports car mechanics");
	}

	@Override
	public void buildInterior() {
		
		car.setNumberOfFrontSeats(2);
		//no backseats in this sport car
	}

	@Override
	public void buildEngine() {
		
		car.setEngineType("Turbo v6");
	}
	
	

}
