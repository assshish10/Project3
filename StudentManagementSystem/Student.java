public class Student {
    private final StudentDetails details;
    private final StudentMark marker;

    public Student() {
        details = new StudentDetails();
        marker = new StudentMark();
    }

    public Student(StudentDetails details, StudentMark marker) {
        // details = new StudentDetails();
        // marker = new StudentMark();
        this.details = details;
        this.marker = marker;
    }

    public StudentDetails getDetails() {
        return details;
    }

    public StudentMark getMarker() {
        return marker;
    }

}
