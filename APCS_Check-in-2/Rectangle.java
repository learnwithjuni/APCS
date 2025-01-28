//Inheritance question 1

// Have the student define a superclass Rectangle with instance variables corresponding to width, height, and fillColor and a constructor. Include area method.


public class Rectangle {
  int width;
  int height;
  String fillColor;

  public Rectangle(int w, int h, String color) {
    this.width = w;
    this.height = h;
    this.fillColor = color;
  }

  public int area() {
    return width * height;
  }
}