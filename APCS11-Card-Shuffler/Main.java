import java.util.*;

class Main {
  public static void main(String[] args) {

    //create a complete suit of cards
    ArrayList<Card> cards = new ArrayList<>();
    for (int i = 1; i < 14; i++) {
      cards.add(new Card("Hearts", i));
    }

    //1. print the cards before shuffling
    System.out.println("\nBefore Shuffling:\n");
    for(Card card : cards){
      System.out.println(card);
    }

    //2. shuffle the cards
    Random random = new Random();
    ArrayList<Card> shuffled = new ArrayList<>();
    while (cards.size() > 0) {
      int index = random.nextInt(cards.size());
      Card card = cards.get(index);
      cards.remove(card);
      shuffled.add(card);
    }
    cards = shuffled;

    //3. print the cards after shuffling
    System.out.println("\nAfter Shuffling:\n");
    for(Card card : cards){
      System.out.println(card);
    }
  }
}