package pattern;

public class ProtClass {
    public static void main(String[] args) {
        Protclass1 a = new Protclass1();
        int b = a.showprotected();
        System.out.println(b);

    }

}
class Protclass1{
    public int showprotected(){
     int n;
        n = 10;
        return (n);
    }
}