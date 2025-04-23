public class Tower {
  private int num;

  public Tower(int num) {
    this.num = num;
  }

  public Message transmit(Message message) {
    message.encrypt(this.num);
    System.out.println("Encrypted: " + message);
    return message;
  }
  public Message recieve(Message message) {
    message.decrypt(this.num);
    System.out.println("Decrypted: " + message);
    return message;
  }
}