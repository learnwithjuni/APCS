public class Mamalia extends Chordata {
  public Mamalia(String n, String o, String f, String g, String s) {
    super(n, "Mamalia", o, f, g, s);
  }
  @Override
  public String toString() {
    return super.toString()+ " " + this.classType;
  }
}