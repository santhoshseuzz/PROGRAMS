package seuzz;

public class seuzz5byte {
    public static void main(String []args){
        //assigning short in byte

        short shortNumber = 150;
        byte  byteNumber = (byte)shortNumber ;

        System.out.println("value = "+byteNumber );
        //garbage value cause byte is smaller than short..
    }
}
