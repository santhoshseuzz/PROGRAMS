package revision;

public class MultiThreadA {
    public static void main(String[] args) {
        Exe1 o = new Exe1();
        o.start();
    }

}
class Exe1 extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("hi....");
    }
}