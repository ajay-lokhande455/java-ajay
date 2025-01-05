package practiceProgram.practiceProgram.pattern;

public class hollowDiamondPyramid {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 1; i <= num ; i++) {
            for (int j = i; j < num ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1) ; j++) {
                if (j == 1 || j == 2 * i - 1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = num - 1; i >=1 ; i--) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2 * i - 1) ; j++) {
                if (j == 1 || j == 2 * i - 1)
                {
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
