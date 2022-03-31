package revision;


public class Mthread  {
    public static void main(String[] args) {
        M1thread a = new M1thread();
        a.start();
        a.interrupt();
        System.out.println("main method");
        for (int i = 0; i < 100; i++) {
            System.out.println("thread first......................................................................");
        }
    }


}
class M1thread extends Thread {
    public void run(){
        for (int i=0;i<50;i++) {
            try {
                Thread.sleep( 3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("********************************************************************************");
        }
    }
}


