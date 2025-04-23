public class MiniPoodle extends Poodle {
  public MiniPoodle(String name, String owner, String color, int age) {
    super(name, owner, color, age);
    super.setSize(10); //make it mini
  }
}