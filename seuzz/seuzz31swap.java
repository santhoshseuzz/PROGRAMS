package seuzz;

import java.util.Scanner;

public class seuzz31swap {
    public static void main(String[]args){
        //getting input to swap
        Scanner get= new Scanner(System.in);
        System.out.print("Enter value of a = ");
        int a = get.nextInt();
        System.out.print("Enter value of b = ");
        int b = get.nextInt();
        int c ;
        System.out.println("Before swapping a = "+a+" and  b = "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping a = "+a+" and  b = "+b);


    }
}
