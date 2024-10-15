import java.util.*;

public class Slide14 {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("In main");
		sum = showSum(4, 12);
		System.out.println("Sum = " + sum);
		if (showSum(3,5)>7){

		}
	}
	
	public static int showSum(int x, int y) {
		return x + y;
	}

	
}