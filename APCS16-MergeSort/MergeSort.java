import java.util.Arrays;

public class MergeSort{ 

  // out-of-place implementation
	public int[] mergeSort(int[] array){ 

    //base case
    if(array.length <= 1){
      return array;  
    } 

    // split the array in half
    int middle = array.length/2; 
    int[] left = Arrays.copyOfRange(array, 0, middle);
    int[] right = Arrays.copyOfRange(array, middle, array.length);

    // sort the two halves
    left = mergeSort(left); 
    right = mergeSort(right); 

    // merge the two (sorted) halves
    return merge(left, right); 
	} 

	public int[] merge(int[] left, int[] right){ 
		
    int[] merged = new int[left.length + right.length];
		int numLeft = 0; //number of items added from "left"
    int numRight = 0; //number of items added from "right"
		int numMerged = 0; //number of items added to "merged"

    // compare the next items in both lists
    // add the smaller of the two
		while(numLeft < left.length && numRight < right.length){ 
			if (left[numLeft] <= right[numRight]){ 
				merged[numMerged] = left[numLeft]; 
				numLeft++; 
			}else{ 
				merged[numMerged] = right[numRight]; 
				numRight++; 
			} 
			numMerged++; 
		} 

		// add the rest of "left"
		while(numLeft < left.length){ 
			merged[numMerged] = left[numLeft]; 
			numLeft++; 
			numMerged++; 
		} 

		// add the rest of "right"
		while(numRight < right.length){ 
			merged[numMerged] = right[numRight]; 
		  numRight++; 
			numMerged++; 
		} 
    return merged;
	} 
}
