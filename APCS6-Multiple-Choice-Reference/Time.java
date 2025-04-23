public class Time {
  private int hrs;
  private int mins;
  private int secs;

  public Time() {
    //implementation not shown
  }

  public Time(int h, int m, int s) {
    //implementation not shown
  }

  public void resetTime(int h, int m, int s) {
    //implementation not shown
  }

  public void increment() {
    //implementation not shown
  }

  public boolean equals(Time t) {
    //implementation not shown
    return false;
  }

  public boolean lessThan(Time t) {
    //implementation not shown
    return false;
  }

  public String toString() {
    //implementation not shown
    return "";
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