public class Slide3 {
	public static void main(String[] args) {
		int [ ] myArray = { 11, 22, 33, 44 };
		System.out.println("Original Array:");
		for (int i=0; i < myArray.length; i++)
			System.out.println(myArray[i]);
		modifyArray ( myArray ) ;
		System.out.println("\nAfter calling modifyArray():");
		for (int i=0; i < myArray.length; i++)
			System.out.println(myArray[i]);
	}
	
	public static void modifyArray( int [ ] arr ) {
		for (int j=0; j < arr.length; j++)
			arr[j] *= 2;
	}

}