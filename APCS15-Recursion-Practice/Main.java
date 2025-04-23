class Main {
  public static void main(String[] args) {

    System.out.print("\n5! = ");
    System.out.println(factorial(5));

    System.out.print("2^8 =  ");
    System.out.println(exponent(2, 6));

    System.out.print("Length of \"hello world\": ");
    System.out.println(length("hello world"));

    System.out.print("8th number in the fibonacci sequence: ");
    System.out.println(fibonacci(8));

    System.out.print("8th number in the lucas sequence: ");
    System.out.println(lucas(8));

    System.out.println("Forward and Backward Cascade: ");
    cascadeForward("mountain");
    cascadeBackward("mountain");

    System.out.print("log2(256) = ");
    System.out.println(log(2, 256));
    System.out.print("log2(3) = ");
    System.out.println(log(2, 3));

    System.out.print("Greatest common divisor of 456 and 342: ");
    System.out.println(gcd(456,342));

  }

  //1
  public static int factorial(int n){
    //base case
    if(n <= 1){
      return 1;
    }
    //recursive step 
    return n*factorial(n-1);
  }

  //2
  public static int exponent(int base, int power){
    if(power == 0){
      return 1;
    }
    return base * exponent(base, power-1);
  }

  //4
  public static int length(String string){
    //System.out.println("s: "  + string);
    if(string.equals("")){
      return 0;
    }
    return 1 + length(string.substring(1));
  }

  //5
  // n     | 1 2 3 4 5 6 7  8  9  10 11 12
  // value | 1 1 2 3 5 8 13 21 34 55 89 144
  public static int fibonacci(int n){
    //base case
    if(n == 1 || n == 2){
      return 1;
    }
    //recursive step
    return fibonacci(n-1) + fibonacci(n-2);
  }

  //6
  // n     | 1 2 3 4 5 6  7  8  9  10 11  12
  // value | 2 1 3 4 7 11 18 29 47 76 123 199
  public static int lucas(int n){
    //base case
    if(n == 1){
      return 2;
    }
    if(n == 2){
      return 1;
    }
    //recursive step
    return lucas(n-1) + lucas(n-2);
  }

  //7
  public static void cascadeForward(String word){
    if(word.length() == 0){
      return;
    }
    int last = word.length() - 1;
    cascadeForward(word.substring(0, last));

    System.out.println(word); // after recursion
  }

  //7
  public static void cascadeBackward(String word){
    
    if(word.length() == 0){
      return;
    }
    System.out.println(word); //before recursion

    int last = word.length() - 1;
    cascadeBackward(word.substring(0, last));
  }

  //8 
  public static int log(int base, int result){
    return log(base, result, 0);
  }
  public static int log(int base, int result, int ans){
    //System.out.println(base + " " + result);
    //base case (end)
    if(result == 1){
      return ans;
    }

    //base case (error)
    double d = (double)result/base;
    int i = result/base;
    if(d != i){
      return -1;
    }

    //recursive step
    return log(base, i);
  }

  //9 
  // euclid's algorithm
  public static int gcd(int a, int b){
    //System.out.println("a: " + a + "\tb: " + b);
    if(a % b == 0){
      return b;
    }
    return gcd(b, a%b);
  }
  
}