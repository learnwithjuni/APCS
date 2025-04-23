import java.util.*;

public class Fleet {
  public ArrayList<Spaceship> ships;

  public Fleet() {
    this.ships = new ArrayList<>();
  }

  public Fleet(ArrayList<Spaceship> ships) {
    this.ships = ships;
  }

  @Override
  public String toString() {
    return "Fleet: " + this.ships.toString() + "\n";
  }
}