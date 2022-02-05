package seuzz;

import java.util.Scanner;

public class seuzz41fibonaci {
    public static void main(String []args){
        //Getting Range for fibonanci series.
        Scanner get = new Scanner(System.in);
        System.out.print("enter the range = ");
        int range = get.nextInt();
        int firstNum = 0,secondNum = 1 ;

        //looping statement for printing series
        for(int i = 0 ; i<range ; i++){
            System.out.println(firstNum);

            //swapping and adding
            int swap = firstNum + secondNum ;
            firstNum = secondNum ;
            secondNum = swap ;

        }
    }
}
