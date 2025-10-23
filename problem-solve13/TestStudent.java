public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("s1 -> " + s1);
        Student s2 = new Student("Alan", "Turing", 24, "S123456", "Computer Science", 3.9);
        System.out.println("s2 -> " + s2);
        s1.setFirstName("Katherine");
        s1.setLastName("Johnson");
        s1.setAge(21);
        s1.setStudentId("S000001");
        s1.setMajor("Mathematics");
        s1.setGpa(3.6);
        System.out.println("s1 full name: " + s1.getFullName());
        System.out.println("s1 describe(): " + s1.describe());
        System.out.println("Is " + s1.getFullName() + " on honor roll? " + s1.isOnHonorRoll());
        System.out.println("Is " + s2.getFullName() + " on honor roll? " + s2.isOnHonorRoll());
    }
}