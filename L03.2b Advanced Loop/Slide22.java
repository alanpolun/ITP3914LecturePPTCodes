import java.util.*;

public class Slide22 {
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
		int x, sum=0;
		for (int i=0; i<5; i++) {
			System.out.print("x=? ");
			x = kb.nextInt();
			if (x <= 0)
				continue;
			sum += x;
		}
		System.out.println("Sum = " + sum);
	}
}