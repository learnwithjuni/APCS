class Main {
  public static void main(String[] args) {
    int myNum = 3;
    doubleNum(myNum);
    System.out.println(myNum);

    Thing myThing = new Thing(3);
    doubleNum(myThing);
    System.out.println(myThing.num);
  }

  public static void doubleNum(int num) {
    num *= 2;
  }

  public static void doubleNum(Thing t) {
    t.num *= 2;  
  }
}