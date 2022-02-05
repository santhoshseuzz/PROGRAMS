package seuzz;

import java.util.Scanner;

public class seuzz40multipication {
    public static void main(String[]args) {
        //Getting table number and range
        Scanner get = new Scanner(System.in);
        System.out.print("enter the table  number = ");
        int tableNumber = get.nextInt();
        System.out.print("enter the range = ");
        int range = get.nextInt();
        int factorial = 1;

        //looping statements for multipication table
        for (int i = 1; i <= range; i++) {
            System.out.println(tableNumber + " * " + i + " = " + (tableNumber * i));
        }
    }
}
