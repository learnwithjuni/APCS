public class Cat extends Pet{
  public Cat(String name, boolean isMale, int age, String owner){
    super(name, isMale, age, owner);
     type("cat");
  }
  @Override
  public void feed(){
    System.out.println("Feeding " + this.name() + " some tunafish");
  }
  @Override
  public void playWith() {
    System.out.println(name() +  " loves to chase the laser pointer!");
    makeSound();
  }
  @Override
  public void makeSound(){
    System.out.println("meow...");
  }

  //unique cat methods
  public void stroke(){
    System.out.println("Ahhhh... " + name() + " loves to be stroked softly");
    makeSound();
  }
  public void changeLitterbox(){
    System.out.println("Changing " + name() + "'s litterbox. Nice and clean!");
  }
}