import java.util.*;

public class Slide17 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n;
		while (true) {
			n = kb.nextInt();
			if (n <= 0) 
				break;
			System.out.println("Square root of " + n + " = " + Math.sqrt(n));
		}
	}
}