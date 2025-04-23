public class Primate extends Mamalia {
  public Primate(String n, String f, String g, String s) {
    super(n, "Primate", f, g, s);
  }
  @Override
  public String toString() {
    return super.toString()+ " " + this.orderType;
  }
}