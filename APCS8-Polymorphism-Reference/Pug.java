public class Pug extends Dog {
  
  public Pug(String name, String sound, String owner, String color, int age, int size) {
    super(name, sound, owner, color, age,size);
  }

  @Override
  public String sound() {
    System.out.println("snorfle");
    return "snorfle";
  }

  //@Override will cause an error
  private void callDog() {
    System.out.println("Come here pug");
  }
  public void callDog(String location) {
    callDog();
    System.out.println("We are at " + location);
  }
}