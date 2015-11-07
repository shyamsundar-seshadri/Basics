package Package;

public class Test {

	/*public static void main(String[] args) {
	System.out.println("This is for testing");
	System.out.println("I am inside the main directory");
	//Dia(4);
	}*/
	final static float pi= 3.14f;
	public static double areaofcone(int r,int h) {
		//System.out.println("The default value of pi is " + pi);
		//System.out.println("The area of cone is " + pi*r*r*h);
		double areaCone;
		areaCone= pi*r*r*h;
		return areaCone;
	}
	public double areaOfCirlce(int r){
		double circleArea = pi*r*r;
		return circleArea;
	}
	
	protected int Dia(int r){
		return 2*r;
	}
}
