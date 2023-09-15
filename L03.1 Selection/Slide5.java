public class Slide5 {
	public static void main(String[] args) {
		int j=3, k=4, m=4, n=5;
		boolean test;
		test = j == 3 && n > m;
    	System.out.println("Result of j == 3 && n > m: "+test);
		test = j == 3 && k == 5;
    	System.out.println("Result of j == 3 && k == 5: "+test);
		test = j > k && n > m;
    	System.out.println("Result of j > k && n > m: "+test);
		test = j > k && j != 3;
    	System.out.println("Result of j > k && n > m: "+test);
	}
}