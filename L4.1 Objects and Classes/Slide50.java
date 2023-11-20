class Fraction {
	private int num, den;
	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	private int findGcd(int a, int b) {
		if (b==0)
			return a;
		else if (b>a)
			return findGcd(b, a);
		else
			return findGcd(b, a%b);
	}
	
	public String toString() { return num + "/" + den; }
	
	public Fraction multiply(int n) {
		int num = this.num * n;
		int den = this.den;
		int gcd = findGcd(num, den);
		num = num / gcd;
		den = den / gcd;
		Fraction f = new Fraction(num, den);
		return f;
	}
}


public class Slide50 {
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3, 4);
		Fraction f2 = f1.multiply(10);
		System.out.println(f1 + " * 10 = " + f2);
	}
}