import java.util.*;

public class Shifter {

  public Scanner in;

  public Shifter() {
    this.in = new Scanner(System.in);
  }

  public String ask(String question) {
    System.out.println(question);
    String response = in.nextLine();
    return response;
  }
  
  public String shift() {
    String val = ask("Please enter a word: ");
    System.out.println(val);
    return val;
  }
}