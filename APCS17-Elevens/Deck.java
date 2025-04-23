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
  public Card remove(Card card) {
    int index = this.cards.indexOf(card);
    return remove(index);
  }
  public ArrayList<Card> getArr() {
    return this.cards;
  }
  public void add(Card card) {
    this.cards.add(card);
  }
  @Override
  public String toString(){
    return this.cards.toString();
  }
  

}