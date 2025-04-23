public class Bacteria extends Life {
  public Bacteria(String n, String p, String c, String o, String f, String g, String s) {
    super(n, "Bacteria", p, c, o, f, g, s);
  }
  @Override
  public String toString() {
    return super.toString()+ " " + this.kingdomType;
  }
}