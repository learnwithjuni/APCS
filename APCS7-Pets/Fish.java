public class Fish extends Pet{
  public Fish(String name, boolean isMale, int age, String owner){
    super(name, isMale, age, owner);
     type("fish");
  }
  @Override
  public void feed(){
    System.out.println("Feeding " + name() + " some tasty fish flakes!");
  }
  @Override
  public void playWith() {
    System.out.println("It's pretty tough to play with a fish, but it is fun to watch them for awhile!");
    makeSound();
  }
  @Override
  public void makeSound(){
    System.out.println("gurgle gurgle");
  }

  //unique fish methods
  public void cleanTank(){
     System.out.println("Cleaning " + name() + "'s tank out! Now it's nice and clean!");
  }
}