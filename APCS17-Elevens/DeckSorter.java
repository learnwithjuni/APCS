import java.util.*;
public class DeckSorter {
  public Deck deck;

  public DeckSorter(Deck deck) {
    this.deck = deck;
  }

  public void insertionSort(boolean print) {
    long start = System.currentTimeMillis();
    ArrayList<Card> arr = this.deck.getArr();
    int n = arr.size();
    for (int i=1; i<n; ++i) 
    { 
      Card key = arr.get(i); 
      int j = i-1; 

      /* Move elements of arr[0..i-1], that are 
        greater than key, to one position ahead 
        of their current position */
      while (j>=0 && arr.get(j).greaterThan(key) > 0) 
      { 
        arr.set(j+1, arr.get(j)); 
        j = j-1; 
      } 
      arr.set(j+1,key); 
    }
    long elapsed = System.currentTimeMillis() - start;
    System.out.println("This took " + elapsed + " miliseconds");
    if(print) {
      printCards(arr);
    }
  }

  public void selectionSort(boolean print) {
    long start = System.currentTimeMillis();
    ArrayList<Card> arr = this.deck.getArr();
    int n = arr.size();
    // One by one move boundary of unsorted subarray
    for(int i = 0; i < n-1; i++) {
      // Find the minimum element in unsorted array
      int minLoc = i;
      for(int j = i+1; j < n; j++) {
        if(arr.get(minLoc).greaterThan(arr.get(j))>0) {
          minLoc = j;
        }
      }
      // Swap the found minimum element with the first
      Card temp = arr.get(minLoc);
      arr.set(minLoc, arr.get(i));
      arr.set(i, temp);
    }
    long elapsed = System.currentTimeMillis() - start;
    System.out.println("This took " + elapsed + " miliseconds");
    if(print) {
      printCards(arr);
    }
    
  }

  private void printCards(ArrayList<Card> arr) {
    for(Card c : arr) {
      System.out.println(c);
    } 
  }
}