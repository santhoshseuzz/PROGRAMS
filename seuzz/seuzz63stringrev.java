package seuzz;

import java.util.Scanner;

public class seuzz63stringrev {
    public static  String recursiveString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        } else {
            return recursiveString(str.substring(1)) + str.charAt(0);
        }

    }

    public static void main(String[] args) {


        //getting a String for recursion to reverse it
        System.out.println("Enter the string");
        Scanner get = new Scanner(System.in);
        String str = get.nextLine();
        String str1 = recursiveString(str);
        System.out.println("Reverse ="+str1 );
    }
}
