public class Plantae extends Life {
  public Plantae(String n, String p, String c, String o, String f, String g, String s) {
    super(n, "Plantae", p, c, o, f, g, s);
  }
  @Override
  public String toString() {
    return super.toString()+ " " + this.kingdomType;
  }
}