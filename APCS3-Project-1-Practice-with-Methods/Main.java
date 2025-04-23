class Main {
  
  public static void main(String[] args) {
    System.out.println(sum(1,2));
    System.out.println(factorial(5));
    System.out.println(exponent(2,3));
    System.out.println(numVowels("apple"));
    System.out.println(isPrime(23));
  }
  
  public static int sum(int num1, int num2) {
    return num1 + num2;
  }
  
  public static int factorial(int num) {
    int result = 1;
    for (int i = 1; i <= num; i++) {
      result *= i;
    }
    return result;
  }
  
  public static int exponent(int base, int power) {
    int result = 1;
    for (int i = 1; i <= power; i++) {
      result *= base;
    }
    return result;
  }
  
  public static int numVowels(String word) {
    int result = 0;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
        result++;
      }
    }
    return result;
  }
  
  public static boolean isPrime(int num) {
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}