
class Main {
  public static void main(String[] args) {
    
    //TODO: swap concrete implementation
    Shape shape = new Shape();

    //print info
    System.out.println("\n" + shape.getName());
    System.out.println("Area: " + shape.getArea());
    System.out.println("Perimeter: " + shape.getPerimeter());
    System.out.println("# of Sides: " + shape.getNumSides());
  }
}