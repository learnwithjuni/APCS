import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    /*
    A vacation is when you take a trip to some _________ place with your _________ family. Usually you go to some place that is near a/an _________ or up on a/an _________. A good vacation place is one where you can ride _________ or play _________ or go hunting for _________.
    */
    Scanner scanner = new Scanner(System.in);

    System.out.print("\nAdjective: ");
    String adjective1 = scanner.nextLine();

    System.out.print("Another adjective: ");
    String adjective2 = scanner.nextLine();

    System.out.print("Noun: ");
    String noun1 = scanner.nextLine();

    System.out.print("Another noun: ");
    String noun2 = scanner.nextLine();

    System.out.print("Plural noun: ");
    String plural_noun1 = scanner.nextLine();

    System.out.print("Game: ");
    String game = scanner.nextLine();

    System.out.print("Another plural noun: ");
    String plural_noun2 = scanner.nextLine();

    String str = "\nA vacation is when you take a trip to some " +
    adjective1 + " place with your " + adjective2+ 
    " family. Usually you go to some place that is near a " 
    + noun1 + " or up on a " + noun2 + 
    ". A good vacation place is one where you can ride " + 
    plural_noun1 + 
    " or play " + game + " or go hunting for " 
    + plural_noun2;
    System.out.print(str);
  }
}