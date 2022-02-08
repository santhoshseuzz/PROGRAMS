package seuzz;

import java.util.Scanner;

public class seuzz61 {
    public static void main(String[]args){
        System.out.print(" 1 for decimal to octal \n2 for binary to decimal\nEnter your choice =  ");
        Scanner get = new Scanner(System.in);
        int choice = get.nextInt();
        if (choice == 1) {
            int octal=0, i=1, remainder;

            //getting the decimal number
            System.out.println("Enter a Decimal Number");
            int decimal =get.nextInt();

            //loping
            while(decimal>0){
                remainder = decimal%8;
                octal +=  i*remainder;
                decimal = decimal/8;
                i=i*10;
            }

            //output the Result
            System.out.println("Octal: "+octal);
        }
        else{
            int i=0, decimal=0, digit;

            //get an Octal Number
            System.out.println("Enter a Octal Number");
            int octal = get.nextInt();

            while(octal>0){
                digit = octal%10;

                //multiply with exponential of 8
                decimal += Math.pow(8,i++)* digit;


                octal = octal/10;
            }

            //output the octal number
            System.out.println("Decimal: "+decimal);
        }
    }
}
