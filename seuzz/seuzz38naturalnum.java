package seuzz;

import java.util.Scanner;

public class seuzz38naturalnum {
    public static  void main (String args[]) {
        //  getting a natural numbers natural numbers are  positive number from 1 to infinty
        Scanner get = new Scanner(System.in);
        System.out.print("enter the number = ");
        int naturalNumber = get.nextInt();
        int sum = 0;
        //looping statement for adding natural numbers
        for (int i = 1; i <= naturalNumber; i++) {
            sum = sum + i;
        }
        System.out.println("sum of natural  numbers = " + sum);
    }

}
