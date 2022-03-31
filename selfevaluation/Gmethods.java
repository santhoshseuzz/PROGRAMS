package selfevaluation;

import java.util.Random;
import java.util.Scanner;

public class Gmethods {
    Scanner get= new Scanner(System.in);
    Random random = new Random();
    int operand1 = random.nextInt(1, 10);
    int operand2 = random.nextInt(1, 10);
    int operand3 = random.nextInt(1, 10);
    int operand4 = random.nextInt(1, 10);
    char operator,operator2,operator3, operator4;

    void output(){
        sum = process();
        System.out.println("answer  :"+sum);
        choosing();
    }

    char charReturn(){
        int randomperator = random.nextInt(1, 4);
        switch (randomperator) {
            case 1:
                operator = '+';
                return operator;
            case 2:
                operator = '-';
                return operator;
            case 3:
                operator = '*';
                return operator;
            case 4:
                operator = '/';
                return operator;
        }
        return 0;
    }
    int sum ;
    int temp;
    char a;
    int  process(){
        System.out.println(operand1);
        System.out.println(operand2);
        System.out.println(operand3);
        System.out.println(operand4);
        sum = operand1;
        for(int i=1;i<4;i++) {
            switch (i) {
                case 1 -> temp = operand2;
                case 2 -> temp = operand3;
                case 3 -> temp = operand4;
            }
            int x = random.nextInt(2, 4);
            switch (x) {
                case 2:
                    String g = String.valueOf(sum);
                    String r = String.valueOf(temp);
                    String e = g.concat(r);
                    sum = Integer.parseInt(e);
                    System.out.println("append..." + sum);
                    break;
                case 3:
                    char opchar=charReturn();
                    System.out.println("printing character : "+opchar);
                    switch (opchar) {
                        case '+':
                            sum = sum + temp;
                            break;
                        case '-':
                            sum = sum - temp;
                            break;
                        case '*':
                            sum = sum * temp;
                            break;
                        case '/':
                            sum = sum / temp;
                            break;
                    }
                    break;
            }


        }
        return sum;
    }

    void choosing (){
        System.out.println("Here is your value...."+sum);
        System.out.println("Here are your operands.....");
        System.out.println(operand1);
        System.out.println(operand2);
        System.out.println(operand3);
        System.out.println(operand4);
        int answer= 0;
            for (int i = 1; i < 4; i++) {

                if (i == 1) {
                    System.out.println("Choose your operand.....");
                    int input1 = get.nextInt();
                    answer = input1;
                }
                System.out.println("enter 1 for append  and 2 for operator..");
                int step= get.nextInt();
                switch (step) {
                    case 1:
                        //append...
                        System.out.println("Choose your opernad for append....");
                        int input2 = get.nextInt();
                        String g = String.valueOf(answer);
                        String r = String.valueOf(input2);
                        String e = g.concat(r);
                        answer = Integer.parseInt(e);
                        break;
                    case 2:
                        System.out.println("Choose your opernad....");
                        input2 = get.nextInt();
                        System.out.println("Choose your operator.....+ , -  ,/    ,,,, *.");
                        char inputoperator = get.next().charAt(0);

                        switch (inputoperator) {
                            case '+':
                                answer = answer + input2;
                                break;
                            case '-':
                                answer = answer - input2;
                                break;
                            case '*':
                                answer = answer * input2;
                                break;
                            case '/':
                                answer = answer / input2;
                                break;

                        }
                }
                        System.out.println("now the answer is..."+answer);

                }
                System.out.println("can we check.... press any number...");
                int check = get.nextInt();
                if (sum == answer) {
                    System.out.println("you have won....");
                } else {

                    System.out.println("your answer " + answer + "better luck next time....");
                }
            }

    }

