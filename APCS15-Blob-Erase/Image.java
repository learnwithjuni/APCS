class Image {
  private final char EMPTY = ' ';
  private final char FULL = '#';
  private char[][] image; // square grid to represent image
  private int size;

  public Image() {
    size = 10;
    image = new char[10][10];
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        double flip = Math.random();
        if (flip > .5) {
          image[i][j] = FULL;
        } else {
          image[i][j] = EMPTY;
        }
      }
    }
  }

  public void display() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.print(image[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }

  /* If 0 <= row < size, 0 <= col < size, and image[row][col]
  is FULL, sets all cells in the same blob to EMPTY
  Otherwise, leaves image unchanged */
  public void eraseBlob(int row, int col) {
    if (row >= 0 && row < size && col >= 0 && col < size) {
      if (image[row][col] == FULL) {

        // erase the cell
        image[row][col] = EMPTY;
        
        // note that the ordering is irrelevant 
        eraseBlob(row-1, col);
        eraseBlob(row+1, col);
        eraseBlob(row, col-1);
        eraseBlob(row, col+1);
      }
    }
  }
}