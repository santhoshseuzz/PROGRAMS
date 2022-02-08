package seuzz;

public class seuzz20to25 {
    public static void main(String[]args){

       //prefix post fix
        int i= 10;
        //prefix ++a =  print 11, now a= 11  first increases and print
        System.out.println("\n20evaluation\n"+(++i));

        //postfix a++ =  first print 11 and incresase 1
        System.out.println(i++);


        int a = 12;
        int b= 6;
        //21 evaluation

        // 6-5 =1
        int evaluation1= ++a - b--;
        System.out.println("\n21evaluation\n++ a - b -- ="+evaluation1 );
        System.out.println("b = "+b);

        //b =
        int evaluation2 = a%b++;
        System.out.println("a%b++ = "+evaluation2 );

        System.out.println("a*=b+5 "+(a*=b+5));

        int x = 69>>>2;
        System.out.println("x = "+x);


        //22 evaluation

        a = 28;
        a+=a++ + ++a + --a + a--;
        System.out.println("\n22evaluation\na+=a++ + ++a + --a + a--;"+a);


        //23
        x=10;
        x = x++ * 2 + 3 * -x;
        System.out.println("\n23evaluation\nx++ * 2 + 3 * -x= "+x);

        //24
        int y = 10;
        int z =(++y * (y++ + 15));
        System.out.println("\n24evaluation\n(++y * (y+++15)) = "+z);

        //25
        x= 5;
        int x1= ++x - x++ + --x;
        System.out.println("\n25evaluation\n++x - x++ + -x = "+x1);

    }
}
