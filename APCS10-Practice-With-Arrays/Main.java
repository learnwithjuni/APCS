import java.util.*;

class Main {
  public static void main(String[] args) {
    // 1. Create and print an array containing the first 10 perfect squares.
    
    int[] arr = new int[10];
    
    for (int i = 0; i < 10; i++) {
      arr[i] = i*i;
    }
    
    System.out.println("\nFirst 10 Perfect Squares:");
    for (int i : arr) {
      System.out.print(i + " ");
    }

    System.out.println();

    // 2. Write a method that takes in an array of integers and returns true if the first and last elements in the array are the same, otherwise return false.

    int[] arr1 = {0,1,2,3,4,5};
    int[] arr2 = {1,2,3,2,1};
    System.out.println("\nArr1 = " + Arrays.toString(arr1));
    System.out.println("Arr2 = " + Arrays.toString(arr2));

    System.out.println("\nArr1 has same first and last: " + hasSameFirstAndLast(arr1));
    System.out.println("Arr2 has same first and last: " + hasSameFirstAndLast(arr2));

    // 3. Write a method that takes in an array of integers and returns the sum of the integers in the array.

    System.out.println("\nArr1 sum: " + sum(arr1));
    System.out.println("Arr2 sum: " + sum(arr2));

    // 4. Write a method that takes in an array of strings and returns the total number of letters of all the strings.

    String[] arr3 = {"the", "pigs", "are", "flying"};
    System.out.println("\narr3 = " + Arrays.toString(arr3));
    System.out.println("Total letters in arr3: " + totalLetters(arr3));

    // 5. Write a method that takes in an array of integers and returns true if the integer 0 is contained within the array.

    System.out.println("\nArr1 contains zero: " + containsZero(arr1));
    System.out.println("Arr2 contains zero: " + containsZero(arr2));

    // 6. Write a method that takes in an integer N and returns an array with N random doubles between 0 and 10. In your main method, call this method and print out the resulting array.

    double[] arr4 = getRandomArray(3);
    System.out.println("\nRandom double array: ");
    for (double num : arr4) {
      System.out.print(num + " ");
    }
    System.out.println();

    // 7. Bonus: Write a method that takes in an array of integers and returns the array reversed. 

    int[] arr5 = reverse(arr1);
    int[] arr6 = reverse(arr2);

    System.out.println("\nArr1 reversed: ");
    for (int num : arr5) {
      System.out.print(num + " ");
    }
    System.out.println("\nArr2 reversed: ");
    for (int num : arr6) {
      System.out.print(num + " ");
    }
    System.out.println();
    // 8. Bonus: Write a method that takes in an array of integers and returns the array with the smallest and largest elements swapped.

    System.out.println("\nArr1 with biggest and smallest swapped: ");
    int[] arr7 = swapArr(arr1);

    for (int num : arr7) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  public static boolean hasSameFirstAndLast(int[] arr) {
    if (arr[0] == arr[arr.length-1]) {
      return true;
    }

    return false;
  }

  public static int sum(int[] arr) {
    int answer = 0;

    for (int num : arr) {
      answer += num;
    }

    return answer;
  }

  public static int totalLetters(String[] arr3) {
    int answer = 0;
    for (String s : arr3) {
      answer += s.length();
    }

    return answer;
  }

  public static boolean containsZero(int[] arr) {
    for (int num : arr) {
      if (num == 0) {
        return true;
      }
    }

    return false;
  }

  public static double[] getRandomArray(int N) {
    double[] arr = new double[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Math.random() * 10;
    }

    return arr;
  }

  public static int[] reverse(int[] arr) {
    int N = arr.length;
    int[] newArr = new int[N];

    for (int i = 0; i < N; i++) {
      newArr[N-i-1] = arr[i];
    }

    return newArr;
  }

  public static int[] swapArr(int[] arr) {
    int smallestNum = arr[0];
    int smallestIndex = 0;
    int largestNum = arr[0];
    int largestIndex = 0;
    
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < smallestNum) {
        smallestNum = arr[i];
        smallestIndex = i;
      }
      if (arr[i] > largestNum) {
        largestNum = arr[i];
        largestIndex = i;
      }
    }
    
    arr[smallestIndex] = largestNum;
    arr[largestIndex] = smallestNum;
    
    return arr;
  }
}