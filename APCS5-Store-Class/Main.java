class Main {
  public static void main(String[] args) {
    Store store = new Store();
    store.appleAmount = 20; // we have 20 apples
    store.appleCost = 4;
    store.pearAmount = 100;
    store.pearCost = 7;
    store.hoseAmount = 15;
    store.hoseCost = 15;

    System.out.println("\nHere's the store's inventory:");
    store.print();

    System.out.println("\nBuying a pear!");
    int amtDue = store.buy("pear", 5);
    System.out.println("You owe $" + amtDue);
  }
}