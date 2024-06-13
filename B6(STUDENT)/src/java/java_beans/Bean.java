package java_beans;

public class Bean implements java.io.Serializable{
    private String regNo;
    private String firstName;
    private String lastName;
    private String course;
    private int sem;
    public String getRegNo(){
        return regNo;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getCourse(){
        return course;
    } 
    public int getSem(){
        return sem;
    } 
    public void setRegNo(String newRegNo){
        this.regNo = newRegNo;
    }
     public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }
     public void setLastName(String newLastName){
        this.lastName = newLastName;
    } 
     public void setCourse(String newCourse){
        this.course = newCourse;
    } 
     public void setSem(int newSem){
        this.sem = newSem;
    } 
}