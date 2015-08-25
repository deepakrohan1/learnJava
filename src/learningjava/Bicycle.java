package learningjava;

public class Bicycle {
int speed = 0, gear = 1;
	public Bicycle(int speed, int gear) {
		// TODO Auto-generated constructor stub
		super();
		this.speed = speed;
		this.gear = gear;
	}
	
	public void speedUp(int increment){
		this.speed = this.speed + increment;
	}
	
	public void speedUpwith(int increment){
		speed = speed + increment;
	}
	@Override
	public String toString() {
		return "Bicycle [speed=" + speed + ", gear=" + gear + "]";
	}

}
