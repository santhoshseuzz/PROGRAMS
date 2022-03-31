package selfevaluation;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Gmethods obj = new Gmethods();
        //GameMethods obj = new GameMethods();
        while(true){
            Scanner get = new Scanner(System.in);
            int n = get.nextInt();
            switch (n) {
                case 1:
                    obj.output();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
            }

        }

    }
class GameMethods{
    int min = 0;
    int max = 9;
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
    int  process(){
        sum = operand1;
         for(int i=1;i<4;i++) {
                switch (i) {
                    case 1:
                        temp=operand2;
                        break;
                    case 2:
                        temp = operand3;
                        break;
                    case 3:
                        temp = operand4;
                        break;
                }
             char opchar=charReturn();
             System.out.println("printing character"+opchar);

             switch (opchar) {

                        case '+':
                            sum = sum +temp;
                            break;
                        case '-':
                            sum = sum - temp;
                            break;
                        case '*':
                            sum = sum * temp;
                            break;
                        case '/':
                            sum = sum/temp;
                            break;
                    }
             System.out.println("sum value:"+sum);
                }

        System.out.println(operand1);
        System.out.println(operand2);
        System.out.println(operand3);
        System.out.println(operand4);
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
        for(int i=1;i<4;i++) {

            if(i==1) {
                System.out.println("Choose your operand.....");
                int input1 = get.nextInt();
                answer = input1;
            }
            System.out.println("Choose your opernad....");
            int input2 = get.nextInt();
            System.out.println("Choose your operator......");
            char inputoperator = get.next().charAt(0);

            switch (inputoperator){
                case '+':
                    answer = answer + input2;
                    break;
                case '-':
                    answer = answer-input2;
                    break;
                case '*':
                    answer = answer*input2;
                    break;
                case '/':
                    answer = answer/input2;
                    break;

            }

        }
             System.out.println("can we check.... press any number...");
        int check = get.nextInt();
        if( sum == answer){
            System.out.println("you have won....");
        }
        else {

        System.out.println("your answer "+answer+"better luck next time....");

    }

    }
}