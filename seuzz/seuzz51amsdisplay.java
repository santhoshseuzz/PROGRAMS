package seuzz;

import java.util.Scanner;

public class seuzz51amsdisplay {
    public static void main(String[]args){
        //getting inputs
        // amstrong number 153 = = 1*1*1 + 5*5*5 + 3*3*3
        Scanner get= new Scanner(System.in);
        int numberAmstrong,t ;

        int remainder=0;
        for(int i=100 ;i<= 125;i++){
            numberAmstrong = i;
            System.out.println("number+"+numberAmstrong);
            t= numberAmstrong;
            int amstrong = 0;
        while(numberAmstrong !=0) {

            //reversing a number logic is used
            remainder = numberAmstrong % 10;
            amstrong = amstrong + (numberAmstrong * numberAmstrong * numberAmstrong);
            numberAmstrong = numberAmstrong / 10;
        }
        if(amstrong == t) {
            System.out.println("hi  "+amstrong);
        }
            System.out.println("new  == "+amstrong);

        remainder = 0;
        }

        }
    }

