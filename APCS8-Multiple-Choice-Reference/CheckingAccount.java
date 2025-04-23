public class CheckingAccount extends BankAccount {
  private static final double FEE =2.0;
  private static final double MIN_BALANCE = 50.0;

  public CheckingAccount(double acctBalance) {
    //implementation not shown
  }
  /*A fee of FEE deducted if withdraw leaves balance less
  than MIN_BALANCE. Allows for negative balance.*/
  public void withdraw(double amount) {
    //implementation not shown.
  }
}