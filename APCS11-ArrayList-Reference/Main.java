import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> myStrings = new ArrayList<String>();
    ArrayList<Integer> myInts = new ArrayList<Integer>();

    myStrings.add("sandstorm");
    myStrings.add("crab rave");
    myInts.add(42);
    myInts.add(-73);

    myStrings.add(0, "dragostea din tei");
    myInts.add(1137);

    System.out.println(myInts.get(0));
    System.out.println(myInts.get(2));

    for (int i = 0; i < myInts.size(); i++) {
      System.out.println(myInts.get(i));
    }

    for (int i = 0; i < myInts.size(); i++) {
      if (myInts.get(i) < 0) {
        myInts.set(i, -1);
      } else if (myInts.get(i) > 0) {
        myInts.set(i, 1);
      }
    }
    System.out.println(myInts);

    while (myStrings.size() > 0) {
      System.out.println(myStrings.remove(0));
    }

    // Throws an IndexOutOfBounds exception
    // System.out.println(myInts.get(9));
  }
}