import java.util.*;
public class Slide14 {
	public static void main(String [ ] args) {
		Scanner keyboard = new Scanner(System.in);
		int	i=0, n, value, sum=0;
		System.out.print("How many? ");
		n = keyboard.nextInt();
		do {
			System.out.print("value? ");
			value = keyboard.nextInt();
			sum += value;
			i++;
		} while (i < n);
		System.out.println("Sum = " + sum); 
	}
}	