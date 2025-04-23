//Wrapper class around the idea of a Card
public class Card {
  Suit type; //diamonds>hearts>spades>clubs
  int number; //Ace = 0, J = 11, Q = 12, K = 13

  public Card(String type, int number) {
    this.type = new Suit(type);
    this.number = number;
  }

  public int greaterThan(Card other) {
    if (other.number == this.number){
      return this.type.compareTo(other.type);
    }
    return this.number - other.number;
  }
}