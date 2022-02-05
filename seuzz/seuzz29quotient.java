package seuzz;

import java.util.Scanner;

public class seuzz29quotient {
        public static void main(String [] args) {
            //quotient and remainder for a number
            System.out.print("enter the value of a = ");
            Scanner QR = new Scanner(System.in);
            int a = QR.nextInt();
            //quotient
            for (int i = 1; i <= 10; i++) {
                int qr = a / i;
                System.out.println("QUOTIENT "+a + "/" + i + "=" + qr);
                int qrr=a%i;
                System.out.println("REMAINDER "+a+ "%" + i + "=" + qrr);

            }
        }
}
