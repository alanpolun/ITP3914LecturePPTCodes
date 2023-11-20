public class Slide15 {
	public static void main(String[] args) {
		Point p1, p2; 
		Circle c1, c2;
		System.out.println("Creating p1");
		p1 = new Point();
		System.out.println("\nCreating p2");
		p2 = new Point( 30, 50 );
		System.out.println("\nCreating c1");
		c1 = new Circle();
		System.out.println("\nCreating c2");
		c2 = new Circle( 2.7, 120, 89 );
		System.out.println("\nPoint 2: " + p2);
		System.out.println("\nCircle 2: " + c2);
	}
}