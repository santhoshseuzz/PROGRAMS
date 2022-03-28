package crudoperations;

import java.util.Scanner;

public class EmployeeMain {
        Scanner get = new Scanner(System.in);
        public void employeeManagement() {
            EmployeeDbMethods dbObject = new EmployeeDbMethods();
            System.out.println("hi Welcome");
            //  Dobject.getConnection();
            while (true) {
                System.out.println("1. Add a new Employee \n2.Update a Employee\n3.Delete A Employee" +
                        "\n4. show a particular employee \n5. Show all Employee 0.exit");
                int run = get.nextInt();
                switch (run) {
                    case 1:
                        dbObject.addNewEmployee();
                        break;
                    case 2:
                        dbObject.updateOldEmployee();
                        break;
                    case 3:
                        dbObject.deleteOldEmployee();
                        break;
                    case 4:
                        dbObject.showSpecifi();
                        break;
                    case 5:
                        dbObject.showALL();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                }

            }

        }
}
