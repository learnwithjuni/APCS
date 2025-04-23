public class Dog {
  public String dogName;
  public int age;
  public Dog(String name){
    dogName = name;
    System.out.println(age); //zero
    age = 4;
  }
  public String name() {
    System.out.println(dogName);
    return dogName;
  }
}