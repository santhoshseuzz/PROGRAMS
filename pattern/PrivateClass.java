package pattern;

public class PrivateClass {
    public static void main(String[] args) {
        Privateclass1  a = new Privateclass1();
        a.get();
        System.out.print("hi i am public");
    }
    private static class Privateclass1 {
        void get() {
            final int  ae = 10;
            System.out.println("hi i am private\n a = "+ae);
        }
    }



}
class Default{
    void addition(int  a, int b){
        System.out.println("Sum = "+(a+b));
    }

}
