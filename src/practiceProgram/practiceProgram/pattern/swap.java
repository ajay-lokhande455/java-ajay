package practiceProgram.practiceProgram.pattern;

public class swap {
    public static void main(String[] args) {
        int a = 10;

        int b = 20;

        int temp = 0;


        temp = a ;
        a = b ;
        b = temp;

        System.out.println(" a = "+a+ "b = "+b);
    }
}
