package selfevaluation;

import java.util.Scanner;

public class FibonaciAndPrime {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int limit = get.nextInt();
        int i = 0;
        int swap = 0;
        int a = -1, b = 1;

        for (i = 0; i <= limit; i++) {
            swap = a + b;
            pro(swap);
            a = b;
            b = swap;

        }


    }

    static public void pro(int swap) {
        int count = 0;
        int limit = swap / 2;
        for (int i = 2; i <= limit; i++) {
            if ((swap % i) == 0) {
                count++;
                // limit is assinged i to exit the loop
                i = limit;
            }
        }
        if (count == 0) {
            System.out.println(swap);
        }
    }
}
