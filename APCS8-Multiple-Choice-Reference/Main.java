class Main {
  //Most questions refer to the Bank, CheckingAccount, or SavingAccount classes
  //The Class1 class is independent
  public static void main(String[] args) {
    BankAccount b = new BankAccount(1400);
    BankAccount s = new SavingsAccount(1000, .04);
    BankAccount c = new CheckingAccount(500);
  }
}