import java.util.*;
public class Slide9 {
	public static void main(String [ ] args) {
		Scanner kb = new Scanner(System.in);
		int	value, sum=0;
		System.out.print("value? ");
		value = kb.nextInt();
		while (value > 0) {
			sum += value;
			System.out.print("value? ");
			value = kb.nextInt();
		}
		System.out.println("Sum = " + sum); 
	}
}	