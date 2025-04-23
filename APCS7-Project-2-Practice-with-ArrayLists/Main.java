import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    
    ArrayList<Integer> nums = new ArrayList();
    ArrayList<Double> decimalNums = new ArrayList();
    for (int i = 0; i < 10; i++) {
      nums.add((int)(Math.random()*100));
      decimalNums.add(Math.random()*10 - 5);
    }
    
    System.out.println(nums);
    System.out.println(numEvens(nums));
    System.out.println(sum(nums));
    
    ArrayList<String> words = new ArrayList();
    words.add("class");
    words.add("apple");
    words.add("teacher");
    System.out.println(startsWithA(words));
    
    System.out.println(decimalNums);
    replaceNums(decimalNums);
    System.out.println(decimalNums);

    System.out.println(nums);
    removeLastEven(nums);
    System.out.println(nums);
  }

  // 1. Write a method that takes in an ArrayList of integers and returns the number of even numbers in the list.
  public static int numEvens(ArrayList<Integer> nums) {
    int count = 0;
    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) % 2 == 0) {
        count++;
      }
    }
    return count;
  }
  
  // 2. Write a method that takes in an ArrayList of integers and returns the sum of the list.
  public static int sum(ArrayList<Integer> nums) {
    int sum = 0;
    for (int i = 0; i < nums.size(); i++) {
      sum += nums.get(i);
    }
    return sum;
  }
  
  // 3.  Write a method that takes in an ArrayList of words and returns an ArrayList of only the words that start with the letter 'a.'
  public static ArrayList<String> startsWithA(ArrayList<String> words) {
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i < words.size(); i++) {
      if (words.get(i).charAt(0) == 'a') {
        result.add(words.get(i));
      }
    }
    return result;
  }

  // 4. Write a method that takes in an ArrayList of doubles and edits the elements in the ArrayList so that negative numbers are replaced with -1.0 and positive numbers are replaced with 1.0.
  public static void replaceNums(ArrayList<Double> nums) {
    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) < 0) {
        nums.set(i, -1.0);
      } else if (nums.get(i) > 0) {
        nums.set(i, 1.0);
      }
    }
  }

  // 5. Write a method that takes in an ArrayList of integers and removes the very last even number in the ArrayList.
  public static void removeLastEven(ArrayList<Integer> nums) {
    // Method 1: loop from the end towards the beginning
    for (int i = nums.size() - 1; i >= 0; i--) {
      if (nums.get(i) % 2 == 0) {
        nums.remove(i);
        break;  // or return
      }
    }

    /*
    // Method 2: loop from the beginning towards the end, store the last seen even index
    int evenI = -1;
    for (int i = 0; i < nums.size(); i++) {
      if (nums.get(i) % 2 == 0) {
        evenI = i;
      }
    }

    if (evenI != -1) {
      nums.remove(evenI);
    }
    */
  }
}