import java.util.*;
class UpShifter extends Shifter {
  @Override
  public String shift(String word) {
    return shift(word, 1);
  }
}