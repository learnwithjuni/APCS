public class Square extends Shape {
  private double sideLength;

  public Square(double sideLength){
    super("Square", 4);
    this.sideLength = sideLength;
  }

  @Override
  public double getArea(){
    return sideLength*sideLength;
  }
  @Override
  public double getPerimeter(){
    return this.getNumSides()*sideLength;
  }

  public double getSideLength(){
    return sideLength;
  }
  public void setSideLength(int sideLength){
    this.sideLength = sideLength;
  }

}