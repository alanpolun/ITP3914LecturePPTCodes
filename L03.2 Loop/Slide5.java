import java.util.*;
public class Slide5 {
	public static void main(String [ ] args) {
		int i=1;
		int sum=0;
		while (i < 4) {
			sum += i;
			i++;
			System.out.println("i: "+i+" sum: "+sum);
		}	
		System.out.println("Sum=" + sum);
	}
}	