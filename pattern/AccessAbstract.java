package pattern;
public class AccessAbstract {
    public static void main(String[] args) {


        Auto a = new Auto();
        a.getwheel();
        Car b = new Car();
        b.getwheel();
    }
    
}
abstract  class Wheels {
    abstract void getwheel();


}
class Auto extends Wheels {

    void  getwheel() {
        System.out.println("10 wheels");
    }
}
class Car extends Wheels {
    @Override
    void getwheel() {
        System.out.println("20 wheels");
    }
}