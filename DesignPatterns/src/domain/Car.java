package domain;

public class Car implements Vehicle {

	@Override
	public void drive(PATTERNS pattern) {
		System.out.println("Driving a Car in "+pattern+" Pattern");
	}


}
