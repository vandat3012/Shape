public class Circle extends Shape {
    double radius = 1.0;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(boolean filled, String color, double radius) {
        super(filled, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter () {
        return  2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", which is a subclass of " +
                super.toString() + " }";

    }
}
