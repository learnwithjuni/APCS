public class Chicken extends Animal {
  public Chicken(int feed, int cost, Farm farm) {
    super("Chicken", feed, false, "Cluck", 2, cost,farm);
  }
  public int getEggs() {
    //one egg per chicken, if the farm has chickens
    int num = this.getFarm().has("Chickens");
    return num;
  }
}