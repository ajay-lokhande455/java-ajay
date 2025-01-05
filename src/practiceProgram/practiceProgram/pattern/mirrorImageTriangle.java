package practiceProgram.practiceProgram.pattern;

public class mirrorImageTriangle {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 1; i <= num ; i++) {
            for (int space = 1; space < i ; space++) {
                System.out.print(" ");
            }
            for (int j = i; j <= num ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = num - 1; i >= 1 ; i--) {
            for (int space = 1; space < i ; space++) {
                System.out.print(" ");
            }
            for (int j = i; j <= num ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
