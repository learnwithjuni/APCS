class Main {
  public static void main(String[] args) {
    /*
    System.out.println(f1(4));
    System.out.println();

    System.out.println(f2(3));
    System.out.println();

    f3("juni learning");
    System.out.println("\n");

    System.out.println(f4(15678));
    */
  }

  public static int f1(int n) {
    if (n <= 1) {
      return n;
    }
    return n + f1(n - 1);
  }

  public static int f2(int n) {
    System.out.println(n);
    if (n <= 1) {
      return 0;
    } else if (n % 2 == 0) {
      return 1 + f2(n / 2);
    } else {
      return 1 + f2(n * 3 + 1);
    }
  }

  public static void f3(String word) {
    if (word.length() > 0) {
      f3(word.substring(1));
      System.out.print(word.charAt(0));
    }
  }

  public static boolean f4(int n) {
    if (n < 10) {
      return n % 3 == 0;
    } else {
      int total = 0;
      while (n > 0) {
        total += n % 10;
        n /= 10;
      }
      return f4(total);
    }
  }
}