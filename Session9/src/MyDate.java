public class MyDate
{

    private int Day;
    private int Month;
    private int Year;

    //no-argument constructor
  public MyDate()
    {
      Day = 28;
      Month = 11;
      Year = 1985;
    }

    //two-argument constructor
  public MyDate(int Day, int Month,int Year )
    {
      this.Day=Day;
      this.Month=Month;
      this.Year=Year;
    }

    public String toString()
    {
      return "Day : "+ Day+ "\n"+
          "Month : " + Month + "\n"
          + "Year: "+Year;
    }

    public void setDay(int day)
    {
      Day = day;
    }

    public void setMonth(int month)
    {
      Month = month;
    }

    public void setYear(int year)
    {
      Year = year;
    }

    public int getDay()
    {
      return Day;
    }

    public int getMonth()
    {
      return Month;
    }

    public int getYear()
    {
      return Year;
    }

    public String displayDate()
    {
      return Day + "/" +  Month + "/" + Year;
    }

    public boolean IsLeapYear()
    {
      if(Year%4==0 && Year%100!=0  ||  Year%400==0)
      {
        return true ;
      }
      else
      {
        return false;
      }
    }
  public int daysInMonth() {
    if (Month == 2) {
      if (IsLeapYear()) {
        return 29;
      } else {
        return 28;
      }
    } else if (Month == 4 || Month == 6 || Month == 9 || Month == 11) {
      return 30;
    } else {
      return 31;
    }
  }



  public void nextDay()
  {
    Day++;
    if (Day > daysInMonth()) {
      Day = 1;
      Month++;

      if (Month > 12) {
        Month = 1;
        Year++;
    }
      }
    }

}
