public class Pongo extends Hominidae {
  public Pongo(String n, String s) {
    super(n, "Pongo", s);
  }
  @Override
  public String toString() {
    return super.toString()+ " " + this.genusType;
  }
}