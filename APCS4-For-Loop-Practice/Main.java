import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("\nEnter your name: ");
    String name = scanner.nextLine();
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();

    System.out.println("\nPrint your name \"age\" amount of times:");
    // Print your name age amount of times using a for loop
    for (int i = 0; i < age; i++) {
      System.out.print(name + " ");
    }

    System.out.println("\n\nPrint \"age\" for every letter in your name: ");
    // Print your age once for each letter in your name
    for (int i = 0; i < name.length(); i++) {
      System.out.print(age + " ");
    }

    System.out.println("\n\nCount from your age down to 0:");
    // Print out all of the numbers from your age down through zero
    for (int i = age; i >= 0; i--) {
      System.out.print(i + " ");
    }

    // the data
    int[] data = {1,2,3,4,5,6,7,8,9};
    
    System.out.print("\n\nThe product of every number in the array: ");
    // finding the product
    int product = 1;
    for(int num : data) {
      product *= num;
    }
    System.out.println(product);
    
    System.out.print("The maximum number in the array: ");
    // finding the max
    int max = 0;
    for(int num : data){
      if (max < num){
        max = num;
      }
    }
    System.out.println(max);
  }
}