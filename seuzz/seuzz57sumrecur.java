package seuzz;

import java.util.Scanner;

public class seuzz57sumrecur {

    public static int sumofnumbers (int a){
        if(a<=1)
        {
            return a;
        }
        else{
            return a +sumofnumbers(a-1);
        }
    }
    public static void main(String[]args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter value of a = ");
        int input = get.nextInt();
        int output = sumofnumbers(input);
        System.out.print("sum value = "+output );
    }
}
