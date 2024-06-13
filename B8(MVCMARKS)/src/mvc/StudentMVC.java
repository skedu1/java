package mvc;
import java.util.Scanner;

public class StudentMVC {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Roll Number : ");
        String rollNo = scanner.nextLine();
        
        System.out.print("Enter name : ");
        String name = scanner.nextLine();
        
        System.out.print("Enter marks for Subject 1 : ");
        int mark1 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 2 : ");
        int mark2 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 3 : ");
        int mark3 = scanner.nextInt();
        
        scanner.close();
        
        StudentModel student = new StudentModel(rollNo, name, mark1, mark2, mark3);
        StudentController controller = new StudentController(student);
        StudentView view = new StudentView();
        view.displayStudentDetails(controller.getStudentDetails());
    }
    
}