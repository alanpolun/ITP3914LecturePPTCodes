import java.util.*;

public class Slide26_noBreak {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String value;
        System.out.print("value? ");
        value = keyboard.nextLine();
        switch (value) {
            case "One":
            case "one":
            case "ONE":
                System.out.println(1);
                break;
            case "Two":
            case "two":
            case "TWO":
                System.out.println(2);
                break;
            case "Three":
            case "three":
            case "THREE":
                System.out.println(3);
                break;
            default:
                System.out.println("Invalid value");
        }
        System.out.println("after switch");
    }
}
