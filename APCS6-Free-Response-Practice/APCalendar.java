public class APCalendar{
  public static int numberOfLeapYears(int year1, int year2){
    int leapYears = 0;
    
    for(int y = year1; y <= year2; y++){
      if(isLeapYear(y)){
        leapYears++;
      }
    }
    return leapYears;
  }
  //Zero indexed day of the week
  public static int dayOfWeek(int month, int day, int year){
    int weekday = firstDayOfYear(year);
    int additionalDays = dayOfYear(month, day, year) - 1;

    for(int d = 1; d <= additionalDays; d++)
    {
      weekday++;

      if(weekday == 7) {
        weekday = 0;
      }
    }
          
    return weekday;
  }
}