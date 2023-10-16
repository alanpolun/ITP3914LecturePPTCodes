import java.util.*;
public class L25Slide14 {
	public static void main(String [ ] args) {
		int[][] myTable = { 	{89, 76, 6, 85, 4},
								{56, 24, 52, 90, 85},
								{3, 11, 34, 23, 62},
								{19, 63, 18, 9, 11} };

		for (int row=0; row<myTable.length; row++){
			for (int col=0; col<myTable[row].length; col++){ 
				System.out.print(myTable[row][col] + " ");
			}
			System.out.println();
		} 
	}
}	
