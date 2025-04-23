class Main {
  public static void main(String[] args) {
    String[] message = stringToLetters("Hello World");
    System.out.println(message);
  }

  public static String lettersToString(String[] letters){
    String string= "";
    for(String letter : letters){
      string += letter;
    }
    return string;
  }
  public static String[] stringToLetters(String string){
    String[] letters = new String[string.length()];
    for(int i = 0; i < string.length(); i++){
      letters[i] = Character.toString(string.charAt(i));
    }
    return letters;
  }
}