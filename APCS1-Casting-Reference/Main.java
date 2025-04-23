class Main {
  public static void main(String[] args) {
    int one = 1;
    double half = .5;
    double onePointFive = one + half;
    System.out.println(onePointFive);


    int forty = 40;
    double fortyAndAHalf = (double) forty + half;
    int noDecimal = (int) fortyAndAHalf;

    int num = 4;
    int otherNum = 6;
    System.out.println((int) num / otherNum);
    System.out.println((int) (num/otherNum));

    int output = num / otherNum;
    System.out.println(output);
    double result = fortyAndAHalf/num;
    System.out.println(result);
    result = ((double) num) / otherNum;
    System.out.println(result);
    result = (double) (num/otherNum);
    System.out.println(result);


    //int newNumber = half; errors due to loss of information
  }
}