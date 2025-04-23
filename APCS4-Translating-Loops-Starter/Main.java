class Main {
  public static void main(String[] args) {
    for(int i = 0; i < 10; i++) {
      System.out.print(i);
    }

    for(int j = 0; j > -10; j--) {
      System.out.print(j);
    }

    for(int k = 1; k < 10; k *= 2) {
      System.out.print(k);
    }

    for(int l = 0; l != -1; l += 1) {
      System.out.print(l);
      if (l % 3 == 0) {
        break;
      }
    }
  }
}