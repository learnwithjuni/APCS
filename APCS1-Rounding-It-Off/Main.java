import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMONEY ROUNDER:");
        System.out.print("Enter a dollar amount: $");
        double dollars = scanner.nextDouble();

        //round down
        int floor = (int) dollars;
        System.out.println("\nRounded Down: $" + floor);

        //round up
        int ceiling = (int) dollars + 1;
        System.out.println("Rounded Up: $" + ceiling);

        //round to nearest 1 dollar
        int nearestDollar = (int) (dollars + 0.5);
        System.out.println("Nearest Dollar: $" + nearestDollar);

        //round to nearest 10 dollars
        int nearestTen = (int)((dollars/10)+0.5)*10;
        System.out.println("Nearest 10 Dollars: $" + nearestTen);

        //round to nearest 100 dollars
        int nearestHundred = (int)((dollars/100)+0.5)*100;
        System.out.println("Nearest 100 Dollars: $" + nearestHundred);
    }
}
