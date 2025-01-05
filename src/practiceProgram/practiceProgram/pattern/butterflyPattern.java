package practiceProgram.practiceProgram.pattern;

public class butterflyPattern {
    public static void main(String[] args) {
        int i, j;
        int num = 6;

        // outer loop to handle upper part
        for (i = 1; i <= num; i++) {
            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // inner loop to print spaces
            int spaces = 2 * (num - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int k = num; k >= 1 ; k--) {
            for (int l = 1; l <= k ; l++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 2 * (num - k) ; space++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= k; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
