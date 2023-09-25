import java.util.*;
public class Slide21{
	public static void main(String [ ] args) {
		Scanner kb = new Scanner(System.in);
		int n, value, sum=0;
		System.out.print("How many? ");
		n = kb.nextInt();
		for (int i=0; i<n; i++) {
			System.out.print("value? ");
			value = kb.nextInt();
			sum += value;
		}
		System.out.println("Sum = " + sum);
	}
}	