public class Circle {
	public static void main(String[] args) {

		int i = 10;
		int k = 7;
		int j = k++ + ++i; //i += 1
		System.out.println(i);
		System.out.println(k);
		System.out.println("j = "+j);
		--i; //i -= 1
		System.out.println(i);
	}
}
