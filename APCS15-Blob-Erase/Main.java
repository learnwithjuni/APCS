class Main {
  public static void main(String[] args) {
    Image image = new Image();

    System.out.println("\nOriginal Grid:");
    image.display();

    System.out.println("\nDeleting Blobs That Touch the Top Row");
    for(int i = 0; i < 10; i++){
      image.eraseBlob(0, i);
    }
  
    System.out.println("\nNew Grid:");
    image.display();
  }
}