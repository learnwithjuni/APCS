public class Book {
  private String title;
  private String author;
  private int pageNum;

  public Book(String t, String a, int p) {
    this.title = t;
    this.author = a;
    this.pageNum = p;
  }

  public Book(String t, String a) {
    this.title = t;
    this.author = a;
  }

  public String getTitle() {
    return title;
  }
  public String getAuthor() {
    return author;
  }
  public int getPageNum(){
    return pageNum;
  }
  public void changePage(int amt) {
    pageNum += amt;
  }

  public boolean hasSameAuthor(Book b) {
    if (author.equals(b.getAuthor())) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public boolean equals(Object o) {
    if(!(o instanceof Book)){
      return false;
    }
    Book b = (Book) o;
    if (author.equals(b.getAuthor()) && (title.equals(b.getTitle()))) {
      return true;
    } else {
      return false;
    }
  }

  public String toString() {
    return "Title: " + title + ", Author: " + author + ", Page Number: " + pageNum;
  }
}