import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Please enter text.");
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    Phrase phrase = new Phrase(input);
    Paragraph para = new Paragraph(input);
    Character chars = new Character(input);
    ChatBot bot = new ChatBot(phrase, para,chars);

    System.out.println("What type of information would you like? characters, words, or sentences? or are you done?");
    input = in.nextLine();
    while(!input.equals("done")) {
      if(input.equals("words")) {
          bot.words();
        } else if (input.equals("sentences")) {
          bot.paragraphs();
        } else if(input.equals("characters")) {
          bot.characters();
        } else {
          System.out.println("Sorry, I did not understand that");
        }
        System.out.println("And what would you like to do now?");
        input = in.nextLine();
    }
 
  }
}