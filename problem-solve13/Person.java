public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        this("Unknown", "Unknown", 0);
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.age       = age;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public int getAge() { return age; }
    public void setAge(int age) { if (age < 0) throw new IllegalArgumentException("Age cannot be negative"); this.age = age; }
    public String getFullName() { return firstName + " " + lastName; }
    public String describe() { return "Person[name=" + getFullName() + ", age=" + age + "]"; }
    @Override public String toString() { return describe(); }
}