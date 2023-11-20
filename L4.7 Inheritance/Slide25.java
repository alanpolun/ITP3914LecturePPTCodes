public class Slide25 {
	public static void main(String[] args) {
    	Circle circle1;
    	circle1 = new Circle( 4.5, 72, 29 );
		System.out.println();
    	circle1 = null;  // mark for garbage collection
    	System.gc();     // call the garbage collector 
	}
}