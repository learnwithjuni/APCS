class Main {
  public static void main(String[] args) {
    String name = "Juni";
    int i = 0;
    while (i < 10) {
      System.out.println(name);
      i++; // the loop repeats forever if this line is removed
    }

    for (int j = 0; j < 3; j++) {
      for (int k = 0; k < 4; k++) {
        System.out.println("j: " + j + " k: " + k);
      }
    }
  }
}