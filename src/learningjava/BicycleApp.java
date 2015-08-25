package learningjava;

public class BicycleApp {

	public BicycleApp() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		Bicycle bicycle = new Bicycle(100, 4);
		bicycle.speedUp(5);
		System.out.println(bicycle.toString());
		//Two ways to do this 
		//1. Create a point object and then pass it to the static method
		Point point = new Point(2, 0);
		//Since it returns double
		double x = Point.calculateDistance(point);
		System.out.println(x);
		//2.Create a point directly in the method
		double y = Point.calculateDistance(new Point(1,0));
		System.out.println(y);
		
	}

}
