package revision;

public class ExeCalssA{

    final void sum(int a, int b)
    {
        int s = a + b;
        System.out.println("Sum of two numbers: " +s);
    }

    void sum(int a, int b,int  c)
    {
        int s = a + b+ c;
        System.out.println("Sum of three numbers: " +s);
    }


    void sum(double a, int b)
    {
        double s = a + b;
        System.out.println("Sum of two float numbers: " +s);
    }

    public static void main(String[] args) {
        ExeCalssA a = new ExeCalssA();
        a.sum(2.3,4);
        a.sum(2,4);
        a.sum(2,4,5);

    }
}
