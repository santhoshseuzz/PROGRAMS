package seuzz;

import java.util.Scanner;

public class seuzz37alphanot {public static void main(String[]args){
    System.out.print("enter the character = ");
    Scanner ch = new Scanner(System.in) ;
    char alpha=ch.next().charAt(0) ;

    //using character class
    if (Character.isAlphabetic(alpha) ){
        System.out.println(alpha+" is  a character");
    }
    else{
        System.out.println(alpha+" is  not a character");
    }

    }
}
