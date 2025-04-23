public class Life {
  public String name;
  public String kingdomType;
  public String phylumType;
  public String classType;
  public String orderType;
  public String familyType;
  public String genusType;
  public String speciesType;
  
  public Life(String n, String k, String p, String c, String o, String f, String g, String s) {
    this.name = n;
    this.kingdomType = k;
    this.phylumType = p;
    this.classType = c;
    this.orderType = o;
    this.familyType = f;
    this.genusType = g;
    this.speciesType = s;
  }
  public String makeSound() {
    System.out.println("Wooooo");
    return "Wooooo";
  }
  @Override
  public String toString() {
    return this.name+ ":";
  }
}