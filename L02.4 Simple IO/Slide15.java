
public class Slide15 {
	public static void main(String[] args) {
		int i, j;
		i = 4;
		System.out.println( i + " " + Math.pow( i, 0.5 ) + " " + 
		     Math.pow( 3, 0.333333 ) );
		j = 10;
		System.out.println( j + " " + Math.pow( j, 0.5 ) + " " + 
		     Math.pow( 4, 0.333333 ) );
		
		i = 4;
		System.out.printf( "%3d %10.2f %10.3f\n", i, Math.pow( i, 0.5 ),
			Math.pow( i, 0.3333333 ) );
		j = 10;
		System.out.printf( "%3d %10.2f %10.3f\n", j, Math.pow( j, 0.5 ),
			Math.pow( i, 0.3333333 ) );

			int age = 18;
			String name = "Alan";
			System.out.println("Your Name: "+name+"\nYour age: "+age);
			System.out.printf("Your Name: %s\nYour age: %d\n", age, name);
	}
}