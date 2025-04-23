//Wrapper class around the idea of a Deck
//Holds ArrayList of cards
import java.util.*;

public class Deck {
  ArrayList<Card> cards;

  public Deck(ArrayList<Card> cards) {
    this.cards = cards;
  }
  public int size(){
    return cards.size();
  }
  public Card remove(int loc) {
    return cards.remove(loc);
  }

}