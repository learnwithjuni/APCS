import java.util.*;

public class Deck {
  private final ArrayList<Card> cards;

  public Deck() {
    this.cards = new ArrayList<>();
    for (int i = 1; i < 14; i++) {
      cards.add(new Card("Clubs", i));
      cards.add(new Card("Diamonds", i));
      cards.add(new Card("Hearts", i));
      cards.add(new Card("Spades", i));
    }
  }

  public Card removeRandom() {
    if(cards.size() > 0){
      int index = (int)(Math.random() * cards.size());
      return cards.remove(index);
    }
    return null;
  }

  ////////////////////
  // Shared Methods //
  ////////////////////

  public int size() {
    return cards.size();
  }
  @Override
  public String toString(){
    String string = "";
    for(Card card : cards){
      string += card + "\n";
    }
    return string;
  }
}