public class Square extends Rectangle {
    public Square() {
    }
    public Square (double size) {
        super(size , size);
    }
    public Square(double size, String color, boolean filled) {
        super(filled, color , size , size);
    }

    public double getSize() {
        return getWidth();
    }
    public void setSize(double size) {
        setWidth(size);
        setLength(size);
    }

    @Override
    public void setLength(double length) {
        setSize(length);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public String toString() {
        return "Square{ size = "
                + getSize()
                + ", which is a subclass of "
                + super.toString();
    }
}
