package seuzz;

import java.util.Scanner;

public class seuzz75pattern {
    public static void main(String[]args){
    System.out.print("Enter the number = ");
    Scanner get= new Scanner(System.in);
    int a=get.nextInt() ;
        if(a==1) {
        pattern1(7);
    }
        else if(a == 2){
        pattern2(7);
    }
        else if (a==3){
       pattern3(7);

    }
        else if (a==4){
            pattern4(9);

        }
        else if (a==5){
            pattern5(9);

        }
        else if(a==6){
            pattern6(9);
        }
}

    private static void pattern6(int n) {


        for(int row=1;row<=n+1;row++){
            for(int space=1;space<=row-1;space++){
                System.out.print(" ");
            }

            for (int col=1;col<=n-row+1;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {

        for(int row=1;row<=n+1;row++){
            for(int space=1;space<=row-1;space++){
                System.out.print(" ");
            }

            for (int col=1;col<=n-row+1;col++) {
                    System.out.print(n+1-row+" ");


            }



            System.out.println();
        }
    }

    private static void pattern4(int n) {
        for(int row=1;row<=n;row++){
            int i = 1;
            for(int space=1;space<=n-row;space++){
                System.out.print("  ");
            }

            for (int col=1;col<=2*row-1;col++) {
                if (col < row) {
                    System.out.print(i++ + " ");
                } else {
                    System.out.print(i-- + " ");
                }
            }


            System.out.println();
        }

    }

    private static void pattern3(int n) {
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print("# ");
            }
            for (int col=1;col<=row;col++){
                System.out.print(" "+row+" ");
            }


            System.out.println();
        }
    }

    private static void pattern2(int n) {

        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print("  ");
            }
            for (int col=1;col<=row;col++){
                System.out.print(" * ");
            }


            System.out.println();
        }
    }

    private static void pattern1(int n) {
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print("# ");
            }
            for (int col=1;col<=row;col++){
                System.out.print(" "+row+" ");
            }


            System.out.println();
        }

        }
    }
