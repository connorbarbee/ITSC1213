public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println("p1 -> " + p1);
        Person p2 = new Person("Ada", "Lovelace", 36);
        System.out.println("p2 -> " + p2);
        p1.setFirstName("Grace");
        p1.setLastName("Hopper");
        p1.setAge(85);
        System.out.println("p1 full name: " + p1.getFullName());
        System.out.println("p1 describe(): " + p1.describe());
    }
}