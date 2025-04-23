import java.util.*;

class Main {
  public static void main(String[] args) {
    Deck deck = makeDeck();
    Elevens game = new Elevens(deck);
  }

  public static Deck makeDeck() {
    ArrayList<Card> cards = new ArrayList<>();
    for(int i = 1; i < 14; i++) {
      cards.add(new Card("Diamonds", i));
      cards.add(new Card("Hearts", i));
      cards.add(new Card("Spades", i));
      cards.add(new Card("Clubs", i));
    }
    return shuffle(cards);
  }

  public static Deck shuffle(ArrayList<Card> cards){
    ArrayList<Card> shuffled = new ArrayList<>();
    while(cards.size() > 0) {
      int num = (int) (Math.random() * cards.size()-1);
      Card c = cards.remove(num);
      shuffled.add(c);
    }
    return new Deck(shuffled);

  } 
}