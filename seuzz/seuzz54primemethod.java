package seuzz;

import java.util.Scanner;

public class seuzz54primemethod {
    public static void checkPrime(int x){
        int limit,k=0;
        for (limit = 2; limit <= x/2; limit++){
            if((x % limit) == 0){
                k=1;
            }
        }
        if(k==0){
            System.out.println(x+" ");
        }
    }

    public static void main(String[]args){


        //getting a number
        System.out.println("Enter the two intervals to check in between prime numbers");
        Scanner get = new Scanner(System.in);
        System.out.print("Enter first interval : ");
        int startValue = get.nextInt();
        System.out.print("Enter Second interval : ");
        int endValue = get.nextInt();
        for(int i = startValue ; i <= endValue ;i++){
            checkPrime(i) ;
        }

    }
}
