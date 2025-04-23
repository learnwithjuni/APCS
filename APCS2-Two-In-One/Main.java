import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("\nPlease input an integer: ");
    int a = in.nextInt();
    System.out.print("Please input another integer: ");
    int b = in.nextInt();
    System.out.print("Please input a final integer: ");
    int c = in.nextInt();

    System.out.print("\nDo two of the integers sum to the third? ");
    boolean result = (a+b == c || a+c == b || c+b == a);
    System.out.println(result);
  }
}