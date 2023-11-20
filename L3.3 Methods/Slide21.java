import java.util.*;

public class Slide21 {
	static int a=1, b=2; //global variable
	public static void main(String[] args) {
		int temp;
		System.out.println("a=" + a + ", b=" + b);
		swap();
		System.out.println("a=" + a + ", b=" + b);
	}

	public static void swap () { //local variable
		System.out.println("\ta=" + a + ", b=" + b);
		int temp=a;
		a = b;
		b = temp;
		System.out.println("\ta=" + a + ", b=" + b);
	}	
}