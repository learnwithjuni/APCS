public class Reverser extends ChatBot {
  String[] inputArray;
  
  public Reverser(String input) {
    super(input);
    this.inputArray = input.split(" ");
  }

  @Override
  public String chat() {
    String retVal = "";
    for(int i = inputArray.length -1; i >= 0; i--) {
      retVal += inputArray[i];
      if (i != 0) {
        retVal += " ";
      }
    }
    return retVal;
  }
}