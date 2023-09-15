import java.util.*;
public class Slide21 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int	score;
		System.out.print("Score? ");
		score = keyboard.nextInt();
		char grade;
		if (score > 89)
			grade = 'A';
		else if (score > 79)
			grade = 'B';
		else if (score > 69)
			grade = 'C';
		else if (score > 59)
			grade = 'D';
		else
			grade = 'F';
			
		System.out.println("Your score is " + score);
		System.out.println("Your grade is " + grade);
	}
}