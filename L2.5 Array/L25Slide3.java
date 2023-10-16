import java.util.*;
public class L25Slide3{
	public static void main(String [ ] args) {
		Scanner 	keyboard = new Scanner(System.in);
		int 		grade1, grade2, grade3, grade4;
		double 	average;
		grade1 = keyboard.nextInt();
		grade2 = keyboard.nextInt();
		grade3 = keyboard.nextInt();
		grade4 = keyboard.nextInt();
		average = (grade1 + grade2 + grade3 + grade4) / 4.0;
		System.out.println("Average = " + average);
	}
}	
