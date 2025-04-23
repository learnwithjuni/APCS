import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nCan the chicken cross the road?");
    System.out.println("Enter \"true\" or \"false\" to the following questions to find out!");

    //get user input
    System.out.print("\nIs it safe to the left? ");
    boolean safeLeft = scanner.nextBoolean();

    System.out.print("Is it safe to the right? ");
    boolean safeRight = scanner.nextBoolean();

    System.out.print("Is he scared? ");
    boolean isScared = scanner.nextBoolean();

    System.out.print("Is his mother hen there? ");
    boolean hasHen = scanner.nextBoolean();

    // determine the answer:
    boolean canCross = safeLeft && safeRight && (!isScared || hasHen);
    System.out.println(canCross);

    /* 
    Alternative solution:
    boolean isSafeBothWays = safeLeft && safeRight;
    boolean isConfident = !isScared || hasHen;
    boolean canCross = isSafeBothWays && isConfident;
    */
  }
}