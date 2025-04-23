import java.lang.Math;
public class Circle extends Shape {
  private double radius;

  public Circle(double radius){
    super("Circle", 0);
    this.radius = radius;
  }
  public double getArea(){
    return Math.PI*Math.pow(radius, 2);
  }
  public double getPerimeter(){
    return  2*Math.PI*radius;
  }
}