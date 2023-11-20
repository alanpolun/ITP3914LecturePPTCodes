import java.util.*;

public class Slide12 {
	public static void main(String[] args) {
		sayHello();
		showValue(30);
		showSum(3, 4);
		discount(100, 0.9);

	}

	public static void sayHello() {
		System.out.println("Hello");
	}
	
	public static void showSum(int x, int y) {
		int sum;
		sum = x + y;
		System.out.println( sum );
	}

	public static void showValue(int value) {
		System.out.println(value);
	}

	public static void discount(int amount, double rate) {
		System.out.println(amount * rate);
	}
	
}