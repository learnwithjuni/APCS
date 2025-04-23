public class LuckGame {
  private int p1Wins;
  private int p2Wins;

  public void play(Deck one, Deck two) {
    Card cardOne = one.removeRandom();
    Card cardTwo = two.removeRandom();

    //1. check to see if we ran out
    if(cardOne == null || cardTwo == null){
       System.out.println("Someone Ran Out of Cards!\n");
      return;
    }
    
    //2. print cards
    System.out.println("Player One Got: " + cardOne);
    System.out.println("Player Two Got: " + cardTwo);

    //3. print results
    if(cardOne.greaterThan(cardTwo)){
      System.out.println("Player One Wins!\n");
      p1Wins++;
    }else{
       System.out.println("Player Two Wins!\n");
       p2Wins++;
    }
  }
  public int getP1Wins(){
    return p1Wins;
  }
  public int getP2Wins(){
    return p2Wins;
  }
  public String getResults(){
    return "Player One Wins: "   + p1Wins + 
           "\nPlayer Two Wins: " + p2Wins;
  }
}