package seuzz;

import java.util.Scanner;

public class seuzz53calculator  {
    public static void main(String[]args){
        //getting the choice for calcultor
        Scanner get=new Scanner(System.in);

        char choice;
        int operand1, operand2;
        do{
            System.out.println("SIMPLE CALCULATOR");
            System.out.println("ENTER THE OPERATION YOU WANT TO DO:");
            System.out.println(" + FOR ADDITION \n- FOR SUBRACTION \n" +
                    "* FOR MULTIPICATION \n/ FOR DIVISION  \n% FOR REMAINDER \nQ FOR QUIT");
            System.out.print("YOU WANT TO DO: = ");

            choice = get.next().charAt(0);
            switch (choice) {


                case '+':
                    System.out.println("-----WELCOME TO ADDITION-----");
                    System.out.println("ENTER THE OPERANDS");
                    System.out.print("OPERAND 1  = ");
                    operand1 = get.nextInt();
                    System.out.print("OPERAND 2 = ");
                    operand2 = get.nextInt();
                    System.out.println(operand1 + " " + choice + " " + operand2 + " = " + (operand1 + operand2));
                    break;

                case '-':
                    System.out.println("-----WELCOME TO SUBRACTION-----");
                    System.out.println("ENTER THE OPERANDS");
                    System.out.print("OPERAND 1  = ");
                    operand1 = get.nextInt();
                    System.out.print("OPERAND 2 = ");
                    operand2 = get.nextInt();
                    System.out.println(operand1 + " " + choice + " " + operand2 + " = " + (operand1 - operand2));
                    break;


                case '*':
                    System.out.println("-----WELCOME TO MULTIPICATION----");
                    System.out.println("ENTER THE OPERANDS");
                    System.out.print("OPERAND 1  = ");
                    operand1 = get.nextInt();
                    System.out.print("OPERAND 2 = ");
                    operand2 = get.nextInt();
                    System.out.println(operand1 + " " + choice + " " + operand2 + " = " + (operand1 * operand2));
                    break;

                case '/':
                    System.out.println("-----WELCOME TO DIVISION---");
                    System.out.println("ENTER THE OPERANDS");
                    System.out.print("OPERAND 1  = ");
                    operand1 = get.nextInt();
                    System.out.print("OPERAND 2 = ");
                    operand2 = get.nextInt();
                    System.out.println(operand1 + " " + choice + " " + operand2 + " = " + (operand1 / operand2));
                    break;

                case '%':
                    System.out.println("-----WELCOME TO MODULO----");
                    System.out.println("ENTER THE OPERANDS");
                    System.out.print("OPERAND 1  = ");
                    operand1 = get.nextInt();
                    System.out.print("OPERAND 2 = ");
                    operand2 = get.nextInt();
                    System.out.println(operand1 + " " + choice + " " + operand2 + " = " + (operand1 % operand2));
                    break;

                case 'Q':
                    break;

                default:
                    System.out.println("ENTER THE VALID OPERATION\n\n\n");
            }
            System.out.print("-----WANT  TO QUIT OR CONTINUE-----\npress Any Key for continue or  presss  Q for quit");
            choice = get.next().charAt(0);



        }while(choice!='Q');



        }
    }
