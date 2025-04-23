class Main {
  public static void main(String[] args) {
    int[][] intArray = new int[][] {
      {1, 3, 5, 7, 9},
      {1, 2, 3, 4, 5},
      {2, 4, 6, 8, 10},
      {5, 4, 3, 2, 1}
    };

    int[][] intArray2 = new int[][] {
      {1, 3, 5, 7, 9},
      {2, 4, 6, 8, 5},
      {5, 5, 5, 5, 5},
      {25, -25, 25, -25, 25}
    };

    System.out.println(containsValue(intArray, 6));
    System.out.println(containsValue(intArray, 11));
    System.out.println(sumOfArray(intArray));
    System.out.println(isRowMagic(intArray));
    System.out.println(isRowMagic(intArray2));
  }

  // 1. Write a method that takes in a 2D array of integers and a value, and returns whether or not that value is in the 2D array.
  public static boolean containsValue(int[][] arr2D, int value) {
    for (int i = 0; i < arr2D.length; i++) {
      for (int j = 0; j < arr2D[i].length; j++) {
        if (arr2D[i][j] == value) {
          return true;
        }
      }
    }

    return false;
  }

  // 2. Write a method that takes in a 2D array of integers and returns the sum of all of the values in the 2D array.
  public static int sumOfArray(int[][] arr2D) {
    int sum = 0;

    for (int i = 0; i < arr2D.length; i++) {
      for (int j = 0; j < arr2D[i].length; j++) {
        sum += arr2D[i][j];
      }
    }

    return sum;
  }

  // 3. Write a method that takes in a 2D array of integers and returns true or false, depending on whether or not every row in the 2D array has the same sum.
  public static boolean isRowMagic(int[][] arr2D) {
    int firstRowSum = 0;
    for (int i = 0; i < arr2D[0].length; i++) {
      firstRowSum += arr2D[0][i];
    }

    for (int i = 1; i < arr2D.length; i++) {
      int curRowSum = 0;
      for (int j = 0; j < arr2D[i].length; j++) {
        curRowSum += arr2D[i][j];
      }

      if (curRowSum != firstRowSum) {
        return false;
      }
    }

    return true;
  }
}