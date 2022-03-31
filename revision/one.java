package revision;

abstract  class abs {
    abstract void print();
}
class Two extends abs{

    @Override
    void print() {
        System.out.println("two.......");
    }
}
public class one {
    public static void main(String[] args) {
        Two a = new Two();
        a.print();

    }
}