import java.util.*;

public class Character {
  ArrayList<String> chars;

  public Character(String input) {
    chars = new ArrayList<>();
    split(input);
  }

  public void split(String input) {
    while(input.length() > 0) {
      String word = input.substring(0,1);
      if (!word.equals(" ")) {
        this.chars.add(word);
      }
      input = input.substring(1);
    }
  }
}