// seperate from BankAccount question
public class Class1 {
  public void doSomething(int n) {
    n -=4;
    System.out.println(n);
  }
  public static void main(String[] args) {
    Class1 c = new Class2();
    c.doSomething(8);
  }
}

public class Class2 extends Class1 {
  public void doSomething(int n) {
    super.doSomething(n+3);
    n *= 2;
    System.out.println(n);
  }
}