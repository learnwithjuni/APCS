class Main {
  public static void main(String[] args) {
    drawLine(5);
    // drawLineBad(5);
  }

  public static void drawLineBad(int n) {
    System.out.print("-");
    drawLine(n-1);
  }

  public static void drawLine(int n) {
    if (n == 0) {
      System.out.println("That's all folks!");
    } else {
      System.out.print("-");
      drawLine(n-1);
    }
  }
}