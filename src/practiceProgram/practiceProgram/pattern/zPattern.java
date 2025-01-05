package practiceProgram.practiceProgram.pattern;

public class zPattern {
    public static void main(String[] args) {
        int num = 6;
        for (int i = num; i >=1 ; i--) {
            for (int space = 1; space <= num-i ; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i <= num ; i++) {
            for (int space = 1 ; space <= 5; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
