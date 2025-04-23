class Main {
  public static void main(String[] args) {
    System.out.println(f1(4));
    System.out.println();

    System.out.println(f2(3));
    System.out.println();

    f3("juni learning");
    System.out.println("\n");

    System.out.println(f4(15678));
  }

  // f1(4) = 4 + 3 + 2 + 1 = 10
  // Returns the sum of all the integers up through n (sometimes called summation or "plus-torial")
  public static int f1(int n) {
    if (n <= 1) {
      //base case
      return n;
    }
    //recursive step
    return n + f1(n - 1);
  }

  // f2(3) = 7
  // 3 --> 10 --> 5 --> 16 --> 8 --> 4 --> 2 --> 1, so returns 7
  // Collatz Conjecture
  // Returns the number of steps required to reach 1
  public static int f2(int n) {
    if (n <= 1) {
      //base case
      return 0;
    } else if (n % 2 == 0) {
      // n is even
      // recursive step
      return 1 + f2(n / 2);
    } else {
      // n is odd
      // recursive step
      return 1 + f2(n * 3 + 1);
    }
  }

  // f3("juni learning") = gninrael inuj
  // Prints the input string in reverse
  public static void f3(String word) {

    if (word.length() > 0) {
      //recursive step
      f3(word.substring(1));
      System.out.print(word.charAt(0));
    }
    //base case: word.length() <= 0
  }

  // f4(15678) = true
  // Determines if the number is a multiple of 3
  // It figures it out by using the following math trick:
  // Add up the digits of the input until it's a single digit.
  // If that number is a multiple of 3, the original number is as well.
  public static boolean f4(int n) {

    if (n < 10) {
      // base case
      return n % 3 == 0;
    } else {
      // recursive step
      int total = 0;
      while (n > 0) {
        total += n % 10;
        n /= 10;
      }
      return f4(total);
    }
  }
}