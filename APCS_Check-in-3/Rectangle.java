
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