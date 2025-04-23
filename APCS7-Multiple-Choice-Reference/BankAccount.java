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
}