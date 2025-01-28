//Inheritance question 2

// Have the student define a subclass Square. Implement constructor by referencing super.

public class Square extends Rectangle {
  public Square(int w, int h, String color) {
    super(w, h, color);
  }

  // Question four
  public Square() {
    super(10,10,"Blue");
  }

  // Quesiton three
  @Override
  public int area() {
    return width*width;
  }

  // Question five
  public void setFillColor(String color) {
    this.fillColor = color;
  }
  public void setFillColor() {
    this.fillColor = "Blue";
  }

  // Question six
  // Ans: Does not require override tag because it does not exist in the parent class
  public boolean isSquare() {
    return width == height;
  }
}