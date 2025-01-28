public class Square extends Rectangle {
  public Square(int w, int h, String color) {
    super(w, h, color);
  }

  public Square() {
    super(10,10,"Blue");
  }

  @Override
  public int area() {
    return width*width;
  }

  public void setFillColor(String color) {
    this.fillColor = color;
  }
  public void setFillColor() {
    this.fillColor = "Blue";
  }

  // Does not require override tag because it does not exist in the parent class
  public boolean isSquare() {
    return width == height;
  }
}