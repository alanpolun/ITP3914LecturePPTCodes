public class Slide13 {
	public static void main(String[] args) {
		int primeCount=1;
		System.out.print(2);  // 2 is the first prime number
		int num=2;
		while (primeCount < 20) {
			num++;			// try next number
			boolean isPrime=true;
			for (int i=2; i<num; i++) {
				if (num%i == 0)   	// divisible by i
					isPrime = false;    // not a prime
			}
			if (isPrime) {
				primeCount++;	// one more prime is found
				System.out.print(", " + num);
			}
		}
		System.out.println("\nDone");

	}
}