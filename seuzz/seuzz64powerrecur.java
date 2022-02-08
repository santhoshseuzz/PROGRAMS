package seuzz;

import java.util.Scanner;

public class seuzz64powerrecur {

    // recursion function
    public static int power (int a,int b){
        if(b==0)
        {
            return 1;
        }
        else{
            return a*power(a,b -1);
        }
    }
    public static void main(String[]args){
        //getting limit for factorial
        Scanner get = new Scanner(System.in);
        System.out.print("Enter value of base= ");
        int input1 = get.nextInt();
        System.out.print("Enter value of exponent  = ");
        int input2 = get.nextInt();
        int output = power(input1 ,input2);
        System.out.println(input1+"^"+input2+" = "+output );
    }

}
