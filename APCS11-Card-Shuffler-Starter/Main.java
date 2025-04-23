import java.util.*;

class Main {
  public static void main(String[] args) {

    //create a complete suit of cards
    ArrayList<Card> cards = new ArrayList<>();
    for (int i = 1; i < 14; i++) {
      cards.add(new Card("Hearts", i));
    }

    //TODO: shuffle the cards!
  }
}