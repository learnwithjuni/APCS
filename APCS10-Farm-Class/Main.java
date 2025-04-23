class Main {
  public static void main(String[] args) {
    Farm farm = new Farm(20,5);
    Chicken chick = new Chicken(2,5,farm);
    farm.addAnimal(chick);
    farm.feed(farm.animals[0]);
  }
}