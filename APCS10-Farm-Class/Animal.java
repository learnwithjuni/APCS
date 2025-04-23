public class Animal {

  private String type;
  private int feedAmount;
  private boolean milkable;
  private String sound;
  private int numFeet;
  private int cost;
  private Farm farm;
  boolean fed;

  public Animal(String type, int feed, boolean milk, String sound, int feet, int cost, Farm farm){
    this.type = type;
    this.feedAmount = feed;
    this.milkable = milk;
    this.sound = sound;
    this.numFeet = feet;
    this.cost = cost;
    this.farm = farm;
    this.fed = false;
  }
  public String getType() {
    return type;
  }
  public int getFeedAmount() {
    return feedAmount;
  }
  public boolean getMilkable() {
    return milkable;
  }
  public int getNumFeet() {
    return numFeet;
  }
  public int getCost() {
    return cost;
  }
  public void makeSound() {
    System.out.print(sound + " ");
  }
  public Farm getFarm() {
    return this.farm;
  }
}