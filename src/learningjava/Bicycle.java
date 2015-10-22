package learningjava;

public class Bicycle {
int speed = 0, gear = 1;
	public Bicycle(int speed, int gear) {
		// TODO Auto-generated constructor stub
		super();
		this.speed = speed;
		this.gear = gear;
	}
	/**
	 * Method Overloading speedUp with different parameters
	 * @param increment
	 */
	public void speedUp(int increment){
		this.speed = this.speed + increment;
	}
	
	public void speedUp(){
		this.speed = this.speed + 1;
	}
	/**
	 * Signature of below method is speedUp(int, int)
	 * @param increment
	 * @param decrement
	 */
	public void speedUp(int increment, int decrement){
		this.speed = this.speed + increment - decrement;
	}
	/**
	 * Use of static method
	 */
	@Override
	public String toString() {
		return "Bicycle [speed=" + speed + ", gear=" + gear + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Bicycle bicycle = (Bicycle) o;

		if (speed != bicycle.speed) return false;
		return gear == bicycle.gear;

	}


}
