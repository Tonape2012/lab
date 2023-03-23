public class Atrangle {
    public static void main(String[] args) {
        int numRows = 5; 
        for (int i = numRows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}