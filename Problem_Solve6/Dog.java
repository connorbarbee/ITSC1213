public class Dog {

    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void play(Dog otherDog) {
        System.out.println(this.name + " is playing with " + otherDog.name + "!");
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}