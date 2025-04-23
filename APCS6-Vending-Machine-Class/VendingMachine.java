public class VendingMachine {
    private int peanuts;
    private int pretzels;
    private int mAndMs;

    //peanuts
    public int getPeanuts() {
      return peanuts;
    }
    public void setPeanuts(int peanuts) {
      if(peanuts >= 0 && peanuts <= 100){
        this.peanuts = peanuts;
      }
    }
    public void vendPeanuts(){
      //calling setPeanuts guarantees we'll never drop below 0
      setPeanuts(peanuts-1); 
    }

    //pretzels
    public int getPretzels() {
      return pretzels;
    }
    public void setPretzels(int pretzels) {
      if(pretzels >= 0 && pretzels <= 100){
        this.pretzels = pretzels;
      }
    }
    public void vendPretzels(){
      setPretzels(pretzels-1);
    }

    //mAndms
    public int getMAndMs() {
      return mAndMs;
    }
    public void setMAndMs(int mAndMs) {
      if(mAndMs >= 0 && mAndMs <= 100){
        this.mAndMs = mAndMs;
      }
    }
    public void vendMAndMs(){
      setMAndMs(mAndMs-1);
    }
}
