public class Slide22_hard {

    public static void main(String[] args) {
        int larger, num1, num2;
        boolean haveLarger = true; //flag

        num1 = 20;
        num2 = 20;

        //larger = (num1>num2) ? num1 : num2;
        if (num1 > num2) {
            larger = num1;
        } else if (num1 == num2) {
            haveLarger = false;
            larger = 0;
            System.out.println("Equal");
        } else {
            larger = num2;
        }

        if (haveLarger)
            System.out.println(larger);
    }

}
