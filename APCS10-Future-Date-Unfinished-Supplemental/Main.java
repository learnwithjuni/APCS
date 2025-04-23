import java.util.Scanner;

class Main {

  // challenge problem!
  public static void main(String[] args) {
    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nMonth: "); 
    String[] date = scanner.next().split("/");

    System.out.print("Days in the future: ");
    int count = scanner.nextInt();

    // System.out.println(daysInMonth.length);
  }
}