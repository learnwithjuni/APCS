import java.util.Arrays;
import java.util.Random;

class Main {
  private static final int SIZE = 15;
  public static void main(String[] args) {

    Random random = new Random();
    int[] data = new int[SIZE];
    for(int i = 0; i < SIZE; i++){
      data[i] = random.nextInt(100);
    }
    Arrays.sort(data);
    System.out.println("\n"+Arrays.toString(data));


    System.out.print("Is " + data[0] + " in the array? ");
    System.out.println(binaryIterative(data[0], data));

    System.out.print("Is " + data[SIZE/2] + " in the array? ");
    System.out.println(binaryRecursive(data[SIZE/2], data, 0, SIZE-1));

    System.out.print("Is " + 200 + " in the array? ");
    System.out.println(binaryRecursive(50, data, 0, SIZE-1));
  }

  public static boolean binaryIterative(int target, int[] data) {
    int lo = 0;
    int hi = data.length-1;
    while(lo <= hi){
      int mid = (lo + hi) / 2;
      if(target == data[mid]){
        //found it!
        return true;
      }else if (target < data[mid]) {
        //search in bottom half
        hi = mid - 1;
      } else if (target > data[mid]) {
        //search in top half
        lo = mid + 1;
      }
    }
    // target isn't in the list
    return false;
  }

  public static boolean binaryRecursive(int target, int[] data, int lo, int hi) {

    //base case
    if (lo > hi) {
      return false;
    }

    //recursive step
    int mid = (lo + hi) / 2;
    if(target == data[mid]){
      //found it!
      return true;
    }else if (target < data[mid]) {
      //search in bottom half
      return binaryRecursive(target, data, lo, mid-1);
    }else if (target > data[mid]) {
      //search in top half
      return binaryRecursive(target, data, mid+1, hi);
    } 
    //unreachable statement
    return false;
  }
}