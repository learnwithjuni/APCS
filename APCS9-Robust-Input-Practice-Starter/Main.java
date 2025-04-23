import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    RobustScanner scanner = new RobustScanner();

    //1. divide two integers
    System.out.println("\nAttempt to divide two integers...");
    System.out.print("Enter an number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter another number: ");
    int num2 = scanner.nextInt();
    System.out.println(num1/num2);

    //2. print the third letter of a word
    System.out.println("\nAttempt to print the third letter of a word...");
    System.out.print("Enter a word: ");
    String word = scanner.next();
    System.out.println(word.charAt(2));

    //3. print the given index of 'Juni Learning'
    System.out.println("\nAttempt to print the character at the given index of 'Juni Learning':");
    String message = "Juni Learning";
    System.out.print("Enter an index: ");
    int index = scanner.nextInt();
    System.out.println(message.charAt(index));

    //4. count from num1 to num2
    System.out.println("\nAttempt to count from num1 to num2:");
    System.out.print("Enter an number: ");
    num1 = scanner.nextInt();
    System.out.print("Enter another number: ");
    num2 = scanner.nextInt();
    for(int i = num1; i != num2; i++){
      System.out.println(i);
    }
  }
}