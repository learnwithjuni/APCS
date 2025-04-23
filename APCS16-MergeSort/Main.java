import java.util.Arrays;
class Main {
  public static void main(String args[]) 
	{ 
		int[] arr = {12, 11, 13, 5, 6, 7, 1, 1, 1, 1}; 

		System.out.println("\nGiven Array:"); 
		System.out.println(Arrays.toString(arr));

		MergeSort sorter = new MergeSort(); 
		arr = sorter.mergeSort(arr); 

		System.out.println("\nSorted Array:"); 
    System.out.println(Arrays.toString(arr));
	} 
}