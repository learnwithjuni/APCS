import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(4);
    nums.add(7);
    nums.add(3);
    nums.add(2);
    nums.add(5);
    nums.add(6);
    nums.add(8);
    nums.add(1);
    
    ArrayList<Integer> numsSorted = linearSort(nums);
    System.out.println(numsSorted);
  }

  public static ArrayList<Integer> linearSort(ArrayList<Integer> nums) {
    ArrayList<Integer> result = new ArrayList<Integer>();

    while (nums.size() != 0) {
      int smallest = nums.get(0);
      int smallestIndex = 0;
      for (int i = 0; i < nums.size(); i++) {
        if (nums.get(i) < smallest) {
          smallest = nums.get(i);
          smallestIndex = i;
        }
      }
      result.add(smallest);
      nums.remove(smallestIndex);
    }

    return result;
  }
}

