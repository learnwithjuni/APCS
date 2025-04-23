class Main {
  public static void main(String[] args) {
    Farm farm = new Farm(20, 5);
    farm.milk();
    System.out.println("The cows have been milked: " + farm.getMilked());
    farm.sellCow();
    farm.feedCows();
  }
}