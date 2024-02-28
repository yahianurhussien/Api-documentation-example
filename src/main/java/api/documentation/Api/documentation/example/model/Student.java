package api.documentation.Api.documentation.example.model;

public class Student {
    private int StudentId;
    private String studentName;

    public Student() {
    }

    public Student(int studentId, String studentName) {
        this.StudentId = studentId;
        this.studentName = studentName;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
