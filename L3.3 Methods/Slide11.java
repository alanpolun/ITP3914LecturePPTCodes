import java.util.*;

public class Slide11 {
	public static void main(String[] args) {
		System.out.println("In main");
		showSum(4, 12);
		System.out.println("Back to main");
	}
	
	public static void showSum(int x, int y) {
		System.out.println("x:"+x+" y:"+y);
		System.out.println( x + y );
	}

	
}