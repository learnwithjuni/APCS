import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    RobustScanner scanner = new RobustScanner();

    //1. divide two integers
    System.out.println("\nAttempt to divide two integers...");
    System.out.print("Enter an number: ");
    int num1 = scanner.nextInt();
    int num2 = 0;
    while(num2 == 0){
      //avoid divide by zero error
      System.out.print("Enter another number: ");
      num2 = scanner.nextInt();
    }
    System.out.println(num1/num2);

    //2. print the third letter of a word
    System.out.println("\nAttempt to print the third letter of a word...");
    String word = "";
    while(word.length() < 3){
      //avoid index out of range error
      System.out.print("Enter a word: ");
      word = scanner.next();
    }
    System.out.println(word.charAt(2));

    //3. print the given index of 'Juni Learning'
    System.out.println("\nAttempt to print the character at the given index of 'Juni Learning':");
    String message = "Juni Learning";
    int index = -1;
    while(index < 0 || index >= message.length()){
      //avoid index out of range error
      System.out.print("Enter an index: ");
      index = scanner.nextInt();
    }
    System.out.println(message.charAt(index));

    //4. count from num1 to num2
    System.out.println("\nAttempt to count from num1 to num2:");
    System.out.print("Enter an number: ");
    num1 = scanner.nextInt();
    System.out.print("Enter another number: ");
    num2 = scanner.nextInt();

    //this always works, 
    //regardless of whether we should count up or down
    if(num1 < num2){
      for(int i = num1; i <= num2; i++){
        System.out.println(i);
      }
    }else{
      for(int i = num1; i >= num2; i--){
        System.out.println(i);
      }
    }
  }
}