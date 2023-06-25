import java.util.ArrayList;
import java.util.List;

public class StudentService {
    // private final Student student;
    private final ArrayList<Student> studentArrayList;

    public StudentService() {
        // student = new Student();
        studentArrayList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentArrayList.add(student);

    }

    public List<Student> getStudentArrayList() {
        return studentArrayList;
    }

    public void deleteStudent(String studentId) {
        for (Student student : studentArrayList) {
            if (student.getDetails().getStudentID().equals(studentId)) {
                studentArrayList.remove(student);
            }

        }

    }

    public void updateStudent(Student Newstudent) {
        for (Student student : studentArrayList) {
            if (student.getDetails().getStudentID().equals(Newstudent.getDetails().getStudentID())) {
                student.getDetails().setStudentName(Newstudent.getDetails().getStudentName());
                student.getDetails().setStudentID(Newstudent.getDetails().getStudentID());
                student.getDetails().setStudentEmail(Newstudent.getDetails().getStudentEmail());
                student.getDetails().setStudentAddress(Newstudent.getDetails().getStudentAddress());

                student.getMarker().setChemistryMark(Newstudent.getMarker().getChemistryMark());
                student.getMarker().setPhysicsMark(Newstudent.getMarker().getPhysicsMark());
                student.getMarker().setMathematicsMark(Newstudent.getMarker().getMathematicsMark());
                student.getMarker().setEnglishMark(Newstudent.getMarker().getEnglishMark());
            }

        }
    }

}
