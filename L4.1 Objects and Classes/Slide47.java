class Circle {
	private int x, y;
	private double radius;
	
	public Circle(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public int getX() { return x; }
	
	public int getY() { return y; }
	
	public double getRadius() { return radius; }
	
	public boolean isOverlap(Circle c) {
		double distance = Math.sqrt( 
			(x-c.getX())*(x-c.getX()) + 
			(y-c.getY())*(y-c.getY()));
		if (distance < (radius+c.getRadius()))
			return true; 
		else
			return false;
	}
}

public class Slide47 {
	public static void main(String[] args) {
		Circle c1 = new Circle(1, 1, 2.5);
		Circle c2 = new Circle(3, 4, 3.5);
		System.out.println( c1.isOverlap( c2 ) );
	}
}