public class Slide4 {
	public static void main(String[] args) {
		int j = 3, k = 4, m = 4, n = 5;
		boolean test;
		test = (true) && (4 < 3);
		System.out.println("Result of k == m: " + test + "!");
		test = j == k;
		System.out.println("Result of j == k: " + test);
		test = k != m;
		System.out.println("Result of k != m: " + test);
		test = j != k;
		System.out.println("Result of j != k: " + test);
		test = n > m;
		System.out.println("Result of n > m: " + test);
		test = m > k;
		System.out.println("Result of m > k: " + test);
		test = n >= m;
		System.out.println("Result of n >= m: " + test);
		test = m >= k;
		System.out.println("Result of m >= k: " + test);

	}
}