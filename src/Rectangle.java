public class Rectangle extends Shape {
    double width = 1.0;
    double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(boolean filled, String color, double width, double length) {
        super(filled, color);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", which is a subclass of" +
                super.toString() + "}";
    }
}
