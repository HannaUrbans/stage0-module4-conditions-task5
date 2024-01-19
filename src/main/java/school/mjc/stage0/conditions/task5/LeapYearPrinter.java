package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public static void isLeapYear(int year) {
        if (year%4==0 && year%100!=0)
        {
            System.out.println("leap");
        }

        else if (year%400==0)
        {
            System.out.println("leap");
        }

         else
        {
            System.out.println("not leap");
        }

    }
    public static void main (String[]args)
    {int year = 1600;
    isLeapYear(year);}
}
