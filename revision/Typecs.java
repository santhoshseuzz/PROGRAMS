package revision;

public class Typecs {
    void m1(long a) {
        System.out.println("int closes find");

    }

    void m1(float a) {
        System.out.println("int is not found");
    }

    public static void main(String[] args) {
        Typecs a = new Typecs();
        a.m1(20);
        a.m1(2.0f);
    }
}
