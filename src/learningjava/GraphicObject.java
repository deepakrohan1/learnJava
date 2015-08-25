package learningjava;

public abstract class GraphicObject {
	double x, y;
	
	void moveTo(double newX, double newY){
		this.x = newX;
		this.y = newY;
		System.out.println(x+ " : " +y);
	}
	
	//Have abstract methods
	abstract void draw();
	abstract void resize(double factorX, double factorY);
}
