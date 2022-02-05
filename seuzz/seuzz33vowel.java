package seuzz;

import java.util.Scanner;

public class seuzz33vowel {
    public static void main(String[]args){
        System.out.print("enter the character = ");
        Scanner ch = new Scanner(System.in) ;
        char alphabet=ch.next().charAt(0) ;
        switch (alphabet){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("The given character is vowel");
                break;
            default :
                System.out.println("The given character is consonant");
        }




    }
}
