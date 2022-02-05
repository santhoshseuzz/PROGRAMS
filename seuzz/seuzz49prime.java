package seuzz;

import java.util.Scanner;

public class seuzz49prime {
    public static void main(String[]args){



        //getting a number
        System.out.print("Enter the Integer Value  = ");
        Scanner get = new Scanner(System.in);
        int inputInt1 = get.nextInt();
        int count =0;


        //limit set because  a half numbers of a number divide a number
        int limit = inputInt1 / 2;
        for (int i = 2; i <= limit ; i++){
            if((inputInt1 % i) == 0){
                count++;
                System.out.println("count ="+count);
                // limit is assinged i to exit the loop
                i = limit ;
            }
        }
        if (count>0){
            System.out.println(inputInt1+" is  a not prime number");
        }
        else{
            System.out.println(inputInt1+" is  a prime number");
        }


    }
}
