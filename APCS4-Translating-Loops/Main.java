class Main {
  public static void main(String[] args) {
    System.out.println("For loop output: ");
    for(int i = 0; i < 10; i++) {
      System.out.print(i);
    }
    System.out.println("\nWhile loop output:");
    int i = 0;
    while(i < 10) {
      System.out.print(i);
      i++;
    }

    System.out.println("\nFor loop output: ");
    for(int j = 0; j > -10; j--) {
      System.out.print(j);
    }
    System.out.println("\nWhile loop output:");
    int j = 0;
    while(j > -10) {
      System.out.print(j);
      j--;
    }

    System.out.println("\nFor loop output: ");
    for(int k = 1; k < 10; k *= 2) {
      System.out.print(k);
    }
    System.out.println("\nWhile loop output:");
    int k = 1;
    while(k < 10) {
      System.out.print(k);
      k *= 2;
    }

    System.out.println("\nFor loop output: ");
    for(int l = 0; l != -1; l += 1) {
      System.out.print(l);
      if (l % 3 == 0) {
        break;
      }
    }
    System.out.println("\nWhile loop output:");
    int l = 0;
    /*Approach one*/
    while(l != -1) {
      System.out.print(l);
      if (l % 3 == 0) {
         break;
      }
      l += 1;
    }
    l = 0;
    /*Approach two*/
    while(l % 3 != 0) {
      l += 1;
    }
  }
}