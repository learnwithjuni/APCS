import java.util.*;

public class Hand{
  private final ArrayList<Card> cards;

  public Hand(){
    this.cards = new ArrayList<>();
  }

  public void dealNumCards(int numCards){
    String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
    Random random = new Random();
    for (int i = 0; i < numCards; i++) {
      String suit = suits[random.nextInt(suits.length)];
      int value = random.nextInt(13) + 1;
      cards.add(new Card(suit, value));
    }
  }
  public void addCard(Card card){
    this.cards.add(card);
  }
  public Card removeFirst(){
    if(size() > 0){
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
