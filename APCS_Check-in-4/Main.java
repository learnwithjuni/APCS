import java.util.*;

class Main {

  /*
    Wrapper classes
  */
  //Have the student explain the role of wrapper classes.
  //Ans: wrapper classes "wrap" up primitive data types or data structures into objects for ease of interaction. This allows programmers to implement methods and constructors to define behavior.

  public static void main(String[] args) {
    //Have the student find the minimal value in a list of integers and doubles.
    ArrayList<Integer> ints = new ArrayList<>();
    
    for(int i = 0; i < 20; i++) {
      ints.add((int) (Math.random()*i));
    }
    int max = Integer.MIN_VALUE;
    for(int j : ints) {
      if(j>max){
        max = j;
      }
    }

    ArrayList<Double> doubles = new ArrayList<>();
    for(double d = 0; d < 20; d++) {
      doubles.add(Math.random()*d);
    }
    double min = (double) Integer.MAX_VALUE;
    for(double f : doubles) {
      if(f < min) {
        min = f;
      }
    }

    //Have the student define the term that allows the following code to compile
    ArrayList<Double> lst = new ArrayList<>();
    for(double k = 0; k < 50; k++) {
      lst.add(k);
    }
    //Ans: autoboxing

    // Have the student code summing a list of Integers into an int using a method call and without.
    int sum = 0;
    for(Integer t : ints) {
      sum += t; //relying on unboxing
    }
    sum = 0;
    for(Integer g : ints) {
      sum += g.intValue(); //relying on method
    }
  }

  /*
    Designing a project
    */

    //What should a spec detail?
    //Ans: all expected inputs and outputs. an exact depiction of the behavior and solutions expected by the final code.

    //Student at University UML
    //Ans: Classes = student, class, and university.
    //Student: instance variables SID and university name
    //University: arraylist of students and string name. enroll method adds student to this university and sets student params. arraylist of classes and addClass(String subject) method.
    //Class: string name to describe class type. arraylist of students enrolled in a specific class. enroll(student) to add a student to this class.
    
    //A spec for a project about cataloging scientific findings does not specify if the identifiers can be capital. What should the programmer do?
    //Ans: Ask.


    /*
    Runtime analysis
    */

    // Why do we use computational steps to define runtime and not time?
    //Ans: the speed of computation varries computer to computer and runtime analysis aims to find a mathematical model to explain how the code executes with respect to input, which is device independent.

    //What is the runtime of function f1.
    public void f1(int n) {
      for(int i = 0; i < n; i++) {
        for(int j = 0; j < 100; j++) {
          System.out.print("bark");
        }
      }
    }
    //ans: linear. Theta(n)

    //What is the runtime of function f2.
    public void f2(int n) {
      for(int i = 0; i < n; i++) {
        for(int j = 0; j < i ; j++) {
          System.out.print("Boof");
        }
      }
    }
    //Ans: n^2

    //What is the runtime of function f3.
    public void f3(int[] arr) {
      for(int i = 0; i < arr.length; i++) {
        for(int j = 0; j < 5; j++) {
          if(arr[j] == 1) {
            return;
          }
          System.out.println("Meow");
        }
      }
    }
    //ans: Best case constant, worst case linear, where the length of the array is n.

    /*
      Recursion
    */
    //What is the ending condition called
    //Ans: base case

    //What will happen if the provided method r1 is executed
    public int r1(int n) {
      if(n==-1){
        return n;
      }
      if(n<1) {
        return r1(n);
      } else if (n%2==0) {
        return r1(n*3/2);
      } else {
        return r1(n/3);
      }
    }
    //Ans: infinite recursion, base case unreachable.

  //What is the worst case number of recursive calls?
    public int mystery(int[] arr, int k) {
      if(arr.length == 0) {
        return k;
      }
      if(arr[k] > arr[arr.length-1]) {
        int loc = 0; 
        int[] temp = new int[k];
        while(loc<k) {
          temp[loc] = arr[loc];
          loc++;
        }
        return mystery(temp, k/2);
      } else {
        return k;
      }
    }
    //Ans: worst case number of recursive calls is log(n) where n is the number of elements in the array. Worst case means every call hits the second if statement, which in the worst case splits the array in half. 

    //Recursive fib
    public int fib(int n) {
      if(n==0||n==1) {
        return 1;
      } else {
        return fib(n-1) + fib(n-2);
      }
    }

