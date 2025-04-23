import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("\nEnter a bunch of words and then I'll print them back out in reverse order. When you're finished entering words, enter \".\"\n");
    stackWords();
  }

  public static void stackWords() {

    //1. get the word
    Scanner scanner = new Scanner(System.in);
    System.out.print("Word: ");
    String userInput = scanner.nextLine();

    //2. check if it's a period
    if (userInput.equals(".")) {
      //base case
      System.out.println();
    } else {
      //recursive step
      stackWords();
    }

    System.out.println("Word: " + userInput);
  
  }
}