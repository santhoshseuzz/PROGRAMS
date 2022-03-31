package revision;
class SuperClass
{
    void msg(int x, int y)
    {
        System.out.println("Hello Java");
    }
}
class Subclass extends SuperClass
{
    void msg(double x, double y)
    {
        System.out.println("Welcome you in Java programming "+(x+y));
    }
}
public class Test {
    public static void main(String[] args)
    {
        Subclass sc = new Subclass();
        sc.msg(10, 20);
        sc.msg(2.5, 3);
    }
}
