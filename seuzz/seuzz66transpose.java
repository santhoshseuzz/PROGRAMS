package seuzz;

import java.util.Scanner;

public class seuzz66transpose {
    public static void main(String[] args) {
        int row1, col1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in matrix:");
        row1 = s.nextInt();
        System.out.print("Enter number of columns in  matrix:");
        col1 = s.nextInt();
        int a[][] = new int[row1][col1];
        int b [][] = new int[10][10];
        System.out.println("Enter values for matrix A : \n");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++)
                a[i][j] = s.nextInt();
        }
        System.out.println("Before transpose = ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("After transpose = ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                b[i][j] = a[i][j];
            }
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(b[j][i] + " ");
            }
            System.out.println();

        }
    }

} 