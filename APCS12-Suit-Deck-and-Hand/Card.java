public class Card {

  private int value; 
  private String suit;  
  
  public Card(String suit, int value) {
    this.value = value;
    this.suit = suit;
  }

  public boolean greaterThan(Card other) {
    if (other.value == this.value){
      //same value, so compare suits
      // clubs < diamonds < hearts < spades
      return suit.compareTo(other.suit) > 0;
    }else{
      return this.value > other.value;
    }
  }

  // getters
  public int getValue(){
    return value;
  }
  public String getSuit(){
    return suit;
  }

  @Override
  public String toString() {
    String result = "";
    if (value == 1) {
      result += "Ace of ";
    } else if (value == 11) {
      result += "Jack of ";
    } else if (value == 12) {
      result += "Queen of ";
    } else if (value == 13) {
      result += "King of ";
    } else {
      result += value + " of ";
    }
    result += suit;
    return result;
  }
}