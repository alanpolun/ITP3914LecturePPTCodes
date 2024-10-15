import java.util.*;

public class PassByV {
	public static void main(String[] args) {
		int temp;
        int a = 10, b = 20; //Local Variable
		System.out.println("a=" + a + ", b=" + b);
		swap(a, b);
		System.out.println("a=" + a + ", b=" + b);
	}

	public static void swap (int a, int b) { //local variable
		System.out.println("\ta=" + a + ", b=" + b);
		int temp=a;
		a = b;
		b = temp;
		System.out.println("\ta=" + a + ", b=" + b);
    }

    public static void swap(int x, double y){

    }
}