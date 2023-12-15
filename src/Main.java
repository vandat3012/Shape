
public class Main {
    public static void main(String[] args) {
       System.out.println("Test Shape");
       Shape shape = new Shape();
       System.out.println(shape);
       shape = new Shape(false , "pink");
       System.out.println(shape);

       System.out.println("Test Circle");
       Circle circle = new Circle();
       System.out.println(circle);
       circle = new Circle(2.0);
       System.out.println(circle);
       circle = new Circle(false, "red" , 3.0);
       System.out.println(circle);

       System.out.println("Test Rectangle");
       Rectangle rectangle = new Rectangle();
       System.out.println(rectangle);
       rectangle = new Rectangle(2.0 , 3.0);
       System.out.println(rectangle);
       rectangle = new Rectangle(false, "blue" , 4.0 , 5.0);
       System.out.println(rectangle);

       System.out.println("Test Square");
       Square square = new Square();
       System.out.println(square);
       square = new Square(5.0 , "yellow" , false);
       System.out.println(square);
       square = new Square(7.0);
       System.out.println(square);
    }
}