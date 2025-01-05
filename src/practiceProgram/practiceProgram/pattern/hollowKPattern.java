package practiceProgram.practiceProgram.pattern;

public class hollowKPattern {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 1; i <= num ; i++) {
            for (int j = i; j <= num; j++) {
                if (j == i || i == 1 || j == num) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 2; i <= num ; i++) {
            for (int j = 1 ; j <= i; j++) {
                if (j == 1 || j == i || i == 6 ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
