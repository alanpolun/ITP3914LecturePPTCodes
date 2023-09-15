import java.util.*;

public class Slide15 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int	score;
		char grade;
		System.out.print("Score? ");
		score = keyboard.nextInt();
		if   (score >= 40) {
			grade = 'P';
			System.out.println("Congratulations!");
		} else {
			grade = 'F';
			System.out.println("Work hard!");
		}
		System.out.println("Your score is " + score);
		System.out.println("Your grade is " + grade);

	}
}