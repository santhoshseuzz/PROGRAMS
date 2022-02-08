package seuzz;
import java.util.*;

public class seuzz66 {
    public static void main(String[] args) {

        //getting inputs
        System.out.print("Enter the number = ");
        Scanner get= new Scanner(System.in);
        int a=get.nextInt() ;
        if(a==1) {
            pattern1(5);
        }
        else if(a == 2){
            pattern2(5);
        }
        else if (a==3){
             pattern3(5);
        }

    }

    private static void pattern3(int n) {
        for(int row=1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void pattern2(int n) {
        for(int row=1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    private static void pattern1(int n) {
        for(int row=1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }



}