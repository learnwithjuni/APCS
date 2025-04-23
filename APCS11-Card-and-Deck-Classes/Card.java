public class Card {

  private int value; 
  private String color;
  private String suit;  
  
  public Card(String suit, int value) {
    this.suit = suit;
    this.value = value;
    
    // spades and clubs = Black
    // hearts and diamonds = Red
    if (suit.equals("Spades")|| suit.equals("Clubs")){
      this.color = "Black";
    } else {
      this.color = "Red";
    }
  }

  public boolean greaterThan(Card other) {
    // clubs < diamonds < hearts < spades
    // since it's ordered alphabetically, 
    // use the String compareTo() method

    if (other.value == this.value){
      //same value, so compare suits
      return suit.compareTo(other.suit) > 0;
    }else{
      return this.value > other.value;
    }
  }

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

  // getters
  public String getColor(){
    return color;
  }
  public int getValue(){
    return value;
  }
  public String getSuit(){
    return suit;
  }

}