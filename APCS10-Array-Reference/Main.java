class Main {
  public static void main(String[] args) {
    //Examples of array creation
    int[] dataOne = new int[5];
    int[] dataTwo = {1,2,3,4,5};

    //Examples of indexing
    int oneDataTwo = dataTwo[0];
    int twoDataTwo = dataTwo[2];

    //Example of indexOutOfBounds
    //int error = dataTwo[6];

    //Using length
    System.out.println(dataOne.length);
    System.out.println(dataTwo.length);

    //Iteration with standard for loop to set
    for (int i = 0; i < dataOne.length; i++) {
      dataOne[i] = i;
    }
    //Iteration with while loop to display
    int i = 0;
    while (i < dataOne.length) {
      System.out.println(dataOne[i]);
      i++;
    }
    square(dataOne);//squares each element
    i = 0;
    while (i < dataOne.length) {
      System.out.println(dataOne[i]);
      i++; //Show changes
    }

    //Creation of two dimensional array
    int[][] matrix = new int[5][5];
    //Example of matrix iteration
    i = 0;
    int count = 0;
    while(i < matrix.length) {
      int j = 0;
      while(j < matrix[i].length) {
        matrix[i][j] = count;
        j++;
        count++;
      }
      i++;
    }

    //Example 2d traversal using enhanced for loops
    int[][] array2 = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
    for(int[] arr : array2) {
      for(int num : arr) {
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }

  public static void square(int[] input) {
    for(int i =0; i < input.length; i++) {
      input[i] *= input[i];
    }
  }
}