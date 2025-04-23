class Main {
  public static void main(String[] args) {
    /*
    System.out.println(f1(10));
    System.out.println();

    System.out.println(f2(10));
    System.out.println();

    System.out.println(f3(3, 7));
    System.out.println();
    
    System.out.println(f4(128));
    System.out.println();

    int[] nums = {1, 2, 3, 4};
    System.out.println(f5(nums));
    System.out.println();

    System.out.println(f6(nums));
    */
  }
  
  //2n operations
  public static int f1(int n) {
    int count = 0;
    for (int i = 0; i < 2*n; i++) {
      // System.out.println(i);
      count++;
    }
    return count;
  }

  // n^2 operations
  public static int f2(int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        // System.out.println(i*j);
        count++;
      }
    }
    return count;
  }

  // n*m operations
  public static int f3(int n, int m) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        // System.out.println(i*j);
        count++;
      }
    }
    return count;
  }

  // log2(n) operations 
  public static int f4(int n) {
    count = 0;
    while (n > 0) {
      n /= 2;
      count++;
    }
    return count;
  }

  // n^2 operations 
  public static int f5(int[] arr) {
    count = 0;
    for (int num1 : arr) {
      for (int num2 : arr) {
        // System.out.println(num1 * num2);
        count++;
      }
    }
    return count;
  }

  /* ~n^2 operations
  0 times, then 1 time, then 2 times, and so on, all the way up to n-1 times. Summing, the method performs 0 + 1 + 2 + … + n-2 + n-1 = ~n^2 operations
  */
  public static int f6(int[] arr) {
    count = 0;
    for (int i = 0; i < arr.length; i++) {
      int total = 0;
      for (int j = 0; j < i; j++) {
        // total += arr[j];
        count++;
      }
      // System.out.println(total);
      count++;
    }
    return count;
  }
}