public class Pug extends Dog {
  public Pug(String name,String owner, String color, int age) {
     super(name, "Snorfle", owner, color, age, 10);
  }
   
  //example of an overriden method
  @Override
  public void play() {
    System.out.println(this.getName() + " loves a good game of tug of war!");
    for(int i = 0; i < 3; i++){
      this.bark();
    }
  }

  //unique method
  public void walk(){
    System.out.println("Taking " + this.getName() + " on a walk!");
    this.bark();
  }
}