import java.util.*;
public class L25Slide3{
	public static void main(String [ ] args) {
		Scanner 	keyboard = new Scanner(System.in);
		//int 		grade1, grade2, grade3, grade4, grade5;
		int[] grade;
		int numOfgrade;
		System.out.print("How many students? ");
		numOfgrade = keyboard.nextInt();
		grade = new int[numOfgrade];
		double 	average, sum=0;
		for(int i=0; i<grade.length; i++){
			grade[i] = keyboard.nextInt();
			sum += grade[i];
		}
		
		average = sum / grade.length;
		System.out.println("Average = " + average);
	}
}	
