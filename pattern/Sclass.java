package pattern;

import java.util.Random;

public class Sclass {

    public static void main(String[] args) {
        Random random = new Random();
        int a = 10;
        String x = String.valueOf(a) ;
        String r ="20";
        String c = x.concat(r);
        int m = Integer.parseInt(c);
for(int i=0;i<5;i++) {
    int gt = random.nextInt(5, 7);
    System.out.println(gt);
}


    }
}
