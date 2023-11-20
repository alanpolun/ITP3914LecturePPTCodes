public class Circle extends Point {  // inherits from Point
	protected double radius;
	public Circle() {
		// implicit call to superclass constructor 
		System.out.println("Constructor: Circle()");
		setRadius( 0 );  
	}
	public Circle( double r, int a, int b ) {
		super( a, b );  // call to superclass constructor
		System.out.println("Constructor: Circle(double r, int a, int b) ");
		setRadius( r );  
	}
	public void setRadius( double r ) { 
		radius = ( r >= 0.0 ? r : 0.0 ); 
	}
	public double getRadius() { return radius; }
	public double area() { return Math.PI * radius * radius; }
	public String toString() {
		return "Center = " + "[" + x + ", " + y + "]" +
				"; Radius = " + radius;
	}
	
	protected void finalize() {
         System.out.println( "Circle finalizer" );
         super.finalize();  // call superclass finalize method
	}

}
