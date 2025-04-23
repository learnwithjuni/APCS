public class Dog {
  private String name;
  private String sound;
  private String owner;
  private String color;
  private int age;
  private int size;

  public Dog(String name, String sound, String owner, String color, int age, int size) {
    this.name = name;
    this.sound = sound;
    this.owner = owner;
    this.color = color;
    this.age = age;
    this.size = size;
  }

  public String name() {
    return this.name;
  }
  public String sound() {
    if (size < 15) {
      System.out.println(sound.toLowerCase());
    } else {
      System.out.println(sound.toUpperCase());
    }
    
    return sound;
  }
  public String owner() {
    return this.owner;
  }
  public void play() {
    if(this.size > 15) {
      System.out.println("Throw the ball!");
    } else {
      System.out.println("Zoomies!");
    }
    System.out.println("Playing with " + this.name());
    this.sound();
  } 

  public void lost() {
    System.out.println("Has anyone seen " + this.owner() + "? I have " + this.name());
  }
  private void callDog() {
    System.out.println("Come here boy");
  }
}