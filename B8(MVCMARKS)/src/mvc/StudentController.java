package mvc;

public class StudentController {
    private StudentModel student;
    
    public StudentController(StudentModel student) {
        this.student = student;
    }
    
    public String getStudentDetails(){
        StringBuilder details = new StringBuilder();
        details.append("Student Roll No : ").append(student.getRollNo()).append("\n");
        details.append("Student Name : ").append(student.getName()).append("\n");
        details.append("Marks in Subject 1 : ").append(student.getMark1()).append("\n");
        details.append("Marks in Subject 2 : ").append(student.getMark2()).append("\n");
        details.append("Marks in Subject 3 : ").append(student.getMark3()).append("\n");
        details.append("Percentage : ").append(String.format("%.2f", student.calculatePercentage())).append("%\n");
        details.append("Grade : ").append(student.getGrade()).append("\n");
        return details.toString();
    }
}