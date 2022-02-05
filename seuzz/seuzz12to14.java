package seuzz;

import java.util.Scanner;

public class seuzz12to14 {
    public static void main(String[]args){



        //area of square
        Scanner get = new Scanner(System.in);
        System.out.print("Enter sides of square = ");
        int sides = get.nextInt();
        System.out.println("the  area of Square is = "+(sides*sides));

        //area of rectangle
        System.out.print("Enter lenght = ");
        int length= get.nextInt();
        System.out.print("Enter breath = ");
        int breath = get.nextInt();
        System.out.println("the  area of Rectangle is = "+(length*breath));

        //area of cylinder
        System.out.print("Enter Radius = ");
        float radius;
        radius = get.nextInt();
        System.out.print("Enter height= ");
        float height;
        height = get.nextInt();
        float surfaceArea = (2*22*(radius+height))/7;
        System.out.println("arae of circle = "+surfaceArea);

    }

}
