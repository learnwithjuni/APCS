
class Main {
  public static void main(String[] args) {
    Shape shape;

    //pick implementation
    shape = new Shape();
    //shape = new Square(15);
    //shape = new Rectangle(5, 10);
    //shape = new RightTriangle(3,4);
    //shape = new Circle(2.5);
    
    //print info
    System.out.println("\n" + shape.getName());
    System.out.println("Area: " + shape.getArea());
    System.out.println("Perimeter: " + shape.getPerimeter());
    System.out.println("# of Sides: " + shape.getNumSides());
  }
}