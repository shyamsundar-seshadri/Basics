package facade;

import domain.Bike;
import domain.Bus;
import domain.Car;
import domain.PATTERNS;
import domain.Vehicle;

/**
 * 
 * @author Shyam
 *
 */
public class VehicleGarage {
	private Vehicle bike;
	private Vehicle bus;
	private Vehicle car;
	
	//Overriding Constructor
	public VehicleGarage(){
		bike = new Bike();
		bus = new Bus();
		car = new Car();
	}
	
	public void rideBike(){
		System.out.println("");
		bike.drive(PATTERNS.FACADE);
	}
	
	public void rideCar(){
		car.drive(PATTERNS.FACADE);
	}
	
	public void rideBus(){
		bus.drive(PATTERNS.FACADE);
	}
}
