package seuzz;

import java.util.Scanner;

public class seuzz59gcdcrec {
    public static int gcd (int a,int b){
        if(a%b==0)
        {
            return b ;
        }
        else{
            return gcd(b,a%b);
        }
    }
    public static void main(String[]args){
        //getting limit for factorial
        Scanner get = new Scanner(System.in);
        System.out.print("Enter value of a = ");
        int input1 = get.nextInt();
        System.out.print("Enter value of b = ");
        int input2 = get.nextInt();
        int output = gcd(input1,input2);
        System.out.println("GCD VALUE  = "+output );
    }
}
