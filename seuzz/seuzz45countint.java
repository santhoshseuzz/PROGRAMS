package seuzz;

import java.util.Scanner;

public class seuzz45countint {
    public static void main (String[]args){
        System.out.print("Enter the Integer Value = ");
        Scanner get=new Scanner(System.in);
        int count = 0;
        int inputInt = get.nextInt();
         while(inputInt != 0){
             inputInt /= 10;
             ++count;

         }
         System.out.print("\nnumber of digits = "+count);
    }
}
