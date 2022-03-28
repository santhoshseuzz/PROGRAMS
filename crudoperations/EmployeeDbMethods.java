package crudoperations;
import java.util.Scanner;

public class EmployeeDbMethods {

    Scanner get = new Scanner(System.in);
    EmployeeInfo dataObj = new EmployeeInfo();
    EmployeeDatabase dbObject = new EmployeeDatabase();

    void addNewEmployee(){
        System.out.print("Enter Employee Id             :");
        int id = get.nextInt();
        dataObj.setEmpId(id);
        System.out.print("Enter your  Employee Name     :");
        String empName = get.next();
        dataObj.setEmpName(empName);
        System.out.print("Enter the Gender              :");
        String empGender = get.next();
        dataObj.setEmpGender(empGender);
        System.out.print("Enter the Designation         :");
        String empDesignation = get.next();
        dataObj.setEmpDesignation(empDesignation);
        System.out.print("Enter the Employee Salary     :");
        int sal = get.nextInt();
        dataObj.setEmpSalary(sal);
//      Creating object

        dbObject.insertEmployee(dataObj);
    }
    void updateOldEmployee(){
        System.out.print("Enter ");
        System.out.print("Enter the Id  you want to update:");
        int id = get.nextInt();
        dataObj.setEmpId(id);
        System.out.print("Enter your  Employee Name     :");
        String empName = get.next();
        dataObj.setEmpName(empName);
        System.out.print("Enter the Gender              :");
        String empGender = get.next();
        dataObj.setEmpGender(empGender);
        System.out.print("Enter the Designation         :");
        String empDesignation = get.next();
        dataObj.setEmpDesignation(empDesignation);
        System.out.print("Enter the Employee Salary     :");
        int sal = get.nextInt();
        dataObj.setEmpSalary(sal);
        dbObject.updateEmployee(dataObj);
    }
    void deleteOldEmployee(){
        System.out.print("Enter the employee Id you want to delete:");
        int id = get.nextInt();
        dataObj.setEmpId(id);
        dbObject.deleteEmployee(dataObj);
    }

    void showSpecifi(){
        System.out.print("Enter the employee Id you want to view:");
        int id = get.nextInt();
        dataObj.setEmpId(id);
        dbObject.showSpecificEmployee(dataObj);
    }

    void showALL(){
       dbObject.showEmployee();
    }

}

