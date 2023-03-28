public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        this.length = 1.0F;
        this.width = 1.0F;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return (double)this.length;
    }

    public double getWidth() {
        return (double)this.width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return (double)(this.length * this.width);
    }

    public double getPerimeter() {
        return (double)((this.length + this.width) * 2.0F);
    }

    public String toString() {
        return "OOP_Excersise.Exercise1.Rectangle[length=" + this.length + ", width=" + this.width + "]";
    }
}