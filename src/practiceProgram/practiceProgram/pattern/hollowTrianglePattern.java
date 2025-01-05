package practiceProgram.practiceProgram.pattern;

public class hollowTrianglePattern {
    public static void main(String[] args) {

        // outer loop to handle rows
        for (int i = 1; i <= 6; i++) {
            // inner loop to print spaces.
            for (int j = i; j < 6; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                // printing stars.
                if (k == 1 || i == 6 || k == (2 * i - 1)) {
                    System.out.print("*");
                }
                // printing spaces.
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    }