package practiceProgram.practiceProgram.pattern;

public class hollowLeftPascalsTriangle {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num ; i++) {
            for (int j = 0; j <= num- i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                if (j==1 || j==i ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = num -1 ; i >=1 ; i--) {
            for (int j = 0; j <= num- i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                if (j==1 || j==i ){
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
