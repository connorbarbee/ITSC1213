public class Student extends Person {
    private String studentId;
    private String major;
    private double gpa;

    public Student() {
        this("Unknown", "Unknown", 0, "N/A", "Undeclared", 0.0);
    }

    public Student(String firstName, String lastName, int age, String studentId, String major, double gpa) {
        super(firstName, lastName, age);
        this.studentId = studentId;
        this.major = major;
        setGpa(gpa);
    }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
    public double getGpa() { return gpa; }
    public void setGpa(double gpa) {
        if (gpa < 0.0 || gpa > 4.0) throw new IllegalArgumentException("GPA must be in [0.0,4.0]");
        this.gpa = gpa;
    }
    public boolean isOnHonorRoll() { return gpa >= 3.5; }

    @Override
    public String describe() {
        // Build a student-specific description instead of reusing Person's label
        StringBuilder sb = new StringBuilder();
        sb.append("Student[");
        sb.append("name=").append(getFullName()).append(", ");
        sb.append("age=").append(getAge()).append(", ");
        sb.append("id=").append(studentId).append(", ");
        sb.append("major=").append(major).append(", ");
        sb.append("gpa=").append(gpa);
        if (isOnHonorRoll()) {
            sb.append(" (Honor Roll)");
        }
        sb.append("]");
        return sb.toString();
    }
    @Override public String toString() { return describe(); }
}