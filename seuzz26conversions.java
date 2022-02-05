package seuzz;

import java.util.Scanner;

public class seuzz26conversions {
    public static void main(String args[])
    {

        Scanner te = new Scanner(System.in);
        System.out.println("CONVERSIONS");
        System.out.println("Press 1 for celcius and fahrenheit \nPress 2 of r mile - km \nPress 3 for squarefeet- acre");
        System.out.print("ENTER YOUR CHOICE = ");
        int ch = te.nextInt();

        //CHECKIMG THE CHOICE FOR CONVERSION

        if (ch == 1)
        {
            System.out.println("1 . celcius to fahrenheit\n2 . fahrenheit to  celcius");
            System.out.print("ENTER YOUR CHOICE = ");
            int cf1 = te.nextInt();

            //TEMPERATURE CONVERSION

            if (cf1 == 1)
            {
                System.out.print("ENTER THE CELCIUS VALUE:");
                int celci = te.nextInt();
                int fahren = celci * 9 / 5 + 32;
                System.out.print("IF CELCIUS= " + celci + " THAN FAHRENHEIT =" + fahren);
            }

            else if (cf1 == 2)
            {
                System.out.print("ENTER THE FAHRENHEIT VALUE = ");
                int fahre = te.nextInt();
                float celciu = (fahre - 32) * 5 / 9;
                System.out.println("IF FAHRENHEIT= " + fahre + " THAN CELCIUS= " + celciu);
            }

            else
            {
                System.out.println("ENTER CORRECT CHOICE");
            }

        }
        //LENGTH CONVERSION
        else if (ch == 2) {
            System.out.println("1 . MILE to KILOMETER\n2 . KILOMETER to  MILE");
            System.out.print("ENTER YOUR CHOICE = ");
            int cf2 = te.nextInt();

            if (cf2 == 1)
            {
                System.out.print("ENTER THE MILE = ");
                int mi1 = te.nextInt();
                double ki1 = mi1 * 1.609;
                System.out.println("IF MILE = " + mi1 + " THAN KILOMETER =" + ki1);
            }

            else if (cf2 == 2)
            {
                System.out.print("ENTER THE KILOMETER = ");
                int ki2 = te.nextInt();
                double mi2 = ki2 / 1.609;
                System.out.println("IF KILOMETER = " + ki2 + " THAN MILE  " + mi2);
            }
            else
            {
                System.out.println("ENTER CORRECT CHOICE");
            }
        }
        //SQUARE FEET CONVERSION
        else if (ch == 3) {
            System.out.println("1 . SQUARE ROOT T0 ACRE\n2 . ACRE to  SQUAREROOT");
            System.out.print("ENTER YOUR CHOICE = ");
            int cf3 = te.nextInt();
            //CHOICE ASKING
            if (cf3 == 1)
            {
                System.out.print("ENTER THE SQUAREFEET VALUE= ");
                int SQ1 = te.nextInt();
                double AC1 = SQ1 / 43560;
                System.out.println("IF SQUAREFEET" + SQ1 + " THAN ACRE" + AC1);
            }
            else if (cf3 == 2)
            {
                System.out.print("ENTER THE ACRE ");
                int AC2 = te.nextInt();
                double SQ2 = AC2 * 43560;
                System.out.println("IF ACRE= " +  AC2 + " THAN SQAURE FEET" + SQ2);

            }
            else
            {
                System.out.println("ENTER CORRECT CHOICE");
            }
        }
    }
}
