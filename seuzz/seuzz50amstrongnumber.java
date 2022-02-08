package seuzz;

import java.util.Scanner;

public class seuzz50amstrongnumber {
    public static void main(String[]args) {
        // getting inputs
        // amstrong number 153 = = 1*1*1 + 5*5*5 + 3*3*3
        Scanner get= new Scanner(System.in);
        System.out.print("Enter value  for checking if it is a amstrong or not = ");
        int numberAmstrong = get.nextInt();

        //seuzz
        int  Temp = 0;
        numberAmstrong = Temp ;
        int reverse = 0,remainder,amstrong =0 ;
        while(numberAmstrong !=0){

            //reversing a number logic is used
            remainder = numberAmstrong % 10;
            amstrong = amstrong + (numberAmstrong * numberAmstrong * numberAmstrong) ;
            numberAmstrong  = numberAmstrong / 10;

        }
        if (amstrong == Temp){
            System.out.println("Given number "+Temp + " is amstrong number");
        }
        else {
            System.out.println("Given number "+Temp+ " is not a amstrong number");
        }

    }
}
