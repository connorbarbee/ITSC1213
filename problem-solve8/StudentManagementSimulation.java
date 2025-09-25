/**
 * StudentManagementSimulation - a menu-driven program where the user can:
 * - Add a new student.
 * - Enroll a student in a course.
 * - Remove a student.
 * - Print details of all students.
 * - Exit the program.
 * * @author ITSC 1213
 * @version Feb 15, 2025
 */

import java.util.Scanner;

public class StudentManagementSimulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();

        while (true) {
            System.out.println("\n########################################################");
            System.out.println("########## Student Management System Simulation #########");
            System.out.println("Navigation Options: ");
            System.out.println("1. Add a new student");
            System.out.println("2. Enroll student in a course");
            System.out.println("3. Remove student");
            System.out.println("4. Remove a student from a course");
            // --- MENU UPDATED ---
            System.out.println("5. Update a student's name");
            System.out.println("6. Print all student details");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.println("You entered 1 to add a new student");
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter student ID: ");
                String studentID = scanner.nextLine();
                studentManagement.addStudent(new Student(name, studentID.toLowerCase()));
            }

            else if (choice == 2) {
                System.out.println("You entered 2 to enroll student in a course");
                System.out.print("Enter student ID: ");
                String studentID = scanner.nextLine();
                Student student = studentManagement.searchStudent(studentID.toLowerCase());
                if (student != null) {
                    System.out.print("Enter course name: ");
                    String course = scanner.nextLine();
                    student.addCourse(course.toLowerCase());
                } else {
                    System.out.println("Student not found.");
                }

            } else if (choice == 3) {
                System.out.println("You entered 3 to remove a student");
                System.out.print("Enter student ID to remove: ");
                String idToRemove = scanner.nextLine();
                studentManagement.removeStudent(idToRemove.toLowerCase());
            
            } else if (choice == 4) {
                System.out.println("You entered 4 to remove a student from a course");
                System.out.print("Enter student ID: ");
                String studentID = scanner.nextLine();
                Student student = studentManagement.searchStudent(studentID.toLowerCase());

                if (student != null) {
                    System.out.print("Enter course name: ");
                    String course = scanner.nextLine();
                    student.removeCourse(course.toLowerCase());
                } else {
                    System.out.println("Student not found.");
                }
            }

            // --- NEW FEATURE LOGIC ---
            else if (choice == 5) {
                System.out.println("You entered 5 to update a student's name");
                System.out.print("Enter student ID: ");
                String studentID = scanner.nextLine();
                Student student = studentManagement.searchStudent(studentID.toLowerCase()); // Find the student

                if (student != null) {
                    System.out.print("Enter the new name: ");
                    String newName = scanner.nextLine();
                    student.setName(newName); // Use the new setter method
                    System.out.println("Student's name updated successfully.");
                } else {
                    System.out.println("Student not found.");
                }
            }

            // --- CHOICE NUMBER ---
            else if (choice == 6) {
                studentManagement.printAllStudents();
            }
            
            // --- CHOICE NUMBER ---
            else if (choice == 7) {
                System.out.println("Exiting the program...");
                scanner.close();
                break;
            }
        
            else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
            
        } //end while
        
    }//end main
}// end class