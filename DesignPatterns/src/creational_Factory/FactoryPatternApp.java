package creational_Factory;
/**
 * 
 * @author Shyam
 * 
 *
 */
public class FactoryPatternApp {
	public static void main(String[] args) {
		VehicleFactory vehicleFactory = new VehicleFactory();
		try {
			Vehicle vehicle1 = vehicleFactory.getPassengerCount(1);
			vehicle1.drive();

			Vehicle vehicle2 = vehicleFactory.getPassengerCount(4);
			vehicle2.drive();

			Vehicle vehicle3 = vehicleFactory.getPassengerCount(30);
			vehicle3.drive();

			Vehicle vehicle4 = vehicleFactory.getPassengerCount(60);
			vehicle4.drive();
		} catch (NullPointerException | IllegalArgumentException e) {
			System.out.println("Exception is thrown" + e);
		}
	}
}
