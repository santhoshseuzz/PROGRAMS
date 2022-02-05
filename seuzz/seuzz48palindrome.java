package seuzz;

import java.util.Scanner;

public class seuzz48palindrome {
    public static void main(String[] args) {

        // getting inputs check palindrome
        System.out.print("Enter the Integer Value  = ");
        Scanner get = new Scanner(System.in);
        int reverse = 0, remainder, t;
        int inputInt = get.nextInt();
        t = inputInt;

        //lopping for spLITING digits AND THEN COUNT
        while (inputInt != 0) {
            remainder = inputInt % 10;
            inputInt /= 10;
            reverse = (reverse * 10) + remainder;
        }
        if(t==reverse)
        System.out.println("\ngiven number is palindrome " );
        else{
            System.out.println("\ngiven number is  not palindrome " );
        }
    }
}
