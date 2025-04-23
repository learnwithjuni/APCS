class Main {
  public static void main(String[] args) {
    // 0. Define a double variable called forty with value 40.0
    double forty = 40.0;

    // 1. Define a variable called one and set it equal to the value: forty == 20
    boolean one = (forty == 20);
    System.out.println(one); // false


    // 2. Define variable called two and set it equal to the value: 35 <= forty
    boolean two = (35 <= forty);
    System.out.println(two); // true


    // 3. Define variable called three and set it equal to the value: (int) forty
    int three = (int) forty;
    System.out.println(three); // 40


    // 4. Define variable called four and set it equal to the value: three == forty
    boolean four = (three == forty);
    System.out.println(four); // true;


    // 5. Define a double variable called five and set it equal to the value: 35.5
    double five = 35.5;
    // Define an integer variable called six and set it equal to the value: (int) five
    int six = (int) five;
    // Define a boolean variable seven and set it equal to the value: five == six
    boolean seven = (five == six);
    
    System.out.println(seven); // false


    // 6. Define a variable called eight and set it equal to the value: (boolean) seven
    boolean eight = (boolean) seven;
    System.out.println(eight); // false

    // 7. Define a variable called nine and set it equal to the value: eight == seven
    boolean nine = (eight == seven);
    System.out.println(nine); // true
  }
}