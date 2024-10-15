import java.util.*;
public class Sum {
	public static void main(String [ ] args) {
		int i=1;
		int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n:");
        int n = sc.nextInt();
		while (i <= n) {
			sum += i;
			i++;
		}	
		System.out.println("Sum=" + sum);
	}
}	
