import java.util.*;

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

    System.out.println("");
    //determine the outcome with nested conditionals
    if (safeLeft) {
      if (safeRight) {
        if (!isScared) {
          System.out.println("You are ready to cross the street by yourself!");
        } else {
          if (hasHen) {
            System.out.println("You can cross with your mother hen!");
          } else {
            System.out.println("You are scared and alone, so you might want to find a Hen or Rooster!");
          }
        }
      } else {
        System.out.println("It is not safe to the right.");
      }
    } else {
      System.out.println("It is not safe to the left.");
    }
  }
}