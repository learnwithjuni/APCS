class Main {
  public static void main(String[] args) {
    
    // Using the constructors, getters, and setters
    Dog firstDog = new Dog();
    Dog fido = new Dog("Fido");
    fido.setAge(5);
    System.out.println(fido.getAge());
    
    // This doesn't work:
    // System.out.println(fido.age);
    
    // Using the toString() method
    System.out.println(fido);
    
    // Using the static variable & method
    Dog spot = new Dog("spot");
    System.out.println(Dog.getTotalDogs());
    
    // In the below code, both fido and fidoTwin point to the same memory slot, so changing fido's age also changes fidoTwin's page.
    Dog fidoTwin = fido;
    fido.setAge(7);
    System.out.println(fidoTwin.getAge());
    
    // In the below code, the Dog spot is passed into the static setAgeToTen() method. Both spot and the formal parameter d point to the same object, so invoking setAge() changes the age of spot.
    Dog.setAgeToTen(spot);
    System.out.println(spot.getAge());
    
    // Using the subclass Bulldog
    Bulldog bully = new Bulldog("bully");
    System.out.println(bully);
    System.out.println(bully.getAggressiveness());
    bully.setAggressiveness(10);
    System.out.println(bully.getAggressiveness());
    
    bully.setAge(5);
    System.out.println(bully.getAge());
    
    // Polymorphism
    Dog jojo = new Bulldog("jojo");
    jojo.setAge(10);
    System.out.println(jojo.getAge());
    // won't work because jojo is a Dog at compile-time:
    // System.out.println(jojo.getAggressiveness());
    
    // Downcasting
    System.out.println(((Bulldog)jojo).getAggressiveness());
  }
}
