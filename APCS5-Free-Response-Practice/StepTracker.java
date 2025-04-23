public class StepTracker {
  private final int minStepsRequired;
  private int totalDaysActive;
  private int totalDays;
  private int totalSteps;
  
  public StepTracker(int min)
  {
    this.minStepsRequired = min;
    totalDaysActive = 0;
    totalDays = 0;
    totalSteps = 0;
  }
    
  public void addDailySteps(int steps)
  {
      if(steps >= minStepsRequired)
        totalDaysActive++;
  
      totalDays++;
      totalSteps += steps;
  }
    
  public int totalDaysActive()
  {
      return totalDaysActive;
  }
    
  public double averageSteps()
  {
      if(totalDays == 0)
        return 0;
    
      return totalSteps / (double) totalDays;
  }
}