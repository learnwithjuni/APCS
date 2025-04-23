public class Chordata extends Animalia {
  public Chordata(String n, String c, String o, String f, String g, String s) {
    super(n, "Chordata", c, o, f, g, s);
  }
  @Override
  public String toString() {
    return super.toString()+ " " + this.phylumType;
  }
}