package crudoperations;

public class EmployeeInfo {
    private int empId;
    private String empName;
    private String empDesignation;
    private String empGender;
    private int empSalary;


    public void copy(EmployeeInfo e){
        this.setEmpId(e.getEmpId());
        this.setEmpSalary(e.getEmpSalary());
        this.setEmpGender(e.getEmpGender());
        this.setEmpName(e.getEmpName());
        this.setEmpDesignation(e.getEmpDesignation());
    }

    public int getEmpId() {return empId;}

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public String getEmpGender() {
        return empGender;
    }

    public void setEmpGender(String empGender) {
        this.empGender = empGender;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }
}
