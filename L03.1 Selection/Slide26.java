import java.util.*;
public class Slide26 {
	public static void main(String [ ] args) {
		Scanner keyboard = new Scanner(System.in);
		int	value;
		System.out.print("value? ");
		value = keyboard.nextInt();
		int x = 10;
		switch (value) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			default:
				System.out.println("Invalid value");
		}
	System.out.println("after switch");
	}
}	