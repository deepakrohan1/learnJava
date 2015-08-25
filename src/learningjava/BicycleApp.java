package learningjava;

public class BicycleApp {

	public BicycleApp() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		Bicycle bicycle = new Bicycle(100, 4);
//		bicycle.speedUp(5);
		bicycle.speedUpwith(5);
		System.out.println(bicycle.toString());
	}

}
