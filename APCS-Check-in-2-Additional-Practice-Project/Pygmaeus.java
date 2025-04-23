public class Pygmaeus extends Pongo {
  public Pygmaeus(String n) {
    super(n, "Pygmaeus");
  }
  @Override
  public String toString() {
    return super.toString()+ " " + this.speciesType;
  }
}