class Main {
  public static void main(String[] args) {
    System.out.println("\nJUNI BANKING");
    System.out.println("\n---------------------------------\n");
    
    //create a new account
    BankAccount sarah = new BankAccount("Sarah");
    sarah.printAccountInfo();

    // Sarah has insufficient funds
    System.out.println();
    System.out.println("Try to withdraw 10 dollars");
    boolean couldWithdraw = sarah.withdraw(10);
    System.out.println("Was Sarah able to withdraw? " + couldWithdraw);

    // Sarah should have enough funds now
    System.out.println();
    System.out.println("Deposit 25 dollars");
    sarah.deposit(25);
    System.out.println("Try to withdraw 10 dollars");
    couldWithdraw = sarah.withdraw(10);
    System.out.println("Was Sarah able to withdraw? " + couldWithdraw);
    sarah.printAccountInfo();
    
    //create two more accounts
    System.out.println("\n---------------------------------\n");
    BankAccount taylor = new BankAccount("Taylor", 100);
    taylor.printAccountInfo();
    BankAccount jared = new BankAccount("Jared", 25);
    jared.printAccountInfo();

    //print static variables
    System.out.println();
    System.out.println("Bank Interest Rate: " + BankAccount.getInterestRate());
    System.out.println("Bank Total: " + BankAccount.getBankTotal());
    System.out.println("Number of Accounts: " + BankAccount.getNumAccounts());
  }
}