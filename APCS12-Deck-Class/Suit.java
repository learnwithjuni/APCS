//Wrapper class around the idea of a Suit
public class Suit implements Comparable<Suit>{
  String type;
  String color; 

  public Suit(String t) {
    if(t.contains("C") || t.contains("c")) {
      type = "Clubs";
      color = "Black";
    }
    else if (t.contains("H") || t.contains("h")) {
      type = "Hearts";
      color = "Red";
    } else if (t.indexOf("D") == 0 || t.indexOf("d") == 0) {
      type = "Diamonds";
      color = "Red";
    } else {
      type = "Spades";
      color = "Black";
    }
  }

  public String getColor() {
     return this.color;
  }
  public String getType() {
    return this.type;
  }

  @Override
  public int compareTo(Suit other) {
    if(other == null){
      throw new NullPointerException();
    }
    if(other.type.equals(this.type)) {
      return 0;
    }
    if(other.type.equals("Diamonds")){
      return -1;
    }
    if(this.type.equals("Diamonds")){
      return 1;
    }
    if(this.type.equals("Hearts")) {
      return 1;
    }
    if(other.type.equals("Hearts")){
      return -1;
    }
    if(this.type.equals("Spades")){
      return 1;
    }
    if(other.type.equals("Spades")) {
      return -1;
    }
    return -1;
  
  }
  @Override 
  public boolean equals(Object obj) {
    Suit other = (Suit) obj;
    return this.type.equals(other.type);
  }

  @Override
  public String toString() {
    return this.type;
  }
}