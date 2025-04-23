import java.util.ArrayList;

public class Deck {
  private ArrayList<Card> cards;

  public Deck() {
    this.cards = new ArrayList<>();
    for (int i = 1; i < 14; i++) {
      cards.add(new Card("Clubs", i));
      cards.add(new Card("Diamonds", i));
      cards.add(new Card("Hearts", i));
      cards.add(new Card("Spades", i));
    }
  }
  public int size() {
    return cards.size();
  }
  public Card removeRandom() {
    if(cards.size() > 0){
      int index = (int)(Math.random() * cards.size());
      return cards.remove(index);
    }
    return null;
  }
}