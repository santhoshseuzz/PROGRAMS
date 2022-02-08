package seuzz;

import java.util.Scanner;

public class seuzz56sumprime {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter a input: ");
        int input = get.nextInt();
        boolean temp = false;
        for (int i = 2; i <= input / 2; ++i) {

            if (sum_of_primes(i)) {

                if (sum_of_primes(input - i)) {

                    System.out.println(i+" + "+(input - i)+" = "+input);
                    temp = true;
                }

            }
        }

        if (!temp)
            System.out.println(input + " cannot be expressed as the sum of two prime numbers.");
    }

    //function to check if given number is prime or not
    static boolean sum_of_primes(int x) {
        boolean isPrime = true;

        for (int i = 2; i <= x / 2; ++i) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}

