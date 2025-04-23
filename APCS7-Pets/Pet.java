public class Pet {
  private String name;
  private boolean isMale;
  private int age;
  private String owner;
  private String type;

  public Pet(String name, boolean isMale, int age, String owner) {
    this.name = name;
    this.isMale = isMale;
    this.age = age;
    this.owner = owner;
    this.type = "unknown";
  }

  //getters and setters
  public String name() {
    return this.name;
  }
  public void name(String name) {
    this.name = name;
  }
  public boolean isMale(){
    return this.isMale;
  }
  public void isMale(boolean isMale){
    this.isMale = isMale;
  }
  public int age(){
    return this.age;
  }
  public void age(int age){
    this.age = age;
  }
  public String owner() {
    return this.owner;
  }
  public void owner(String owner) {
    this.owner = owner;
  }
  public String type(){
    return type;
  }
  public void type(String type){
    this.type = type;
  }

  //actions
  public void feed(){
    System.out.println("Feeding " + this.name());
  }
  public void playWith() {
    System.out.println("Playing with " + this.name());
  }
  public void makeSound(){}

  @Override
  public String toString(){
    String adjective;
    if(isMale){
      adjective = "his";
    }else{
      adjective = "her";
    }
    return name + " is a " + type + ", is " + age + " years old, and " + owner() + " is " + adjective + " owner";
  }

  @Override
  public boolean equals(Object obj){
    if(obj instanceof Pet){
      Pet that = (Pet) obj;
      return this.name.equals(that.name()) &&
             this.isMale == that.isMale() &&
             this.age == that.age() &&
             this.owner.equals(that.owner()) &&
             this.type.equals(that.type());
    }else{
      return false;
    }
  }
}
