package Package;



public class Vehicle {
	
	enum direction{EAST, WEST, NORTH, SOUTH}
	final int engineCount = 1;
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
	public void Vehicle(){
		System.out.println("Inside Constructor");
	}
	public static void drive(){
		System.out.println("I am driving");
	}
	
	public void nonStaticDrive(){
		System.out.println("I am driving through Object");
	}
	private void privateDrive(){
		System.out.println("I am privately driving");
	}
}
