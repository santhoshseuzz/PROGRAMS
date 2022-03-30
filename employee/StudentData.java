package employee;

public class StudentData{
    private int id;
    private String studentName,gender;
    private String joinDate;



    //setter


    public void setId ( int a){
        this.id= a;
    }

    public void setGender (String gen){
        this.gender= gen;
    }

    public void setJoinDate (String jdate){
        this.joinDate=jdate;
    }

    public void setStudentName (String stuName){
        this.studentName = stuName;
    }


    //getter
    public String getStudentName(){
        return studentName;
    }
    public String getGender(){
        return gender;
    }
    public  int getId(){
        return id;
    }
    public String getJoinDate() {
        return joinDate;
    }


    //pojo class finished
}