    /*
    Sorting
    */

    //Have the student selection sort {2,6,7,3,5,4,6,8,2}.
    //Step 1: {2,6,7,3,5,4,6,8,2}
    //Step 2: {2,2,7,3,5,4,6,8,6}
    //Step 3: {2,2,3,7,5,4,6,8,6}
    //Step 4: {2,2,3,4,5,7,6,8,6}
    //Step 5: {2,2,3,4,5,6,7,8,6}
    //Step 6: {2,2,3,4,5,6,6,8,7}
    //Step 7: {2,2,3,4,5,6,6,7,8}

    //Have the student insertion sort {2,6,7,3,5,4,6,8,2}
    //Step 1: {2|,6,7,3,5,4,6,8,2}
    //Step 2: {2,6|,7,3,5,4,6,8,2}
    //Step 3: {2,6,7|,3,5,4,6,8,2}
    //Step 4: {2,3,6,7|,5,4,6,8,2}
    //Step 5: {2,3,5,6,7,|4,6,8,2}
    //Step 6: {2,3,4,5,6,7|,6,8,2}
    //Step 7: {2,3,4,5,6,6,7|,8,2}
    //Step 8: {2,3,4,5,6,6,7,8|,2}
    //Step 9: {2,2,3,4,5,6,6,7,8}

    //Have the student explain best and worst cases for both insertion and selection sort.
    //Ans: insertion sort is best with sorted or almost sorted lists as it only compares while swaps are still needed. Worst case is reverse sorted, as it maximizes the number of comparisons as each element needs to be pushed as far as possible.
    //Selection sort is the same for any input as it always does the exact same steps.

    //Have the student define divide and conquer and explain what steps those correspond to in merge sort.
    //Ans: divide and conquer is a common method for solving large problems as a combination of smaller problems. Divide refers to the first phase of divinding the arrays until they are "trivially sorted" or have a length of one. Conquer refers to the merging process, where we mere smaller sorted arrays into increasingly large sorted arrays.

  //Have the student merge sort array {2,6,7,3,5,4,6,8,2}
  //Step 1: {2,6,7,3},{5,4,6,8,2}
  //Step 2: {2,6},{7,3},{5,4},{6,8,2}
  //Step 3: {2},{6},{7},{3},{5},{4},{6},{8,2}
  //Step 4: {2,6},{3,7},{5},{4},{6},{8},{2}
  //Step 5: {2,3,6,7},{5},{4},{6},{8},{2}
  //Step 6: {2,3,6,7},{4,5},{6,8},{2}
  //Step 7: {2,3,6,7},{4,5},{2,6,8}
  //Step 8: {2,3,6,7},{2,4,5,6,8}
  //Step 9: {2,2,3,4,5,6,6,7,8}
  
  //Have the student explain the runtime of merge sort.
  //Ans: with every split, we have to touch every single element (n elements). We can split an array in half log(n) times before each array is size one. This gives a runtime of nlog(n).

  /*
  Searching
  */

  //Ch9 Q30 Consider these three tasks.
// 1. A sequential search of an array of n names
// 2. A binary search of an array of n names.
// 3. An insertion sort into alphabetical order of an array of n names that are initially in random order.
// For large n, which of the following lists these tasks in order from least to greatest of their average case runtimes?
// A. 2 1 3
// B. 1 2 3 
// C. 2 3 1
// D. 3 1 2 
// E. 3 2 1 
//Ans: A

  //Binary search relies on what characteristic of the data that linear searching does not. 
  //Ans: the median value. Sequential searching looks at values in order. 

//Searching-3: When given an unsorted array, which is faster in the best case: sequential search or binary search.
//Ans: binary search would require the array be sorted first. In the best case, the element is the first element, so linear search would be faster.

// Execute binary search on array {2,6,7,3,5,4,6,8,2} to find element 4.
//Step 1: sort: {2,2,3,4,5,6,6,7,8}
//Step 2: low = 0, high = 8, mid = 4, arr[4] = 5 > 4
//Step 3: low = 0, high = 3, mid = 1, arr[1] = 2 < 4
//Step 4: low = 2, high = 3, mid = 2, arr[2] = 3 < 4
//Step 5: low = 3, high = 3, mid = 3, arr[3] = 4 == 4

} 