import java.util.*;
public class Phrase {
  String raw_String;
  ArrayList<String> words;
  
  public Phrase(String in) {
    raw_String = in;
    words = new ArrayList<>();
    split();
  }

  public void split() {
    String copy = raw_String; //Immutable, so this operation is safe
    int spaceLoc = copy.indexOf(" ");

    while(spaceLoc >= 0) {
      String word = copy.substring(0,spaceLoc);
      if (!word.equals(" ")) {
        this.words.add(word);
      }
      copy = copy.substring(spaceLoc+1);
      spaceLoc = copy.indexOf(" ");
    }
    String lastword = copy.substring(spaceLoc + 1);
    words.add(lastword);
  }

  @Override
  public String toString() {
    return words.toString();
  }
}