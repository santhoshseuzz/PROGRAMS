package seuzz;

import java.util.Scanner;

public class seuzz39factorial {
    public static  void main (String args[])
    {
        Scanner get = new Scanner(System.in);
        System.out.println("enter the number") ;
        int  a = get.nextInt();
        int  factorial = 1;
        for(int i =1 ;i<=a; i++){
            factorial = factorial * i;
        }
        System.out.println("factorial of "+a+" is "+factorial );

    }
}
