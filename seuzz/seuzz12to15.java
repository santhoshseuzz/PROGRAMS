package seuzz;

import java.util.Scanner;

public class seuzz12to15 {
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

        //area between two concentric circle
        System.out.print("Enter Radius  for 0uter circle= ");
        float radius1;
        radius1 = get.nextInt();
        System.out.print("Enter radius for  inner cicrlce= ");
        float radius2;
        radius2 = get.nextInt();
        float surfaceArea1 = (22*(radius1*radius1 ))/7;
        float surfaceArea2 = (22*(radius2*radius2))/7;
        float spaceArea=surfaceArea1 - surfaceArea2 ;
        System.out.println("area of circle = "+spaceArea);

    }

}
