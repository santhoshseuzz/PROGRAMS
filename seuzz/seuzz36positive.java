package seuzz;

import java.util.Scanner;

public class seuzz36positive {
    public static void main(String[]args) {


        //getting input for positive and negative number
        Scanner get = new Scanner(System.in);
        System.out.print("Enter value of a = ");
        int a = get.nextInt();


        // conditional statement
        if (a == 0) {
            System.out.println(a + " is zero");
        } else if (a > 0) {
            System.out.println(a + " is positive");
        } else {
            System.out.println(a + " is Negative");
        }
    }
}
