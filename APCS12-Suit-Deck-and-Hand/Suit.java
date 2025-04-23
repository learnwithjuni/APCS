import java.util.*;

public class Suit {
  private final ArrayList<Card> cards;

  public Suit(String suitType) {
    this.cards = new ArrayList<>();
    for (int i = 1; i < 14; i++) {
      cards.add(new Card(suitType, i));
    }
  }
  public Card remove(int index){
    if(index >= 0 && index < size()){
      return cards.remove(0);
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