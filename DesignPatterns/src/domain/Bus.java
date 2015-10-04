package domain;

public class Bus implements Vehicle {

	@Override
	public void drive(PATTERNS pattern) {
		System.out.println("Driving a Bus in "+pattern+" Pattern");
	}

}
