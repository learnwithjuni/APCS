public class Message {
  private String message;

  public Message(String message) {
    this.message = message;
  }

  public void encrypt(int num) {
    char[] letters = this.message.toCharArray();
    int index = 0;
    for(char c : letters) {
      letters[index] += num;
      index++;
    }
    this.message = String.valueOf(letters);
  }

  public void decrypt(int num){
    char[] letters = message.toCharArray();
    int index = 0;
    for(char c : letters) {
      letters[index] -= num;
      index++;
    }
    this.message = String.valueOf(letters);
  }

  @Override
  public String toString() {
    return this.message;
  }
}