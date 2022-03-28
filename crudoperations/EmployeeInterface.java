package crudoperations;

public interface EmployeeInterface {
    //Database connection
    public static final String url = "jdbc:mysql://localhost:3306/employeestab";
    public static final String user = "root";
    public static final String pass = "seuzz";
    public static final String driverC = "com.mysql.cj.jdbc.Driver";
    static final String INSERT_QUERY = "insert into dummydata values(?,?,?,?,?);";
    static final String UPDATE_QUERY = "update dummydata set empname = ? ,empgender =?,empdesig =? ,empsalary = ? where id = ?;";
    static final String DELETE_QUERY = "delete from dummydata where id = ?;";
    static final String FIND_EMPLOYEE= "select * from dummydata where id= ? ;";
    static final String SELECT_ALL = "select * from dummydata;";

}
