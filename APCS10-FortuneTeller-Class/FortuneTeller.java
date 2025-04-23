import java.util.*;
// Create a class called FortuneTeller. Each FortuneTeller should have an array of five fixed fortunes (strings) that you make up. Printing a FortuneTeller should output one of these five fortunes randomly.

public class FortuneTeller {
  private ArrayList<String> fortunes;
  
  public FortuneTeller() {
    fortunes = new ArrayList<>(5);
    fortunes.add("You will win the lottery!");
    fortunes.add("You will get the flu.");
    fortunes.add("You will adopt a puppy!");
    fortunes.add("You will drink some water.");
    fortunes.add("You will make a new friend!");
  }
  
  public String toString() {
    if (fortunes.size() > 0) {
      int randomIndex = (int)(Math.random()*fortunes.size());
      return fortunes.remove(randomIndex);
    } else {
      return "The future is foggy… come back tomorrow!";
    }
  }

}