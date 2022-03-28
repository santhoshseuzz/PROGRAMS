package crudoperations;
import com.mysql.cj.x.protobuf.MysqlxExpr;
import employee.StudentData;

import java.sql.*;
import java.lang.Object;
import java.util.LinkedList;

public class EmployeeDatabase implements EmployeeInterface{
    // Database connection
    private Connection connection = null;
    private PreparedStatement preparedQuery = null;
    private ResultSet resultSet = null;

    //Database Query
   public EmployeeDatabase () {
        try {
            connection = DriverManager.getConnection(EmployeeInterface.url, EmployeeInterface.user, EmployeeInterface.pass);
        } catch (SQLException e) {
            System.out.println("1.unable to establish connection with DB");
            e.printStackTrace();
        }
    }

    void insertEmployee(Object dataObj ){
        //getConnection();
        EmployeeInfo dataObj1 = new EmployeeInfo();
        //copying of objects.......
        dataObj1.copy((EmployeeInfo) dataObj);
        int check = 0;
        try {
            preparedQuery = connection.prepareStatement(EmployeeInterface.INSERT_QUERY);
            preparedQuery.setInt(1,dataObj1.getEmpId());
            preparedQuery.setString(2,dataObj1.getEmpName());
            preparedQuery.setString(3, dataObj1.getEmpGender());
            preparedQuery.setString(4, dataObj1.getEmpDesignation());
            preparedQuery.setInt(5, dataObj1.getEmpSalary());
            check = preparedQuery.executeUpdate();
            if (check > 0) {
                System.out.println("Record Added successfully.........");
            }
        } catch (Exception e1) {
            System.out.println("Insert command Failed");
            e1.printStackTrace();
        } finally {
            try {
                preparedQuery.close();
            } catch (SQLException ex) {
                System.out.println("connection not closed in insert Section....");
                ex.printStackTrace();
            }
        }
    }
    void updateEmployee(Object dataObj){
        //getConnection();
        EmployeeInfo dataObj1 = new EmployeeInfo();
        //copying of objects.......
        dataObj1.copy((EmployeeInfo) dataObj);
            int check = 0;
            try {
                preparedQuery = connection.prepareStatement(UPDATE_QUERY);
                preparedQuery.setInt(5, dataObj1.getEmpId());
                preparedQuery.setString(1, dataObj1.getEmpName());
                preparedQuery.setString(2, dataObj1.getEmpGender());
                preparedQuery.setString(3, dataObj1.getEmpDesignation());
                preparedQuery.setInt(4, dataObj1.getEmpSalary());
                check = preparedQuery.executeUpdate();
            } catch (SQLException ex) {
                System.out.println("upDate failed........");
                ex.printStackTrace();
            } finally {
                try {
                    preparedQuery.close();
                } catch (SQLException ex) {
                    System.out.println("connection not closed in .......update.......... section....");
                    ex.printStackTrace();
                }
            }
            if (check > 0) {
                System.out.println("Record is updated......");
            }

    }
    void deleteEmployee(Object dataObj){
        //getConnection();
        EmployeeInfo dataObj1 = new EmployeeInfo();
        //copying of objects.......
        dataObj1.copy((EmployeeInfo) dataObj);
        int check = 0;
        try {
            preparedQuery = connection.prepareStatement(DELETE_QUERY);
            preparedQuery.setInt(1, dataObj1.getEmpId());
            check = preparedQuery.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Delete command Failed.....");
            e.printStackTrace();
        } finally {
            try {
                preparedQuery.close();
            } catch (SQLException ex) {
                System.out.println("connection not closed in delete section....");
                ex.printStackTrace();
            }
        }
    }
    LinkedList<EmployeeInfo>  dbList = new LinkedList<>();
    void showEmployee(){
        //getConnection();
        try {
            EmployeeInfo allData = null;
            preparedQuery = connection.prepareStatement(SELECT_ALL);
            //preparedQuery.setInt(1, dataObj1.getEmpId());
            resultSet = preparedQuery.executeQuery();
            while (resultSet.next()) {
                allData = new EmployeeInfo();
                allData.setEmpId(resultSet.getInt("id"));
                allData.setEmpName(resultSet.getString("empname"));
                allData.setEmpGender(resultSet.getString("empgender"));
                allData.setEmpDesignation(resultSet.getString("empdesig"));
                allData.setEmpSalary(resultSet.getInt("empsalary"));
                dbList.add(allData);
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        showData(dbList);
    }
    EmployeeInfo temp = new EmployeeInfo();
     void  showSpecificEmployee(Object dataObj){
         //getConnection();
         EmployeeInfo dataObj1 = new EmployeeInfo();
         //copying of objects.......
         dataObj1.copy((EmployeeInfo) dataObj);
        try {
           preparedQuery = connection.prepareStatement(FIND_EMPLOYEE);
           preparedQuery.setInt(1, dataObj1.getEmpId());
           resultSet = preparedQuery.executeQuery();

           if (!resultSet.next()) {
                System.out.println("Employee not found");
           }

            temp.setEmpName(resultSet.getString("empname"));
            temp.setEmpGender(resultSet.getString("empgender"));
            temp.setEmpDesignation(resultSet.getString("empdesig"));
            temp.setEmpSalary(resultSet.getInt("empsalary"));
            showspecialData(temp);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
     }

     void showspecialData(Object ter){
        //  System.out.println("EmployeeID           :" + temp.getEmpId());
         System.out.println("Employee    Name     :" + temp.getEmpName());
         System.out.println("Employee  Gender     :" + temp.getEmpGender());
         System.out.println("Employee Designation :" + temp.getEmpDesignation());
         System.out.println("Employee Salary      :"+temp.getEmpSalary());
         System.out.println("\n\n");
     }

    public void showData(LinkedList<EmployeeInfo> dbList) {
        for (EmployeeInfo x : dbList) {
            System.out.println("EmployeeID           :" + x.getEmpId());
            System.out.println("Employee    Name     :" + x.getEmpName());
            System.out.println("Employee  Gender     :" + x.getEmpGender());
            System.out.println("Employee Designation :" + x.getEmpDesignation());
            System.out.println("Employee Salary      :"+x.getEmpSalary());
            System.out.println("\n\n");

        }
    }

}
