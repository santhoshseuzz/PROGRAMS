package seuzz;

import java.util.Scanner;

public class seuzz47power {
    public static void main(String[]args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter value of base= ");
        int input1 = get.nextInt();
        System.out.print("Enter value of power  = ");
        int input2 = get.nextInt();
        int result = 1;

        while(input2!=0){
            result = result*input1;
            input2--;

        }
        System.out .println("power = "+result) ;

    }
}
