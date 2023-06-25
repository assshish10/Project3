import java.util.ArrayList;
import java.util.Scanner;

public class StudentView {
    private final StudentService studentService;

    private final Scanner scanner;

    public StudentView() {
        studentService = new StudentService();

        scanner = new Scanner(System.in);
    }

    public void home() {
        int choice;

        do {
            mainChoice();
            System.out.println("Enter the option");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudentArrayList();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 0:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } while (choice != 0);
    }

    private void updateStudent() {
        Student student = SDetails();
        studentService.updateStudent(student);
        System.out.println("Student Updated");

    }

    private void deleteStudent() {
        System.out.println("Enter the Student ID ");
        String studentId = scanner.nextLine();

        studentService.deleteStudent(studentId);
        System.out.println("Student Deleted");
    }

    private void viewStudentArrayList() {
        var studentList = studentService.getStudentArrayList();
        for (var student : studentList) {
            System.out.println(student.getDetails());
            System.out.println(student.getMarker());
            System.out.println();
        }
    }

    private void addStudent() {
        Student student = SDetails();
        studentService.addStudent(student);
        System.out.println("Student Added");

    }

    private Student SDetails() {
        System.out.println("    Enter Student Details   ");
        System.out.print("Enter the Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter the Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter the Student Email: ");
        String studentEmail = scanner.nextLine();
        System.out.print("Enter the Student Address: ");
        String studentAddress = scanner.nextLine();

        System.out.println("    Enter the Student Marks ");
        System.out.println("Enter the Student Mark in Mathematics: ");
        double Mathematics = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the Student Mark in Physics: ");
        double Physics = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the Student Mark in Chemistry: ");
        double Chemistry = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the Student Mark in English: ");
        double English = Double.parseDouble(scanner.nextLine());

        StudentDetails studentDetails = new StudentDetails(studentId, studentName, studentEmail, studentAddress);
        StudentMark studentMark = new StudentMark(studentId, Mathematics, Physics, Chemistry, English);
        Student student = new Student(studentDetails, studentMark);
        return student;
    }

    private void mainChoice() {

        System.out.println("Student Management System");
        System.out.println("1. Add Student");
        System.out.println("2. List Students");
        System.out.println("3. Delete Student");
        System.out.println("4. Update Student");
        System.out.println("0. Exit");

    }

}
