package interview;

import employee.StudentData;

import java.util.LinkedList;
import java.util.Queue;

class DemoData{
    private String studentName;
    private int Studentage;

    public String getStudentName() {
        return studentName;
    }

    public int getStudentage() {
        return Studentage;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentage(int studentage) {
        Studentage = studentage;
    }
}

public class DemoInterview {
    public static void main(String[] args) {
        Queue<DemoData> studentadd = new LinkedList<>();
        Queue<DemoData> studentadd1 = new LinkedList<>();

        DemoData obj = new DemoData();
        String a = "seuzz";
        int age = 12;
        obj.setStudentName(a);
        obj.setStudentage(age);
        studentadd.add(obj);
        DemoData obj1 = new DemoData();
        String aa= "ssereuzz";
        int agea = 212;
        obj1.setStudentName( aa);
        obj1.setStudentage(agea);
        studentadd.add(obj1);
        for(DemoData x: studentadd) {
            System.out.println("age :" + x.getStudentage());
            System.out.println("Student name :"+x.getStudentName());
        }
        if(studentadd.size()!=1){
           Object head = studentadd.remove();
           studentadd1.add((DemoData) head);
        }

        for(DemoData x: studentadd1) {
            System.out.println("new queue");
            System.out.println("age :" + x.getStudentage());
            System.out.println("Student name :"+x.getStudentName());
        }
        for(DemoData x: studentadd) {
            System.out.println("After pop");
            System.out.println("age :" + x.getStudentage());
            System.out.println("Student name :"+x.getStudentName());
        }



    }
}
