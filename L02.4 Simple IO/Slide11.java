import java.util.*;
public class Slide12 {
	public static void main(String [ ] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Your Age: ");
		int age = keyboard.nextInt();
		System.out.print("Your Name: ");		
		String yourname = keyboard.nextLine();//fail to read yourname
		System.out.println("Your Age is: " + age);
		System.out.println("Your Name is: " + yourname);
	}
}