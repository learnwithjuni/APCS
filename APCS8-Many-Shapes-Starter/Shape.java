public class Shape{
  private String name = "unknown";
  private int numSides = 0;

  public Shape(){}
  public Shape(String name, int numSides){
    this.name = name;
    this.numSides = numSides;
  }

  //methods to override:
  public double getArea(){
    return 0.0;
  }
  public double getPerimeter(){
    return 0.0;
  }

  //getters/setters
  public int getNumSides(){
    return numSides;
  }
  public String getName(){
    return name;
  }

}