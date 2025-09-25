/**
 * Represents a student with a name, student ID, and a list of enrolled courses.
 * @author ITSC 1213
 * @version Feb 15, 2025
*/

import java.util.ArrayList;

public class Student {
    private String name;
    private String studentID;
    private ArrayList<String> courses;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    // For StudentManagementTest.java
    public String getName() {
        return name;
    }

    public String addCourse(String course) {
        if (courses.contains(course)) {
            return "-99";
        } else {
            courses.add(course);
            return course;
        }
    }

    public String removeCourse(String course) {
        boolean success = courses.remove(course);
        if (success) {
            return course;
        } else {
            return "-99";
        }
    }

    public String getStudentInfo() {
        return "Student Name: " + name + "\nStudent ID: " + studentID + "\nCourses: " + courses;
    }

    public String getStudentID() {
        return studentID;
    }

    // --- NEW METHOD ---
    /**
     * Updates the student's name.
     * @param newName The new name for the student.
     */
    public void setName(String newName) {
        this.name = newName;
    }
}