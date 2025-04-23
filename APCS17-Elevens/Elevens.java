import java.util.*;

public class Elevens {
  public Deck deck;
  public Deck hand;
  public Scanner in;

  public Elevens(Deck start) {
    this.deck = start;
    ArrayList<Card> buildHand = new ArrayList<>();
    for(int i = 0; i < 9; i++) {
      int num = (int) (Math.random() * this.deck.size() - 1);
      Card random = this.deck.remove(num);
      buildHand.add(random);
    }
    this.hand = new Deck(buildHand);
    this.in = new Scanner(System.in);
    play();
  }

  public void play() {
    System.out.println("\nRULES: \nWin by emptying the deck your hand draws from. Select groups of cards that sum to 11 or a set of a Jack, a Queen, and a King. \n\nInput a single moves worth of card selections in the form Num Suit where num refers to the value with a comma between cards (Ex. \"Ace of Hearts\" and \"2 of Clubs\" is: 1 Hearts, 2 Clubs).\n\nEnter quit to end.\n");

    System.out.println(this.hand);
    String input = in.nextLine();
    while(this.deck.size() > 0 && !input.equals("quit")) {
      String[] arr = input.split(",");
      if(arr.length == 1) {
        System.out.println("You must input more than one card.");
        input = in.nextLine();
        continue;
      }
      ArrayList<Card> currentMove = new ArrayList<>();
      for(String s : arr) {
        String[] internal = s.split(" ");
        String n = internal[0];
        String type = internal[1];
        if(internal.length == 3) {
          n = internal[1];
          type = internal[2];
        } 
        int number = Integer.parseInt(n);
        Card c = new Card(type, number);
        currentMove.add(c);
      }
      int num = 0;
      int removed=0;
      if (isLegal(currentMove)) {
        for(Card c : currentMove) {
          this.hand.remove(c);
          removed++;
        }
      }
      for(int i = 0; i < removed; i++) {
        if(this.deck.size() > removed + 1) {
           num = (int) (Math.random() * this.deck.size() - 1);
            Card random = this.deck.remove(num);
            this.hand.add(random);
        } else {
          System.out.println("You won");
          return;
        }
       
      }
      System.out.println(this.hand);
      System.out.println("Input your move or quit.");
      input = in.nextLine();
    }
  }

   public boolean isLegal(ArrayList<Card> attempt) {
    int num = 0;
    for(Card c : attempt) {
        num += c.getNumber();
    }
    return num == 11 || num == 36;
  }
}