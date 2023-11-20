public class T2A10 {
    public static void main(String[] args) {
        int numLine = 5;
        for(int i=1; i<=numLine; i++) {
            for(int j=0; j<numLine-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<i*2; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
