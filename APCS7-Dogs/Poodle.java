public class Poodle extends Dog {
  public Poodle(String name, String owner, String color, int age) {
     super(name, "Boof Boof", owner, color, age, 20);
  }

  //example of an overriden method
  @Override
  public void lost(){
    System.out.println("Poodles are too smart to get lost!");
  }
}