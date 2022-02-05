package seuzz;

import java.util.Scanner;

public class seuzz34bignum {
    public static void main(String[]args) {

        //getting input for finding biggest number
        Scanner get = new Scanner(System.in);
        System.out.print("Enter value of a = ");
        int a = get.nextInt();
        System.out.print("Enter value of b = ");
        int b = get.nextInt();
        System.out.print("Enter value of c = ");
        int c = get.nextInt();



        // conditional statement
        if (a > b && a > c) {
            System.out.println(a + " is Largest");
        }

        else if (b > a && b > c) {
            System.out.println(b + " is Largest");
        }

        else if (c > a && c > b) {
            System.out.println(b + " is Largest");
        }

        else {
            System.out.println("ALL are is same");
        }
        }
            
}
