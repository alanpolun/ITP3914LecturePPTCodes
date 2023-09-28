import java.util.*;

public class Slide18 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i, x;

		for (i=0; i<10; i++) {
			System.out.print("i=" + i + "\tx=? ");
			x = kb.nextInt();
			if (x==0)
				break;
		}
		System.out.println("i=" + i);
		System.out.println("Bye");
	}
}