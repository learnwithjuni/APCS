import java.util.*;

class Main {
  public static void main(String[] args) {
    Deck firstDeck = makeDeck();
    Deck secondDeck = makeDeck();
    Luck game = new Luck();
    int wins = game.luckGame(firstDeck,secondDeck);
    if(wins > 0){
      System.out.println("Yay! We won!");
    } else {
      System.out.println("Better luck next time");
    }
    int secondGame = game.luckGame(firstDeck, secondDeck);
    if(secondGame > 0){
      System.out.println("Yay! We won!");
    } else {
      System.out.println("Better try again :(");
    }
  }

  public static Deck makeDeck() {
    ArrayList<Card> cards = new ArrayList<>();
    for(int i = 0; i < 14; i++) {
      cards.add(new Card("Diamonds", i));
      cards.add(new Card("Hearts", i));
      cards.add(new Card("Spades", i));
      cards.add(new Card("Clubs", i));
    }
    return new Deck(cards);
  }
}