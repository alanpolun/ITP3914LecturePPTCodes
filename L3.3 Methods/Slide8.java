import java.util.*;

public class Slide8 {
	public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("In main");
		sayHello();
		System.out.println("Back to main");
	}
	
	public static void sayHello() {
		int number = kb.nextInt();
		if ( number==0 )
			return;	
		System.out.println("Hello");
	}

	
}