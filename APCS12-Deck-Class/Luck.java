public class Luck {

  public int luckGame(Deck one, Deck two) {
    int numOne = (int) (Math.random() * one.size());
    int numTwo = (int)(Math.random() * two.size());
    Card cardOne = one.remove(numOne);
    Card cardTwo = two.remove(numTwo);
    System.out.println("Player one got: " + cardOne.number +" of "+ cardOne.type);
    System.out.println("Player two got: " + cardTwo.number +" of " + cardTwo.type);
    int wins = cardOne.greaterThan(cardTwo);
    return wins;
  }
}