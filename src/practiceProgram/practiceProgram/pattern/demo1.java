package practiceProgram.practiceProgram.pattern;

public class demo1 {
    public static void main(String[] args) {
        for (int i = 1; i <=3 ; i++) {
            for (int space = 0; space <3-i ; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //down stars
        for (int i = 1; i <=3 ; i++) {
            for (int space = 0; space <3-i ; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
