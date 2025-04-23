class Main {
  public static void main(String[] args) {
    int[] arr = {2, 4, 5, 7, 8, 10, 14, 16, 19, 20, 34, 55, 62, 74, 99};
    System.out.println(linearSearch(arr, 10));
    System.out.println(linearSearchSorted(arr, 10));
    System.out.println(linearSearch(arr, 11));
    System.out.println(linearSearchSorted(arr, 11));
  }

  public static boolean linearSearch(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return true;
      }
    }
    return false;
  }

  public static boolean linearSearchSorted(int[] arr, int key) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return true;
      } else if (arr[i] > key) {
        return false;
      }
    }
    return false;
  }
}