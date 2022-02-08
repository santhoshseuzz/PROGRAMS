package seuzz;

public class seuzz18ternary {
    public static void main(String[] args) {
        //variable = Expression1?expression2:expression3
        int a = 10;
        int b = 15;
        boolean res;
        // return true if a is greater or false
        res = (a > b) ? true : false;
        if (res == true) {
            System.out.println(" greate value is a");
        } else {
            System.out.println(" greate value is b");
        }
    }
}
