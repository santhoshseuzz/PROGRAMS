package seuzz;

import java.util.Scanner;

public class seuzz27leapnonleap
{
    public static void main(String args[])
    {
        //enter the leap year
        Scanner leap= new Scanner(System.in);
        System.out.print("ENTER THE YEAR = ");
        int year = leap.nextInt();
        boolean ans= false;
        //checking in if statement
        //checking with 400 becoz centuries only divided by 400  are only leap years
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {

            System.out.println(year+ " is a leap year");
        }
        else
        {
            System.out.println(year+ " is not a leap year");

        }


    }
}
