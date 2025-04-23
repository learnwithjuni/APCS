class Main {
  public static void main(String[] args) {
    // printing a variable and cutting it in half until it's zero
    int val = 129;
    while (val > 0) {
      System.out.println(val);
      val /= 2;
    }

    System.out.println();

    // printing random numbers until 7 is generated
    int num = (int) (Math.random() * 10);
    while (num != 7) {
      System.out.println(num);
      num = (int) (Math.random() * 10);
    }

    System.out.println();

    // staircase pattern using a for loop
    for (int j = 0; j < 10; j++) {
      for (int k = 0; k <= j; k++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println();

    // staircase pattern using a while loop
    int j = 0;
    while (j < 10) {
      int k = 0;
      while (k <= j) {
        System.out.print("*");
        k++;
      }
      System.out.println();
      j++;
    }

    System.out.println();

    // 12x12 multiplication table using a for loop
    for (int i = 1; i <= 12; i++) {
      for (j = 1; j <= 12; j++) {
        System.out.print(i*j + "\t");
      }
      System.out.println();
    }
    
    System.out.println();

    // 12x12 multiplication table using a while loop
    int i = 1;
    while (i <= 12) {
      j = 1; 
      while (j <= 12) {
        System.out.print(i*j + "\t");
        j++;
      }
      System.out.println();
      i++;
    }
  }
}