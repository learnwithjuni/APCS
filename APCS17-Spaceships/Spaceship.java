import java.util.*;

public class Spaceship{
  ArrayList<Room> ship;

  public Spaceship(ArrayList<Room> rooms) {
    this.ship = rooms;
  }
  public Spaceship() {
    this.ship = new ArrayList<>();
  }

  public void addRoom(Room room) {
    this.ship.add(room);
  }

  public boolean removeRoom(Room room) {
    int loc = 0;
    while (loc < this.ship.size()) {
      if(this.ship.get(loc).equals(room)) {
        this.ship.remove(loc);
        return true;
      }
      loc++;
    }
    return false;
  }

  @Override 
  public boolean equals(Object other) {
    if(other == null) {
      return false;
    } if(!(other instanceof Spaceship)) {
      return false;
    } 
    Spaceship otherS = (Spaceship) other;
    return otherS.ship.equals(this.ship);
  }

  @Override
  public String toString() {
    return "Ship: " + this.ship.toString() + "\n";
  }
}