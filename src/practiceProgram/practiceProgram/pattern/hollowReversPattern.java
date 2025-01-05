package practiceProgram.practiceProgram.pattern;

public class hollowReversPattern {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 6; i >= 1 ; i--) {
            for (int space = i; space < num ; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1) ; j++) {
                if (j == 1 || i == num || j == (2 * i - 1)){
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
