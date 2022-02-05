package seuzz;

import java.util.Scanner;

public class seuzz42gcd  {
    public static  void main(String[]args){
        //Getting n1 and n2
        Scanner get = new Scanner(System.in);
        System.out.print("enter the number 1 = ");
        int gcdNumber = 0;
        int number1 = get.nextInt();
        System.out.print("enter the number 2= ");
        int number2 = get.nextInt();

        //gcd calculation

        for(int i = 1; i <= number1 && i <= number2 ; i++){
            if(number1 % i == 0 && number2 % i == 0)
                gcdNumber   = i;
            }
            System.out.println("GCD of "+number1+" and "+number2+" is "+gcdNumber);
        }

    }