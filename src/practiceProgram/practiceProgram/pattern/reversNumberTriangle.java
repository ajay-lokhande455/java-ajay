package practiceProgram.practiceProgram.pattern;

public class reversNumberTriangle {
    public static void main(String[] args) {
        int i, j;
        // outer loop to handle rows
        for (i = 1; i <= 6; i++) {

            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // inner loop to print value of j.
            for (j = i; j <= 6; j++) {
                System.out.print(j + " ");
            }

            // printing new line for each row
            System.out.println();
        }
    }
}
