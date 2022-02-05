package seuzz;

import java.util.Scanner;

public class seuzz46reversenumber {
    public static void main (String[]args) {
        // getting inputs of reversal
        System.out.print("Enter the Integer Value for Reversal = ");
        Scanner get = new Scanner(System.in);
        int reverse = 0, remainder ,t;
        int inputInt = get.nextInt();
        t= inputInt ;
         //lopping for spLITING digits AND THEN COUNT
        while (inputInt  != 0) {
            remainder = inputInt % 10;
            inputInt /= 10;
            reverse = (reverse * 10) + remainder;
        }
        System.out.println("\nReverse of " +t+ " is = " + reverse);
    }
}
