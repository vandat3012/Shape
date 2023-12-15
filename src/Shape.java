public class Shape {
    boolean filled = true;
    String color = "green";
    public Shape() {
    }
    public Shape(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }
}
