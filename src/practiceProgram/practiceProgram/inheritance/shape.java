package practiceProgram.practiceProgram.inheritance;

public class shape {

    public double calculateArea(double sideOrRadius){
        return 0;
    }
    public double calculateParameter(double sideOrRadius){
        return 0;
    }
}
class Square extends shape {
    public double calculateArea(double side){
        return side * side;
    }

    public double calculateParameter(double side) {
        return 4 * side;
    }
}
class Circle extends shape{
    double PI = Math.PI;

    public double calculateArea(double Radius) {
        return PI * Radius * Radius ;
    }
    public double calculateParameter(double Radius) {
        return 2 * PI * Radius ;
    }
}
class TestAbstraction {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        double area = c1.calculateArea(10.2);
        System.out.println(area);
        double parameter = c1.calculateParameter(10.2);
        System.out.println(parameter);

        Square square = new Square();
        double AreaOfSquare = square.calculateArea(12);
        System.out.println(AreaOfSquare);
        double AreaOfParameter = square.calculateParameter(12);
        System.out.println(AreaOfParameter);
    }
}
