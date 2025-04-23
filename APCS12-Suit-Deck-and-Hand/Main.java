import java.util.*;

class Main {
  public static void main(String[] args) {

    System.out.println("\nSUIT:");
    Suit suit = new Suit("Diamonds");
    System.out.println(suit);

    System.out.println("DECK:");
    Deck deck = new Deck();
    System.out.println("Initial deck size: " + deck.size());
    System.out.println("Removing 45 cards from the deck: ");
    for(int i = 0; i < 45; i++){
      deck.removeRandom();
    }
    System.out.println("Deck size now: " + deck.size());
    System.out.println("\nRemaining deck:");
    System.out.println(deck);

    System.out.println("HAND:");
    Hand hand = new Hand();
    System.out.println("Add 2 cards from the deck");
    for(int i = 0; i < 2; i++){
      hand.addCard(deck.removeRandom());
    }
    System.out.println("Add 2 cards from the suit");
    for(int i = 0; i < 2; i++){
      hand.addCard(suit.remove(0));
    }
    System.out.println("\nCurrent hand: \n"+ hand);
    System.out.println("Remove from the hand one at a time: ");
    System.out.println("Next: " + hand.removeFirst());
    System.out.println("Next: " + hand.removeFirst());
    System.out.println("Next: " + hand.removeFirst());
  }
}