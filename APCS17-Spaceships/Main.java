import java.util.*;

class Main {
  public static void main(String[] args) {
    Fleet fleet = makeFleet();
  }

  public static Fleet makeFleet() {
     ArrayList<Spaceship> ships = new ArrayList<>();
     System.out.println("Making a fleet of 4 ships");
    for(int s = 0; s < 4; s++) {
      ArrayList<Room> rooms = new ArrayList<>();
      System.out.println("Making 5 rooms");
      for(int r = 0; r < 5; r++) {
        ArrayList<Passenger> people = makePassenger();
        Room room = new Room(people);
        rooms.add(room);
      }
      Spaceship ship = new Spaceship(rooms);
      ships.add(ship);
    }
    Fleet fleet = new Fleet(ships);
    System.out.println(fleet); 
    return fleet;
  }

  public static ArrayList<Passenger> makePassenger(){
    ArrayList<Passenger> people = new ArrayList<>();
    System.out.println("Making 10 passengers");
    for(int i = 0; i < 10; i++) {
      String name = randomName();
      Passenger person = new Passenger(name);
      people.add(person);
    }
    return people;
  }

  public static String randomName() {
    int n = (int) (Math.random()*11);
    String name = "";
    for(int i = 0; i < n; i++) {
      int letter = (int) (Math.random()*25 + 1) + 97;
      char c = (char) letter;
      String next = String.valueOf(c);
      name += next;
    }
    return name;
  }
}