package learningjava;

/**
 * Implements the interface drawable 
 * If interface is implemented we need to override the methods in the Interface
 * @author rohan
 *
 */
public class Point implements Drawable {
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

	@Override
	public void color(String color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPosition(double x, double y) {
		// TODO Auto-generated method stub
		
	}

}
