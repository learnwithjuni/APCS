public class Dog {
  private String name;
  private String owner;
  private int age;

  private String sound;
  private String color;
  private int size;

  //constructors
  public Dog(String name, String sound, String owner, String color, int age, int size) {
    this.name = name;
    this.sound = sound;
    this.owner = owner;
    this.color = color;
    this.age = age;
    this.size = size;
  }
  public Dog(String name, String owner, String color, int age) {
    this.name = name;
    this.owner = owner;
    this.color = color;
    this.age = age;
  }
  
  //getters and setters
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public String getOwner() { return owner; }
  public void setOwner(String owner) { this.owner = owner; }
  public int getAge() { return age; }
  public void setAge(int age) { this.age = age; }
  public String getSound() { return sound; }
  public void setSound(String sound) { this.sound = sound; }
  public String getColor() { return color; }
  public void setColor(String color) { this.color = color; }
  public int getSize() { return size; }
  public void setSize(int size) { this.size = size; }

  //methods
  public void bark() {
    if (size < 15) {
        System.out.println(sound.toLowerCase());
    } else {
        System.out.println(sound.toUpperCase());
    }
  }
  public void play() {
    System.out.println("Playing with " + this.getName());
    this.bark();
  }
  public void lost() {
    System.out.println("I'm lost! Has anyone seen " + this.getOwner() + "?");
  }


  //overriden object methods
  @Override
  public String toString() {
    return "Dog{" +
            "name='" + name + '\'' +
            ", owner='" + owner + '\'' +
            ", age=" + age +
            ", sound='" + sound + '\'' +
            ", color='" + color + '\'' +
            ", size=" + size +
            '}';
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Dog)) return false;
    Dog dog = (Dog) o;
    return age == dog.age &&
            size == dog.size &&
            name.equals(dog.name) &&
            owner.equals(dog.owner) &&
            sound.equals(dog.sound) &&
            color.equals(dog.color);
  }
}
