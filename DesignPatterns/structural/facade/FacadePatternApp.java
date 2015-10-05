package facade;

public class FacadePatternApp {

	public static void main(String[] args) {
		VehicleGarage garage = new VehicleGarage();
		garage.rideBike();
		garage.rideBus();
		garage.rideCar();
	}

}
