public class Homo extends Hominidae {
  public Homo(String n, String s) {
    super(n, "Homo", s);
  }
  @Override
  public String toString() {
    return super.toString()+ " " + this.genusType;
  }
}