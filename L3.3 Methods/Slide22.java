import java.util.*;

public class Slide22 {
	public static void main(String[] args) {
		double avg;
		avg = average(5, 6);
		System.out.println("Average=" + avg);
		avg = average(5, 6.0);
		System.out.println("Average=" + avg);
	}
	
	public static double average (int a, int b) {
		return (a+b)/2.0;
	}

	public static int average (int a, double b) {
		return (int) (a+b)/3.0;
	}	

}