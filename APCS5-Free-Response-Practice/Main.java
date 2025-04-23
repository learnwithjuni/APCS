class Main {
  public static void main(String[] args) {
    StepTracker tr = new StepTracker(10000);
    tr.activeDays(); //0
    tr.addDailySteps(9000);
    tr.addDailySteps(5000);
    tr.averageSteps(); //7000
    tr.addDailySteps(13000); 
    tr.averageSteps(); //9000
    tr.addDailySteps(23000); 
    tr.addDailySteps(1111); 
    tr.activeDays();  //2
  }
}