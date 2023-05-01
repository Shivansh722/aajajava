public class pattern2 {
    public static void main(String[] args) {
        int r = 5;

        // loop through each row
        for (int i = 1; i <= r; i++) {
            // print spaces before the numbers
            for (int k = 1; k <= (r - i) * 2; k++) {
                System.out.print(" ");
            }
            
            // loop through the first half of the row
            for (int j = i; j < 2*i; j++) {
                System.out.print(j + " ");
            }
            
            // loop through the second half of the row
            for (int j = 2*i-2; j >= i; j--) {
                System.out.print(j + " ");
            }
            
            // move to the next line for the next row
            System.out.println();
        }
    }
}
