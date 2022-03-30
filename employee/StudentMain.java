package employee;


import java.util.Scanner;


public class StudentMain {

    public static void main(String[] args) throws Exception{
        StudentMethods emp= new StudentMethods();
        Scanner get = new Scanner(System.in);
       while(true) {

           System.out.println("Enter 1 addData\nenter 2 showData\nenter 3 Showspecific\nenter 4 for exit");
           int a = get.nextInt();
           switch (a) {
               case 1:
                   emp.addData();
                   break;
               case 2:
                   emp.showData();
                   break;
               case 3:try {
                   emp.showSpecific();
               }
               catch (Exception e){
                   System.out.println("Student not found");
               }
               finally {
                   System.out.println("Student not found");
                   break;
               }
               case 4:
                   System.exit(0);
               default:
                   System.out.println("invalid Entry");
           }
       }


    }


}


