import java.util.Scanner;
public class MyDateTest
{
  static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

       /* System.out.print("Enter start year: ");
        int startYear = input.nextInt();
        System.out.print("Enter end year: ");
        int endYear = input.nextInt();

    MyDate date = new MyDate(1, 1, startYear);

    int count = 0;
*/
    MyDate md1 = new MyDate(15,7,2006);
    int days = 0;
    while (!(md1.getDay()==21 && md1.getMonth()==9 && md1.getYear()==2026))
    {
      md1.nextDay();
      days++;
    }
    System.out.println(days);


  }
}


