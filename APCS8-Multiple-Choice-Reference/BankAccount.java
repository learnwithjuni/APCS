public class BankAccount {
  private double balance;
  public BankAccount() {
    this.balance = 0;
  }
  public BankAccount(double amount) {
    this.balance = amount;
  }
  public void deposit(double amount) {
    this.balance += amount;
  }
  public void withdraw(double amount){
    this.balance -= amount;
  }
  public double getBalance() {
    return this.balance;
  }

  //added for question 4
  /*Transfer amont from this BankAccount to another
  BankAccount. 
  Precondition: balance > amount
  @param: another a different BankAccount object
  @param amount the amount to be transfered*/
  public void transfer(BankAccount another, double amount){
    withdraw(amount);
    another.deposit(amount);
  }
}