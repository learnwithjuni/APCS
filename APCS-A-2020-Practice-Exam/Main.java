class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  /**
  * Note that this code WILL NOT BUILD since the implementation of the classes needed is not provided.
  */

  /**
  * SOLUTION FOR QUESTION 1
  */
  public int countElectronicsByMaker(String maker) {
    int count = 0;
    for (Gizmo obj : purchases) {
      if (obj.isElectronic() && obj.getMaker().equals(maker)) {
        count++;
      }
    }
    return count;
  }

  /** Returns true if any pair of adjacent purchased Gizmo objects
  are equivalent, and
  * false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair() {
    if (purchases.size() < 2) {
      return false;
    }

    for (int i = 1; i < purchases.size() - 1; ++i) {
      if (purchases.get(i).equals(purchases.get(i + 1))) {
        return true;
      }
    }
    return false;
  }

  /**
  * SOLUTION FOR QUESTION 2
  */
  /** Returns true if numWithCheckDigit is valid, or false
  * otherwise, as described in part (a)
  * Precondition: The number of digits in numWithCheckDigit is
  * between two and seven, inclusive.
  * numWithCheckDigit >= 0
  */
  public static boolean isValid(int numWithCheckDigit) {
    int checkDigit = numWithCheckDigit % 10;
    int checkValue = numWithCheckDigit / 10;
    if (getCheck(checkValue) == checkDigit) {
      return true;
    } else {
      // incorrectCount++; // this line should not appear in the final solution or be submitted; but this is what the modification of isValid for question 2b would look like
      return false;
    }
  }
}