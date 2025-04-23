import java.util.*;

public class Room {
  ArrayList<Passenger> passengers;

  public Room(ArrayList<Passenger> people) {
    this.passengers = people;
  }

  public Room() {
    this.passengers = new ArrayList<>();
  }

  public void addPassenger(Passenger person){
    this.passengers.add(person);
  }

  public boolean removePassenger(Passenger person) {
    int loc = 0;
    while (loc < this.passengers.size()) {
      if(this.passengers.get(loc).equals(person)) {
        this.passengers.remove(loc);
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
    } else if (!(other instanceof Room)) {
      return false;
    }
    Room otherR = (Room) other;
    return this.passengers.equals(otherR.passengers);
  }

  @Override
  public String toString() {
    return "Room: " + this.passengers.toString() + "\n";
  }
}