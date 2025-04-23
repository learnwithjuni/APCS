public class Dog extends Pet{
  public Dog(String name, boolean isMale, int age, String owner){
    super(name, isMale, age, owner);
    type("dog");
  }
  @Override
  public void feed(){
    System.out.println("Feeding " + this.name() + " a big juicy bone!");
  }
  @Override
  public void playWith() {
    System.out.println("Playing fetch with " + name());
    makeSound();
  }
  @Override
  public void makeSound(){
    System.out.println("WOOF WOOF!!");
  }

  //unique dog methods
  public void walk(){
    System.out.println("Walking " + name());
  }
  public void rubBelly(){
    System.out.println("Rubbing " + name() + "'s belly!");
  }
}