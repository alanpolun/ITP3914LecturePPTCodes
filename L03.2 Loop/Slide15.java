import java.util.*;
public class Slide15 {
	public static void main(String [ ] args) {
		Scanner kb = new Scanner(System.in);
		int	value, sum=0;
		do {
			System.out.print("value? ");
			value = kb.nextInt();
			sum += value;
		} while (value > 0);
		System.out.println("Sum = " + sum); 
	}
}	