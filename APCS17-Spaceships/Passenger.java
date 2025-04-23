public class Passenger {
  public String name;

  public Passenger(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object other) {
    if(other == null) {
      return false;
    } else if (!(other instanceof Passenger)){
      return false;
    }
    Passenger otherP = (Passenger) other;
    return otherP.name.equals(this.name);
  }

  @Override
  public String toString() {
    return "Person: " + this.name;
  }

}