public class Farm {

  public Animal[] animals;
  public int[] quantities;
  public int numAnimals;

  private boolean milked;
  private int foodAmount;

  public Farm(int cows, int goats) {
    animals = new Animal[5];
    quantities = new int[5];
    animals[0] = new Cow(30, 400, this);
    quantities[0] = cows;
    animals[1] = new Cow(30, 400, this);
    quantities[1] = goats;
    
    milked = false;
    foodAmount = 5000;
    numAnimals=2;
  }
  public int getFoodAmount(){
    return this.foodAmount;
  }
  public void addFood(int amount) {
    foodAmount += amount;
  }

  public boolean getMilked() {
    return milked;
  }

  public int findLoc(Animal itemType) {
    for(int i = 0; i < numAnimals; i++) {
      if(animals[i].getType().equals(itemType.getType())) {
        return i;
      }
    }
    return -1;
  }

  public boolean getFed(Animal type) {
    int loc = findLoc(type);
    return loc != -1 && animals[loc].fed;
  }

  public boolean feed(Animal type) {
    int loc = findLoc(type);
    if(loc == -1) {
      System.out.println("You do not have those animals");
      return false;
    }
    Animal animal = animals[loc];
    if(animal.fed) {
      System.out.println("The " + animal.getType() + " has already been fed");
      return false;
    }
    if (foodAmount < animal.getFeedAmount()*quantities[loc]) {
      System.out.println("\nYou do not have enough food");
      return false;
    }
    animal.fed = true;
    for (int i = 0; i < quantities[loc]; i++) {
      animal.makeSound();
      this.foodAmount -= animal.getFeedAmount();
    }
    return animal.fed;
  }

  public boolean milk() {
    if (milked) {
      System.out.println("\nThey have already been fed!");
      return false;
    }
    milked = true;
    sound();
    return milked;
  }

  public void sound() {
    for(int i = 0; i < numAnimals; i++) {
      for(int j = 0; j < quantities[i]; j++) {
        animals[i].makeSound();
      }
    }
  }

  public boolean sell(Animal type) {
    int loc = findLoc(type);
    if (loc == -1 ||quantities[loc]<1) {
      System.out.println("You cannot sell what you do not have");
      return false;
    }
    quantities[loc] -= 1;
    return true;
  }

  private void resize(){
    Animal[] newItems = new Animal[this.animals.length*2];
    int[] newQuant = new int[this.animals.length*2];
    for(int i = 0; i < this.animals.length;i++) {
      newItems[i] = this.animals[i];
      newQuant[i] = this.quantities[i];
    }
    this.animals = newItems;
    this.quantities = newQuant;
  }

  public void addAnimal(Animal animal) {
    if(numAnimals>= animals.length) {
      resize();
    }
    animals[numAnimals] = animal;
    quantities[numAnimals] += 1;
    numAnimals+=1;
  }

  public int has(String type) {
    for (int i = 0; i < numAnimals; i++) {
      if(animals[i].getType().equals(type)) {
        return quantities[i];
      }
    }
    return 0;
  }

  public void increment() {
    this.milked = false;
    for(Animal animal : animals) {
      if(animal != null) {
        animal.fed = false;
      }
    }
  }
}