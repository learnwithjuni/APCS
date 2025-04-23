public class Farm {
  private int numCows;
  private int numGoats;
  public static String season = "summer";

  public Farm(int cows, int goats) {
    numCows = cows;
    numGoats = goats;
  }

  public static String getSeason() {
    return season;
  }

  public static void setSeason(String newSeason) {
    season = newSeason;
  }
}