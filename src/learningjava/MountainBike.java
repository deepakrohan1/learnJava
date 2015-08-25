package learningjava;

public class MountainBike extends Bicycle {
	private int seatHeight;

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public MountainBike(int speed, int gear, int seatHeight) {
		super(speed, gear);
//		this.setSeatHeight(seatHeight);
		this.seatHeight = seatHeight;
	}

	@Override
	public void speedUp() {
		this.speed = this.speed + 2;
	}

	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	
	

}
