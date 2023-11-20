import java.util.*;

public class Slide14 {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("In main");
		sum = (int) showSum(4, 12);
		System.out.println("Sum = " + sum);
	}
	
	public static double showSum(double x, int y) {
		return x + y;
	}

	
}