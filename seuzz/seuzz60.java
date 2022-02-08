package seuzz;

import java.util.Scanner;

public class seuzz60 {

    public static void main(String[] args) {
        System.out.print(" 1 for decimal to binary \n2 for binary to decimal\nEnter your choice =  ");
        Scanner get = new Scanner(System.in);
        int choice = get.nextInt();
        if (choice == 1) {
            deci();
        }
        else{
            binary() ;
        }
    }


    public  static void deci() {

        System.out.print("Enter a decimal number = ");

        Scanner get1 = new Scanner(System.in);
        int decimal = get1.nextInt();
        long binary = 0;
        int remainder, i = 1, line = 1;
        while (decimal != 0) {
            remainder = decimal % 2;
            System.out .print(remainder+"  ");
            decimal = decimal / 2;


        }
    }

    public static void binary(){

        System.out.print("Enter a binary number = ");

        Scanner get = new Scanner(System.in);
        long binary1 = get.nextInt();
        int decimal = 0, i = 0;
        long remainder;
        while(binary1 !=0){
            remainder = binary1%10;
            binary1 /=10;
            decimal += binary1 * Math.pow(2,i);
            ++i;


        }
        System.out.println("decimal = "+decimal );


    }
}
