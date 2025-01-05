package practiceProgram.practiceProgram.pattern;

public class leftPascalsTriangle {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 1; i <= num ; i++) {
            for (int space = 1; space <= num- i ; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num - 1; i >= 1 ; i--) {
            for (int space = 1; space <= num- i ; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
