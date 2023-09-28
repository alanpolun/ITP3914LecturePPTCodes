public class Slide18 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int k = 7;
        while (i <10) {
            sum += i;
            System.out.println("i: " + i + " sum: " + sum);
            i++;
            j--;
            k+=2;
        }
        System.out.println("Sum=" + sum);
    }
}
