package practiceProgram.practiceProgram.pattern;

public class hollowHourglassPattern {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 1; i <= num; i++) {
            // inner loop to print spaces.
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // inner loop to print value of j.
            for (int j = i; j <= num; j++) {
                if(j==i||j==num||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            // printing new line for each row
            System.out.println();
        }
        for (int i = num - 1; i >=1 ; i--) {
            for (int space = 1; space < i ; space++) {
                System.out.print(" ");
            }
            for (int j = i; j <= num ; j++) {
                if(j==i||j==num||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
