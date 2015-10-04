package factory;

import domain.Bike;
import domain.Bus;
import domain.Car;
import domain.Vehicle;

public class VehicleFactory {
	public Vehicle getPassengerCount(int passengers){
		
		if (passengers == 0){
			return null;
		}
		else if (passengers<2){
			return new Bike();
		}
		else if (passengers>2 && passengers<=5){
			return new Car();
		}
		else if (passengers < 50){
			return new Bus();
		}
		
		return null;
		
	}
}
