import java.io.PrintStream;

public class TestCircle {
    public TestCircle() {
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        PrintStream var10000 = System.out;
        double var10001 = c1.getRadius();
        var10000.println("The circle has radius of " + var10001 + " and area of " + c1.getArea());
        Circle c2 = new Circle(2.0);
        var10000 = System.out;
        var10001 = c2.getRadius();
        var10000.println("The circle has radius of " + var10001 + " and area of " + c2.getArea());
    }
}