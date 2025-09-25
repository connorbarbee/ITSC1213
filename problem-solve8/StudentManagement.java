/**
 * Manages a list of students, allowing addition, removal, and searching of students.
 * * @author ITSC 1213
 * @version Feb 15, 2025
 */

import java.util.ArrayList;

public class StudentManagement {

    private ArrayList<Student> students;

    /**
     * Constructs a new StudentManagement system with an empty list of students.
     */
    public StudentManagement() {
        students = new ArrayList<>();
    }

    /**
     * Adds a new student to the student list if they are not already present.
     * Returns the student ID if added successfully, otherwise returns "-99".
     *
     * @param student The student object to add.
     * @return The student ID if successfully added, otherwise "-99".
     */
    public String addStudent(Student student) {
        // First, check if a student with this ID already exists.
        if (searchStudent(student.getStudentID()) != null) {
            // If they exist, return "-99" to prevent duplicates.
            return "-99";
        } else {
            // If not, add the new student and return their ID.
            students.add(student);
            return student.getStudentID();
        }
    }

    /**
     * Removes a student from the list based on their student ID.
     * Returns the student ID if removed successfully, otherwise returns "-99".
     *
     * @param studentID The unique ID of the student to remove.
     * @return The student ID if successfully removed, otherwise "-99".
     */
    public String removeStudent(String studentID) {
        // Find the student object that matches the given ID.
        Student studentToRemove = searchStudent(studentID);
        
        if (studentToRemove != null) {
            // If a student was found, remove them and return their ID.
            students.remove(studentToRemove);
            return studentID;
        } else {
            // If no student was found, return "-99".
            return "-99";
        }
    }

    /**
     * Searches for a student in the list by their student ID.
     *
     * @param studentID The ID of the student to search for.
     * @return The student object if found, otherwise null.
     */
    public Student searchStudent(String studentID) {
        // Loop through every student in the list.
        for (Student student : students) {
            // If a student's ID matches, return that student object.
            if (student.getStudentID().equals(studentID)) {
                return student;
            }
        }
        // If the loop finishes, no student was found, so return null.
        return null;
    }

    /**
     * Prints the details of all students in the system.
     * If no students are found, it prints an appropriate message.
     */
    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student.getStudentInfo());
                System.out.println("-----------------------------");
            }
        }
    }
}
