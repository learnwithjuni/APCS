import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("\nBase: ");
    int base = scanner.nextInt();
    System.out.print("Power: ");
    int power = scanner.nextInt();
    double baseToPower = Math.pow(base,power);

    System.out.println("The number " + base + " to the power of " + power + " is " + baseToPower);

    double sqrt = Math.sqrt(baseToPower);
    System.out.println("The square root of " + baseToPower + " is: " + sqrt);

    double fourthRoot = Math.sqrt(sqrt);
    System.out.println("The fourth root of " + baseToPower + " is: " + fourthRoot);

    System.out.print("\nNegative number: ");
    int negNum = scanner.nextInt();
    int pos = Math.abs(negNum);
    System.out.println("The absolute value of " + negNum + " is " + pos);
  }
}