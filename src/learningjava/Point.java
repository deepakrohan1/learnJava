package learningjava;

public class Point {
	private double x,y;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * Below is a static method which can be called without intantiation
	 * @param p
	 * @return
	 */
	public static double calculateDistance(Point p){
		return (Math.sqrt(p.getX()*p.getX() + p.getY()*p.getY()));
	}

}
