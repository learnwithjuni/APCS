public class Animalia extends Life {
  public Animalia(String n, String p, String c, String o, String f, String g, String s) {
    super(n, "Animalia", p, c, o, f, g, s);
  }
  @Override
  public String toString() {
    return super.toString()+ " " + this.kingdomType;
  }
}