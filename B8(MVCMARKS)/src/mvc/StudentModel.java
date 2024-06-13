package mvc;

public class StudentModel {
    private String rollNo;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;
    
    public StudentModel(String rollNo, String name, int mark1, int mark2, int mark3){
        this.rollNo = rollNo;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    public String getRollNo(){
        return rollNo;
    }
    
    public String getName(){
        return name;
    }
    
    public int getMark1(){
        return mark1;
    }
    
    public int getMark2(){
        return mark2;
    }
    
    public int getMark3(){
        return mark3;
    }
    public double calculatePercentage(){
        return (mark1 + mark2 + mark3)/3.0;
    }
    public String getGrade(){
        double percentage = calculatePercentage();
        if(percentage > 90){
            return "A";
        }else if(percentage >80){
            return "B";
        }else if(percentage > 70){
            return "C";
        }else if(percentage >60){
            return "D";
        }else{
            return "E";
        }
        
    }
    
}