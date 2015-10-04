package domain;

public class Bike implements Vehicle {

	@Override
	public void drive(PATTERNS pattern) {
		System.out.println("Driving a Bike in "+pattern+" Pattern");
	}

}
