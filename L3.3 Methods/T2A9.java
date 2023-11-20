public class T2A9 {
    public static void main(String[] args) {
        int numLine = 5;
        for(int i=1; i<=numLine; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(j+i+" ");
            }
            System.out.println();
        }
    }
}