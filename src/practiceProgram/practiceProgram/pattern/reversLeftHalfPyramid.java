package practiceProgram.practiceProgram.pattern;

public class reversLeftHalfPyramid {
    public static void main(String[] args) {
        int num = 6;
        for (int row = num; row >= 1 ; row--) {
            for (int space = 1; space <= num -row ; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
