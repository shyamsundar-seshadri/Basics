package Package;


public class AnotherVehicle {
	public static void main(String[] args) {
		 drive();
		 
		 Vehicle vehicleObject = new Vehicle();
		 vehicleObject.nonStaticDrive();
		 
		// Vehicle.main('');
		 
		 
	}
	public static void drive(){
		System.out.println("I am driving");
	}
}
