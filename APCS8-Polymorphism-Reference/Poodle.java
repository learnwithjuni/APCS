public class Poodle extends Dog {
  public Poodle(String name, String sound, String owner, String color, int age, int size) {
    super(name, sound, owner, color, age,size);
  }

  @Override
  public void lost() {
    System.out.println("A poodle is too smart to get lost! It is just taking itself on a walk!");
  }
}