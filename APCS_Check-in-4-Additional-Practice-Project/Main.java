import java.util.*;
class Main {
  public static void main(String[] args) {
    ArrayList<Integer> nums1 = new ArrayList();
    ArrayList<Integer> nums2 = new ArrayList();
    for(int i = 0; i < 20; i++) {
      int num = (int)(Math.random()*i)+1;
      nums1.add(num);
      nums2.add(num);
    }
    System.out.println("\nUnsorted Array:\n" + nums1);

    //insertionSort
    int result = insertionSortInversions(nums1);
    System.out.println("\nInsertionSort Inversions: " + result);

    //mergeSort
    result = mergeSortInversions(nums2);
    System.out.println("MergeSort Inversions: " + result);
  }

  public static int insertionSortInversions(ArrayList<Integer> nums){

    int n = 0;
    
    for (int i = 1; i < nums.size(); i++) { 
      
      //get the item to insert
      int itemToInsert = nums.get(i);
      int insertIndex = i; 

      //shift the items right until it's ready to insert
      while(insertIndex > 0 && itemToInsert < nums.get(insertIndex-1)){ 
          nums.set(insertIndex, nums.get(insertIndex-1)); 
          insertIndex--;
          n++;
      } 
      //insert the item
      nums.set(insertIndex, itemToInsert); 
    } 
    return n;
  }
  public static int mergeSortInversions(ArrayList<Integer> nums) {

    //base case
    if (nums.size() <= 1) {
      return 0;
    }

    //split in half
    int M = nums.size() / 2;
    ArrayList<Integer> left = new ArrayList(nums.subList(0, M));  
    ArrayList<Integer> right = new ArrayList(nums.subList(M, nums.size()));
    
    // sort the two halves
    int n = mergeSortInversions(left) + mergeSortInversions(right);

    // merge the two halves
    int i = 0;
    int j = 0;
    ArrayList<Integer> result = new ArrayList<>();
    while (i < left.size() && j < right.size()) {
      if(left.get(i).compareTo(right.get(j)) <= 0){
        //add from the left
        result.add(left.get(i));
        i += 1;
        n += j; // add "j" inversions
        // we do this because "j" elements in the right list were smaller than this element
      } else {
        //add from the right 
        result.add(right.get(j));
        j += 1;
      }
    }

    // add the inversions for the remaining items in "left"
    n += (left.size() - i) * right.size();
    // right.size() elements were smaller than each item remaining in "left"

    result.addAll(left.subList(i, left.size()));
    result.addAll(right.subList(j, right.size()));

    //set the original arrayList to the values in the result
    for (int k = 0; k < result.size(); k += 1) {
      nums.set(k, result.get(k));
    }

    return n;
  }
}