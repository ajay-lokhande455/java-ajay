package practiceProgram.practiceProgram.pattern;

public class hollowDiamond {
    public static void main(String[] args) {
        int no = 5;
        for (int  i = no  ; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 2 * (no - i) ;space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1 ; i <= no ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2 * (no - i ); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
