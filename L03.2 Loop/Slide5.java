import java.util.*;
public class Slide5 {
	public static void main(String [ ] args) {
		int i=1;
		int sum=0;
		int term;
		Scanner kb
		 = new Scanner(System.in);
		System.out.print("Enter a number: ");
		term = kb.nextInt();
		while (i <= term) {
			sum += i;
			System.out.println("i: "+i+" sum: "+sum);
			i++;
			
		}	
		System.out.println("Sum=" + sum);
	}
}	