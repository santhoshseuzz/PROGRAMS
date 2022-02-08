package seuzz;

import java.util.Scanner;

public class seuzz55 {
    public static void checkprime(int prime) {
        int k = 0;
        for (int j = 2; j <= prime/ 2; ++j) {
            if (prime % j == 0) {
                k = 1;
                break;
            }
        }
        if (k == 0) {
            System.out.println(prime + " is Prime ");
        } else {
            System.out.println(prime + " is Not a Prime ");
        }
    }


    public static void amstrong(int numberAmstrong) {
        int Temp = 0;
        numberAmstrong = Temp;
        int reverse = 0, remainder, amstrong = 0;
        while (numberAmstrong != 0) {

            //reversing a number logic is used
            remainder = numberAmstrong % 10;
            amstrong = amstrong + (numberAmstrong * numberAmstrong * numberAmstrong);
            numberAmstrong = numberAmstrong / 10;

        }
        if (amstrong == Temp) {
            System.out.println("Given number " + Temp + " is amstrong number");
        } else {
            System.out.println("Given number " + Temp + " is not a amstrong number");
        }


    }

    public static void main(String[]args) {


        Scanner get = new Scanner(System.in);
        System.out.print("Enter 1 for  checking  amstrong \nenter 2 for checking prime \nenter your choice = ");
        int choice = get.nextInt();


        if (choice == 1) {
            System.out.print("Enter number  to check if it is amstrong or not = ");
            int ams = get.nextInt();
            amstrong(ams);
        }

        else {
            System.out.print("Enter number  to check if it is prime or not = ");
            int pri = get.nextInt();
            checkprime(pri);

        }

    }
}
