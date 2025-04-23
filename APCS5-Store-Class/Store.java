public class Store {
  public int appleCost;
  public int appleAmount;
  public int pearCost;
  public int pearAmount;
  public int hoseCost;
  public int hoseAmount;

  public int buy(String itemType, int amount) {
    if (itemType.equals("apple")) {
      if (amount <= appleAmount) {
        appleAmount -= amount;
        return amount * appleCost;
      } else {
        System.out.println("Sorry, we do not have enough in stock to complete your request");
        return 0;
      }
    }
    
    if (itemType.equals("pear")) {
      if (amount <= pearAmount) {
        pearAmount -= amount;
        return amount * pearCost;
      } else {
        System.out.println("Sorry, we do not have enough in stock to complete your request");
        return 0;
      }
    }
    
    if (itemType.equals("hose")) {
      if (amount <= hoseAmount) {
        hoseAmount -= amount;
        return amount * hoseCost;
      } else {
        System.out.println("Sorry, we do not have enough in stock to complete your request");
        return 0;
      }
    }

    System.out.println("Sorry, we do not have that in stock");
    return 0;
  }

  public void print() {
    for (int i = 0; i < appleAmount; i++) {
      System.out.print("Apple ");
    }
    System.out.println();
    for (int i = 0; i < pearAmount; i++) {
      System.out.print("Pear ");
    }
    System.out.println();
    for (int i = 0; i < hoseAmount; i++) {
      System.out.print("Hose ");
    }
    System.out.println();
  }
}