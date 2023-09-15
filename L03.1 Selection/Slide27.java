import java.util.*;
public class Slide27 {
	public static void main(String [ ] args) {
		Scanner keyboard = new Scanner(System.in);
		int	value;
		System.out.print("value? ");
		value = keyboard.nextInt();
		switch (value) {
			case 1:
				System.out.println("One");
			case 2:
				System.out.println("Two");
			case 3:
				System.out.println("Three");
				break;
			default:
				System.out.println("Invalid value");
		}
	System.out.println("after switch");
	}
}	