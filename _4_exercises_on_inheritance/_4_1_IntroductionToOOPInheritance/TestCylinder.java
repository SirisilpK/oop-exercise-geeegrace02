import java.io.PrintStream;

public class TestCylinder {
    public TestCylinder() {
    }

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        PrintStream var10000 = System.out;
        double var10001 = c1.getRadius();
        var10000.println("Cylinder: radius=" + var10001 + " height=" + c1.getHeight() + " base area=" + c1.getArea() + " volume=" + c1.getVolume());
        Cylinder c2 = new Cylinder(10.0);
        var10000 = System.out;
        var10001 = c2.getRadius();
        var10000.println("Cylinder: radius=" + var10001 + " height=" + c2.getHeight() + " base area=" + c2.getArea() + " volume=" + c2.getVolume());
        Cylinder c3 = new Cylinder(2.0, 10.0);
        var10000 = System.out;
        var10001 = c3.getRadius();
        var10000.println("Cylinder: radius=" + var10001 + " height=" + c3.getHeight() + " base area=" + c3.getArea() + " volume=" + c3.getVolume());
    }
}