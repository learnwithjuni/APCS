class Main {
  public static void main(String[] args) {

    System.out.println("\nMaking two towers");
    Tower one = new Tower(5);
    Tower two = new Tower(5);

    System.out.println("Sending message\n");
    Message m = new Message("We meet at midnight");

    one.transmit(m);
    two.recieve(m);
  }
}