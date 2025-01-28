import java.util.*;

public class Shifter {

  public String shift(String word){
    return shift(word, 0);
  }

  protected String shift(String word, int amount){

    // convert to char array
    char[] letters = word.toCharArray();
    String returnValue = "";

    int shift;
    for(char letter : letters) {
      if(letter >= 'A' && letter <= 'Z'){
        // UPPER CASE
        shift = letter - 'A';
        shift += amount;
        shift = shift % 26;
        returnValue += (char)('A' + shift);
      }else if(letter >= 'a' && letter <= 'z'){
        // lower case 
        shift = letter - 'a';
        shift += amount;
        shift = shift % 26;
        returnValue += (char)('a' + shift);
      }else{
        // everything else
        returnValue += letter;
      }
    }
    return returnValue;
  }
  
}