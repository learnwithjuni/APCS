public class Card {
  Suit type; //diamonds>hearts>spades>clubs
  int number; //Ace = 0, J = 11, Q = 12, K = 13

  public Card(String type, int number) {
    this.type = new Suit(type);
    this.number = number;
  }
  public int getNumber(){
    return this.number;
  }

  public int greaterThan(Card other) {
    if (other.number == this.number){
      return this.type.compareTo(other.type);
    }
    return this.number - other.number;
  }

  @Override
  public String toString(){
    return number + " of " + type;
  }

  @Override
  public boolean equals(Object other) {
    if(other == null) {
      return false;
    } if (other instanceof Card) {
      Card o = (Card) other;
      return this.type.equals(o.type) && this.number == o.number;
    }
    return false;
    
  }
}