# ITSC 1213 - Problem Solve 8 - Part 1

## **1. Understanding the `Student` Class**

### **Attributes**
- What attributes (fields) does the `Student` class have? Describe their purpose.  
  -  The class holds a student's name, their unique ID, and a list of courses they are enrolled in.

### **Methods**
- What does the `addCourse(String course)` method do? What does it return?  
  - This method adds a course to the student's list if not already there and returns the course name.
- How does the `removeCourse(String course)` method modify the student's state? What does it return?  
  - It modifies the student's course list by taking a specific course off of it and returns the removed course's name.
- What does the `getStudentInfo()` method return, and how is it used?  
  - It returns a single block of text with the student's name, ID, and courses, which is used for displaying their details.
- How does the `getStudentID()` method help in managing student records?  
  - This method provides the student's unique ID so the system can accurately find and manage a specific person.

### **General Understanding**
- How does the `Student` class keep track of courses a student is enrolled in?  
  - It keeps track of courses using an ArrayList, which is basically a flexible list that holds all the course names.
- What happens if a student tries to enroll in the same course twice?  
  - The program will prevent the duplicate course from being added to the student's list.

- What will happen if a student tries to remove a course they are not enrolled in?  
  - The program will simply do nothing and return the same output when option 6 (print info) is selected.

---

## **2. Understanding the `StudentManagement` Class**

### **Attributes**
- What attributes does the `StudentManagement` class have? How does it help manage multiple students?  
  - It has one attribute: private ArrayList<Student> students. This list holds multiple Student objects.

### **Methods**
- What does the `addStudent(Student student)` method do? What does it return?  
  - It adds a new Student object to the students list. 
- How does the `removeStudent(String studentID)` method work? What does it return?  
  - It searches the students list for a student matching the given studentID. If found, it removes the Student object from the list.
- What does the `searchStudent(String studentID)` method return if the student is found? What if they are not found?  
  - If a student with the matching studentID is found, it returns the Student object itself. If no match is found, it returns null.
- How does the `printAllStudents()` method display student information?  
  - It iterates through the students ArrayList. For each Student object in the list, it calls that object's getStudentInfo() method and prints the returned string to the console.

### **General Understanding**
- What happens when you try to add a student who already exists in the system?  
  - The addStudent method is designed to prevent duplicates based on the student ID
- What will happen if you try to remove a student who is not in the system?  
  - The removeStudent method will search for the student by ID, not find them, and return "-99" (to signal that the removal failed).

---

## **3. Comparing `Student` and `StudentManagement` Classes**

- List two similarities between the `Student` and `StudentManagement` classes.  
  - Both classes have methods to add and remove items from their respective lists and include logic to handle cases where an item already exists or is not found.
- Both classes use an ArrayList to manage items.

- List two differences between the `Student` and `StudentManagement` classes.  
  - Student represents simple attributes (name, ID). StudentManagement is a manager class.
  - The primary data managed by Student are strings (ex. courses), while the data managed by StudentManagement are more complex Student objects.


- Why is the `StudentManagement` class necessary instead of handling students directly in a list?  
  - It follows the principle of encapsulation. The StudentManagement class bundles data (ArrayList<Student>).,=



---

## **4. Understanding the `StudentManagementSimulation.java`**

-  A **while loop** is used to keep the program running. What condition controls when the loop stops?  
  - The loop itself is while (true), which would run forever. The loop is stopped by a break statement that executes only when the user's input is 6.

- Why is a while loop necessary for this type of program instead of just using sequential execution?  
  - A while loop is necessary to  repeatedly prompts the user for input, and show menu + options.
- How does the while loop allow the user to perform multiple operations without restarting the program?  
  - After one operation is completed (e.x adding a student), the code reaches the end of the loop block. It then prints the menu again and waits for the next user input, continuing this cycle until the exit condition is met.

- What would happen if the loop did not check for an exit condition?  
  - The program would be stuck in an infinite loop. 
- Could a `for` loop be used instead of a `while` loop in this program? Why or why not?  
  - For loops are better used when you know the number of iterations beforehand.