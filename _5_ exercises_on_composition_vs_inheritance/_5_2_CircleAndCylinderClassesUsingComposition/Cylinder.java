public class Cylinder extends Circle {

    private Circle base;
    private double height = 1.0;

    public Cylinder() {
        this.base = new Circle();
    }

    public Cylinder(double radius) {
        super(radius);
        this.base = new Circle();
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
        this.base = new Circle();
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.base = new Circle();
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
        this.base = new Circle();
    }

    public Cylinder(double radius_1, String color_1, double radius_2, String color_2) {
        super(radius_1, color_1);
        this.base = new Circle(radius_2, color_2);
    }

    public Cylinder(double height, double radius_1, String color_1, double radius_2, String color_2) {
        super(radius_1, color_1);
        this.height = height;
        this.base = new Circle(radius_2, color_2);
    }

    public Cylinder(double radius_1, String color_1, double radius_2, String color_2, double height) {
        super(radius_1, color_1);
        this.height = height;
        this.base = new Circle(radius_2, color_2);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Cylinder["+ "circle=" + super.toString() + "" + "base=" + base + ", height=" + height + '}';
    }
}