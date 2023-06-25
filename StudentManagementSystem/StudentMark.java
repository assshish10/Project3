public class StudentMark {

    private String StudentID;
    private double EnglishMark;
    private double PhysicsMark;
    private double ChemistryMark;
    private double MathematicsMark;

    public StudentMark() {
    }

    public StudentMark(String StudentID, double EnglishMark, double PhysicsMark, double ChemistryMark,
            double MathematicsMark) {

        this.StudentID = StudentID;
        this.EnglishMark = EnglishMark;
        this.PhysicsMark = PhysicsMark;
        this.ChemistryMark = ChemistryMark;
        this.MathematicsMark = MathematicsMark;

    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public double getEnglishMark() {
        return EnglishMark;
    }

    public void setEnglishMark(double englishMark) {
        EnglishMark = englishMark;
    }

    public double getPhysicsMark() {
        return PhysicsMark;
    }

    public void setPhysicsMark(double physicsMark) {
        PhysicsMark = physicsMark;
    }

    public double getChemistryMark() {
        return ChemistryMark;
    }

    public void setChemistryMark(double chemistryMark) {
        ChemistryMark = chemistryMark;
    }

    public double getMathematicsMark() {
        return MathematicsMark;
    }

    public void setMathematicsMark(double mathematicsMark) {
        MathematicsMark = mathematicsMark;
    }

    @Override
    public String toString() {
        return "StudentMark [StudentID=" + StudentID + ", EnglishMark=" + EnglishMark + ", PhysicsMark=" + PhysicsMark
                + ", ChemistryMark=" + ChemistryMark + ", MathematicsMark=" + MathematicsMark + "]";
    }

}
