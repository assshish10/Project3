public class StudentDetails {

    private String StudentID;
    private String StudentName;
    private String StudentEmail;
    private String StudentAddress;

    public StudentDetails() {
    }

    public StudentDetails(String studentID, String studentName, String studentEmail, String studentAddress) {
        StudentID = studentID;
        StudentName = studentName;
        StudentEmail = studentEmail;
        StudentAddress = studentAddress;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "StudentDetails [StudentID=" + StudentID + ", StudentName=" + StudentName + ", StudentEmail="
                + StudentEmail + ", StudentAddress=" + StudentAddress + "]";
    }

}