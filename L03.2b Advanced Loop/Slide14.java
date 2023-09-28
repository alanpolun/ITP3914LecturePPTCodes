import java.util.*;

public class Slide14 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int	n, cnt=0;
		
		System.out.print("Value? ");
		n = keyboard.nextInt();
		
		for (int i=0; i<=n; i++)
			for (int j=0; j<=n; j++) 
				for (int k=0; k<=n; k++)
					if (i + j + k == n) {
						System.out.println(i + ", " + j + ", " + k);
						cnt++;
					}
		System.out.println("Count=" + cnt);

	}
}