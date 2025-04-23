import java.util.Scanner;

public class RobustScanner{
  private Scanner scanner;
  public RobustScanner(){
    this.scanner = new Scanner(System.in);
  }
  public String next(){
    return scanner.next();
  }
  public int nextInt(){
    int value = 0;
    boolean valid = false;
    while(!valid){
      try{
        value = scanner.nextInt();
        valid = true;
      }catch(Exception ex){
        System.out.print("Error! Try again: ");
        scanner.next();
      }
    }
    return value;
  }
  public double nextDouble(){
    double value = 0.0;
    boolean valid = false;
    while(!valid){
      try{
        value = scanner.nextDouble();
        valid = true;
      }catch(Exception ex){
        System.out.print("Error! Try again: ");
        scanner.next();
      }
    }
    return value;
  }
}