import java.util.ArrayList;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    int size = 10;
    ArrayList<Integer> nums = new ArrayList<>();
    Random random = new Random();

    //add random numbers
    for(int i = 0; i < size; i++){
      nums.add(random.nextInt(100));
    }

    System.out.println("\nUnsorted: " + nums);
    selectionSort(nums); 
    System.out.println("Sorted: " + nums);

  }

  public static void selectionSort(ArrayList<Integer> nums){ 
    for(int i = 0; i < nums.size(); i++){
      //1. find the next smallest
      int minIndex = i;
      for(int j = i; j < nums.size(); j++){
        if(nums.get(j) < nums.get(minIndex)){
          minIndex = j;
        }
      }
      //2. swap to the end of the sorted section
      int min = nums.get(minIndex);
      int temp = nums.get(i);
      nums.set(i, min);
      nums.set(minIndex, temp);
    }
  } 
}