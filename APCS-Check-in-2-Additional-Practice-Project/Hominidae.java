public class Hominidae extends Primate {
  public Hominidae(String n, String g, String s) {
    super(n, "Hominidae", g, s);
  }
  @Override
  public String toString() {
    return super.toString()+ " " + this.familyType;
  }
}