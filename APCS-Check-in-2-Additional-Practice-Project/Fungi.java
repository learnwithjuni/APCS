public class Fungi extends Life {
  public Fungi(String n, String p, String c, String o, String f, String g, String s) {
    super(n, "Fungi", p, c, o, f, g, s);
  }
  @Override
  public String toString() {
    return super.toString()+ " " + this.kingdomType;
  }
}