class Main {
  public static void main(String[] args) {

    // Pet genericPet = new Pet("Petey", true, 1, "John");
    // System.out.println();
    // genericPet.feed();
    // genericPet.playWith();

    Dog dog = new Dog("Fido", true, 3, "Robert");
    Cat cat = new Cat("Felisha", false, 5, "Jillian");
    Fish fish = new Fish("Ariel", false, 1, "Juan");

    System.out.println();
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(fish);

    //dog
    System.out.println();
    dog.feed();
    dog.walk();
    dog.rubBelly();
    dog.playWith();

    //cat
    System.out.println();
    cat.feed();
    cat.playWith();
    cat.changeLitterbox();
    cat.stroke();
    cat.makeSound();

    //fish
    System.out.println();
    fish.feed();
    fish.playWith();
    fish.cleanTank();

    System.out.println();
    System.out.println("Does dog equal cat? " + dog.equals(cat));
    System.out.println("Does fish equal fish? " + fish.equals(fish));
  }
}