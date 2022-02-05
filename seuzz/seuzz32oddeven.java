package seuzz;

import javax.swing.*;
import java.util.Scanner;

public class seuzz32oddeven {
    public static void main(String[]args) {

        //getting input for odd /even
        Scanner get = new Scanner(System.in);
        System.out.print("Enter value of a = ");
        int a = get.nextInt();


        // conditional statement
        if (a % 2 == 0) {
            System.out.println(a + " is even number");
        } else {
            System.out.println(a + " is odd number");
        }
    }
}
