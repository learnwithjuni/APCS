import java.util.*;

class Main {
  public static void main(String[] args) {
    
    // ARRAYS
    
    // array initialization
    int[] arr1 = new int[10];
    int arr2[] = new int[10];
    int[] arr3;
    arr3 = new int[10];
    int[] arr4 = {1, 2, 3};
    
    // array traversal
    for (int i = 0; i < arr4.length; i++) {
      System.out.println(arr4[i]);
    }
    
    for (int i : arr4) {
      System.out.println(i);
    }
    
    // ARRAYLISTS
    
    // ArrayList initialization
    List<Integer> list = new ArrayList<Integer>();
    
    // fill with ten random numbers between 0-99
    for (int i = 0; i < 10; i++) {
      list.add((int)(Math.random()*100));
    }
    System.out.println(list);
    
    // double each number in the list
    for (int i = 0; i < list.size(); i++) {
      list.set(i, list.get(i)*2);
    }
    System.out.println(list);
    
    // insert the number 0 at the 5th position
    list.add(5,0);
    System.out.println(list);
    
    // list.set(11,0); // throws IndexOutOfBoundsException
    
    // remove that number
    list.remove(5);
    System.out.println(list);
    
    // list.remove(11); // throws IndexOutOfBoundsException
    
    // TWO-DIMENSIONAL ARRAYS
    
    // two-dimensional array initialization
    int[][] grid = new int[3][2];
    int[][] grid2 = { {1, 2, 3}, {4, 5, 6} };
    
    
    // two-dimensional array traversal
    for (int i = 0; i < grid2.length; i++) {
      for (int j = 0; j < grid2[i].length; j++) {
        System.out.println(grid2[i][j]);
      }
    }
    
    for (int[] row : grid2) {
      for (int num : row) {
        System.out.println(num);
      }
    }
  }
}