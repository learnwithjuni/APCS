import java.util.*;

class Main {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(5,5,"Red");
    Square sqr = new Square(4, 4, "Yellow");
    // Have the student explain which type can be contained by the other.
    // Ans: subtypes can be contained in their supertypes

    Rectangle question = new Square(); //no args
    question.area(); //square implementation 

    // rect.isSquare(); would give a compile time error

    // question.isSquare(); would give a compile time error like above
    // How to fix this compile time error?
    // Ans: Cast question to be a square before calling.


    /* ////////////////////////////
      Arrays
    *////////////////////////////

    int[] zeros1 = {0,0,0,0,0};
    int[] zero2 = new int[5];

    for(int i = 0; i < zeros1.length; i++) {
      int num = (int) (Math.random() * 9)+1;
      zeros1[i]=num;
    }
    int max = 0;
    for(int num : zeros1) {
      if(num > max){
        max = num;
      }
    } 

    int[][] zeros = new int[5][5];
    int[][] nonZero = {{1,2,3,4,5},{5,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

    int i = 0;
    while(i < nonZero.length) {
      int j = 0;
      while(j<nonZero[i].length) {
        System.out.print(nonZero[i][j] + " ");
        j++;
      }
      i++;
    }

    // Have the student explain what error will occur if our index is greater than our size - 1.
    // Ans: ArrayIndexOutOfBounds exception

    for(i = 0; i < zeros.length; i++) {
      for(int j =0; j<zeros[i].length;j++) {
        int num = (int) ((100+100+1) * Math.random()) -100;
        zeros[i][j] = num;
      }
    }

    int min = 101;
    for(int[] arr : zeros) {
      for(int num : arr) {
        if(num < min) {
          min = num;
        }
      }
    }

    /* ///////////////////////
      ArrayLists
    */ ////////////////////////

    //Have the student explain what method they would use to insert an element into an arraylist at a specific location without losing any data.
    // Ans: add(loc,elem);

    // Ask the student if we could create an ArrayList of type int.
    // Ans: no

    ArrayList<Rectangle> rectangles = new ArrayList<>();
    for(i = 0; i < 10; i++) {
      int w = (int) (Math.random() * 20) + 1;
      int h = (int) (Math.random() * 20) + 1;
      rect = new Rectangle(w,h,"Red");
      rectangles.add(rect);
    }

    ArrayList<ArrayList<Square>> listOfRect = new ArrayList<>();

    for(i = 0; i < 5; i++) {
      ArrayList<Square> sub = new ArrayList<>();

      for(int j = 0; j < 5; j++){
        int s = (int) (Math.random() * 20) + 1;
        Square newSquare = new Square(s, s, "Blue");
        sub.add(newSquare);
      }
    
      listOfRect.add(sub);
    }

    System.out.println("\n");
    for(ArrayList<Square> row : listOfRect){
      for(Square square : row){
        System.out.print(square.area() + " ");
      }
      System.out.println();
    }

    //  Discuss what iteration methods should be used when removing elements and why
    // Ans: You cannot remove elements from an ArrayList while iterating over it using an enhanced for loop. You will get a concurrent modification error.


  }
}