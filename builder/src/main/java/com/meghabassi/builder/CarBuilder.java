package com.meghabassi.builder;

/**
 * @author mbassi
 * Reference https://www.classes.cs.uchicago.edu/archive/2010/winter/51023-1/presentations/ricetj_builder.pdf
 *Abstract builder class
 */
public abstract class CarBuilder 
{
	protected Car car;
	protected String customer;
	protected String type;
	
    public Car getCar() {
    	return car;
    }
    
    public void createNewCar() {
    	car= new Car(customer,type);
    }
    
    public abstract void buildBody();
    public abstract void buildElectronics();
    public abstract void buildMechanicalComponents();
    public abstract void buildInterior();
    public abstract void buildEngine();
    
	
}
