class Main {
  public static void main(String[] args) {
    int[][] A = {{1,2,3},{4,5,6}};
    int[][] B = {{1,2},{3,4},{4,5}};
    System.out.println("\nMatrix A: ");
    printMatrix(A);
    System.out.println("\nMatrix B: ");
    printMatrix(B);

    int[][] prod = matrixMul(A,B);
    System.out.println("\nA*B = ");
    printMatrix(prod);

    int[][] C = {{1,2,3},{4,5,6},{7,8,9}};
    int[][] D = {{9,8,7},{6,5,4},{3,2,1}};
    System.out.println("\nMatrix C: ");
    printMatrix(C);
    System.out.println("\nMatrix D: ");
    printMatrix(D);

    int[][] sum = matAdd(C, D);
    System.out.println("\nC+D = ");
    printMatrix(sum);
    
    int[][] difference = matSub(C, D); 
    System.out.println("\nC-D = ");
    printMatrix(difference);
    
  }

  /*Assume each has at least one element*/
  public static int[][] matrixMul(int[][] A, int[][]B) {
    int r1 = A.length;
    int c1 = A[0].length;
    int r2 = B.length;
    int c2 = B[0].length;
    int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    return product;
  }
  /*Assume each has at least one element and both matricies have the same dimensions*/
  public static int[][] matSub(int[][] A, int[][]B) {
    int row = A.length;
    int col = A[0].length;
    int[][] difference = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        difference[i][j] = A[i][j] - B[i][j];
      }
    }
    return difference;
  }
  
  /*Assume each has at least one element and both matricies have the same dimensions*/
  public static int[][] matAdd(int[][] A, int[][]B) {
    int row = A.length;
    int col = A[0].length;
    int[][] sum = new int[row][col];
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        sum[i][j] = A[i][j] + B[i][j];
      }
    }
    return sum;
  }
  public static void printMatrix(int[][] matrix){
    for(int[] row : matrix){
      for(int i : row){
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
}