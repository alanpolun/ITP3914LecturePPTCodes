import java.util.*;
public class Slide12 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int	score;
		System.out.print("Score? ");
		score = keyboard.nextInt();

		if   (score >= 40){
			System.out.println("Congratulations!");
			System.out.println("You got a pass.");
		}
		System.out.println("Your score is " + score);	
	}
}