import java.util.*;
class DownShifter extends Shifter {
  @Override
  public String shift(String word) {
    return shift(word, -1);
  }
}