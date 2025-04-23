public class Dog
{
  // Instance variables
  private String name;
  private int age;
  private double weight;
  private boolean isAlive;
  
  // Static variables
  private static int totalDogs = 0;

  // Default constructor
  public Dog() {
    name = "";
    age = 0;
    weight = 0;
    isAlive = true;
    totalDogs++;
  }
  
  // Overloaded constructor
  public Dog(String theName) {
    name = theName;
    age = 0;
    weight = 0;
    isAlive = true;
    totalDogs++;
  }
  
  // Accessor or getter methods
  public int getAge() {
    return age;
  }
  
  public static int getTotalDogs()
  {
    return totalDogs;
  }
  
  // Mutator or setter method
  public void setAge(int theAge) {
    age = theAge;
  }
  
  public static void setAgeToTen(Dog d) {
    d.setAge(10);
  }
  
  // toString method
  public String toString()
  {
    return "This dog is named " + name + ".";
  }
}