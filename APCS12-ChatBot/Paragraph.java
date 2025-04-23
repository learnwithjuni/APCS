import java.util.*;

public class Paragraph {
  ArrayList<Phrase> phrases;

  public Paragraph(String input) {
    phrases = new ArrayList<>();
    split(input);
  }
  public void split(String input) {
    int spaceLoc = input.indexOf(". ");

    while(spaceLoc >= 0) {
      String sentence = input.substring(0,spaceLoc);
      Phrase phrase = new Phrase(sentence);
      this.phrases.add(phrase);
      input = input.substring(spaceLoc+1);
      spaceLoc = input.indexOf(". ");
    }
    String lastSen = input.substring(spaceLoc + 1);
    Phrase lastPh = new Phrase(lastSen);
    phrases.add(lastPh);
  }

  @Override
  public String toString() {
    return phrases.toString();
  }

}