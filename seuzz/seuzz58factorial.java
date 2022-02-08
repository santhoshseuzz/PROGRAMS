package seuzz;

import java.util.Scanner;

public class seuzz58factorial {
    // recursion function
    public static int factorial (int a){
        if(a<=1)
        {
            return a;
        }
        else{
            return a*factorial(a-1);
        }
    }
    public static void main(String[]args){
        //getting limit for factorial
        Scanner get = new Scanner(System.in);
        System.out.print("Enter value of a = ");
        int input = get.nextInt();
        int output = factorial(input);
        System.out.print("sum value = "+output );
    }
}
