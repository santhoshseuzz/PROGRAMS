package seuzz;

public class seuzz7and8 {
    public static void main(String []args){
        //7 chracter to integer
        char character='7';
        int intNumber= (int)character ;
        System.out.println("value="+intNumber );
        // it is a type casting error and throw a garbage value

        int intnum = 8;
        char character1 = (char)intnum ;
        System.out.println("value="+character1 );
        // it is a type casting error and throw a garbage value or null

    }
}
