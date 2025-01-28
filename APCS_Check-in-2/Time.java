// Classes 2 question two
public class Time {
  private int hrs;
  private int mins;
  private int secs;

  public static void main(String[] args) {
    Time t = new Time();
    //Which implementation number would each call run
    t.resetTime(4); 
    t.resetTime(2,3);
    t.increment(false);
    t.equals(true);
  }

  public Time() {
    //implementation not shown
  }

  public Time(int h, int m, int s) {
     //implementation not shown
  }

  public void resetTime(int h, int m, int s) {
     //implementation1
  }

  public void resetTime(int h) {
     //implementation2
  }
  public void resetTime(int h, int m) {
     //implementation3
  }

  public void increment() {
     //implementation1
  }

  public void increment(Boolean bool) {
    //implementation2
  }

  public boolean equals(Time t) {
    //implementation 1
    return false; //placeholder
  }

  public boolean equals(Boolean b) {
    //implementation 2
    return false; //placeholder
  }

  public boolean lessThan(Time t) {
    //implementation not shown
    return false; //placeholder
  }

  public String toString() {
    //implementation not shown
    return ""; //placeholder
  }

  public int getHours() {
    return hrs;
  }

  public int getMins() {
    return mins;
  }

  public int getSecs() {
    return secs;
  }

  public void setHours(int h) {
    /*if .... condition to control what this variable can be set to */
    this.hrs = h;
  }

  public void setMins(int m) {
    /*if .... condition to control what this variable can be set to */
    this.mins = m;
  }

  public void setSecs(int s) {
    /*if .... condition to control what this variable can be set to */
    this.secs = s;
  }
  
}