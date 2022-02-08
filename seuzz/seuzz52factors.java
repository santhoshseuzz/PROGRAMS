package seuzz;

import java.util.Scanner;

public class seuzz52factors {
    public static void main(String[]args){
        //getting number to check factors

        Scanner get = new Scanner(System.in);

        System.out.print("Enter value  for checking Factors of that value =  ");
        int forFactor = get.nextInt();
        int count = 0;
        System.out.println("Factors of "+forFactor+"  is ");
        for(int i = 2; i< forFactor ; i++){
            if (forFactor % i == 0)
            {
             System.out.println(i);
             count++;
            }
        }
        if (count == 0){
            System.out.println("Sry no Factors of "+forFactor);
        }

    }
}
