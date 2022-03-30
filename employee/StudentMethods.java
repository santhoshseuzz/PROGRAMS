package employee;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentMethods {
    Scanner get = new Scanner(System.in);
    LinkedList<StudentData> empob = new LinkedList<>();
    public  void showSpecific() {
        System.out.print("Enter student id:");
        int studentId = get.nextInt();



        for(StudentData x : empob) {
            if(studentId== x.getId()){

            System.out.println("age :" + x.getId());
            System.out.println("Student name :"+x.getStudentName());
            System.out.println("Student Gender :"+x.getGender());
            System.out.println("Date :"+x.getJoinDate());
            }
        }

    }
    //showing data

    public void showData() {
        for(StudentData x : empob) {
            System.out.println("age :" + x.getId());
            System.out.println("Student name :"+x.getStudentName());
            System.out.println("Student Gender :"+x.getGender());
        }
    }

    //adding student name

    public void addData() {


        Scanner getinput = new Scanner(System.in);
        StudentData v = new StudentData();
        System.out.print("Enter the student Id : ");
        int id = getinput.nextInt();
        System.out.print("Enter the Student Name : ");
        String name = getinput.next();
        System.out.print("Enter the Gender : ");
        String gender = getinput.next();
        v.setId(id);
        v.setGender(gender);
        v.setStudentName(name);
        v.setJoinDate("01.feb.2022");
        empob.add(v);
    }

}
