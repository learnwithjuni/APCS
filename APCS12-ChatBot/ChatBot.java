public class ChatBot {
  Phrase phrase;
  Paragraph paragraph;
  Character character;
  int num = 0;

  public ChatBot(Phrase phrase, Paragraph paragraph, Character character) {
    this.phrase = phrase;
    this.paragraph = paragraph;
    this.character = character;
  }

  public void words() {
    for(String word : this.phrase.words) {
      countWords(word);
    }
    num = 0;
  }

  private void countWords(String word) {
      //Logic for specific words
      System.out.println(word);
      System.out.println("is the " + nth()+ " word.");
      num +=1;
  }

  public void paragraphs() {
    for(Phrase phr : paragraph.phrases) {
      countPara(phr);
    }
    num = 0;
  }

  private void countPara(Phrase phr) {
    //Logic for specific paragraphs
    System.out.println(phr);
    System.out.println("is the " + nth()+ " sentence.");
    num +=1;
  }

  public void characters() {
    for(String s : character.chars) {
      countChars(s);
    }
    num=0;
  }

  private void countChars(String s) {
    //Logic for specifif characters
    System.out.println(s);
    System.out.println("Is the " + nth() + " character.");
    num+=1;
  }

  private String nth() {
    if (num == 1) {
      return "1st";
    } else if (num == 2) {
      return "2nd";
    } else if (num == 3) {
      return "3rd";
    } return num + "th";
  }

}