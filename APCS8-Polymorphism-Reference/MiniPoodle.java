public class MiniPoodle extends Poodle {
  public MiniPoodle(String name, String sound, String owner, String color, int age, int size) {
    super(name, sound, owner, color, age,size);
  }
  
  @Override
  public String sound() {
    String sound = super.sound().toLowerCase();
    System.out.println(sound);
    return sound;
  }
  @Override
  public void lost(){
    super.lost();
    System.out.println(this.name() + " is small, and may just be underfoot!");
  }

  //Lookup addition
  public void prance() {
    System.out.println("The MiniPoodle " + this.name() + " is prancing on its hind legs!");
  }
}