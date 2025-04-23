public class BankAccount {
  private String name;
  private double balance;
  private static int numAccounts = 0;
  private static double bankTotal = 0;
  private static double interestRate = 0.07;

  //constructors
  public BankAccount(String user, double balance) {
    this.name = user;
    this.balance = balance;
    bankTotal += balance;
    numAccounts += 1;
  }
  public BankAccount(String user) {
    this(user, 0);
  }

  //deposits
  public void deposit(double amount) {
    this.balance += amount;
    bankTotal += amount;
  }
  public void deposit(double numBills, double billAmt) {
    this.balance += numBills * billAmt;
    bankTotal += numBills * billAmt;
  }

  //withdraws
  public boolean withdraw(double amount) {
    if(balance < amount) {
      return false;
    }
    this.balance -= amount;
    bankTotal -= amount;
    return true;
  }
  public boolean withdraw() {
    return withdraw(this.balance);
  } 

  //getters and setters
  public String getName(){
    return name;
  }
  public double getBalance(){
    return balance;
  }
  public static double getBankTotal() {
    return bankTotal;
  }
  public static double getInterestRate() {
    return interestRate;
  }
  public static void setInterestRate(double rate) {
    interestRate = rate;
  }
  public static int getNumAccounts(){
    return numAccounts;
  }
  public void printAccountInfo() {
    System.out.println("Name: " + name + ", Balance: $" + balance);
  }
}