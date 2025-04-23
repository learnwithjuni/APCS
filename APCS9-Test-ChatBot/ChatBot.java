class ChatBot {
  
  String userInput;
  
  public ChatBot(String input) {
    userInput = input;
  }

  public String chat() {
      if(userInput == null) {
        return "";
      }
      return "You said: " + userInput;
  }
}