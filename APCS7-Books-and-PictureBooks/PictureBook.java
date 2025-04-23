public class PictureBook extends Book {
  private String illustrator;

  public PictureBook(String t, String a, int p, String i) {
    super(t, a, p);
    this.illustrator = i;
  }

  public String getIllustrator() {
    return illustrator;
  }

  public void setIllustrator(String i) {
    illustrator = i;
  }

  public boolean hasSameIllustrator(PictureBook p) {
    if (illustrator.equals(p.getIllustrator())){
      return true;
    }
    return false;
  }

  @Override
  public boolean equals(Object o){
    if(super.equals(o)){
      PictureBook b = (PictureBook) o;
      if(this.hasSameIllustrator(b)){
        return true;
      }
    }
    return false;
  }

  public String toString() {
    return "Title: " + this.getTitle() + ", Author: " + this.getAuthor() + ", Illustrator: " + illustrator + " ,Page Number: " + this.getPageNum();
  }
}