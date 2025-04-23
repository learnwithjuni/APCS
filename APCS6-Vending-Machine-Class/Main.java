class Main {
  public static void main(String[] args) {

    VendingMachine machine = new VendingMachine();
    machine.setPeanuts(3);
    machine.setPretzels(8);
    machine.setMAndMs(20);

    //won't let us set to value less than 0 or over 100
    machine.setMAndMs(-1);
    machine.setMAndMs(101);

    //print out the vending machine:
    System.out.println("\nVending Machine:");
    System.out.println("Peanuts: " + machine.getPeanuts());
    System.out.println("Pretzels: " + machine.getPretzels());
    System.out.println("MAndMs: " + machine.getMAndMs());

    //vend from the vending machine
    System.out.println("\nVending 5 items of each type...");
    for(int i = 0; i < 5; i++){
      machine.vendPeanuts();
      machine.vendMAndMs();
      machine.vendPretzels();
    } 
    
    //print out the vending machine:
    System.out.println("\nVending Machine:");
    System.out.println("Peanuts: " + machine.getPeanuts());
    System.out.println("Pretzels: " + machine.getPretzels());
    System.out.println("MAndMs: " + machine.getMAndMs());
  }
}