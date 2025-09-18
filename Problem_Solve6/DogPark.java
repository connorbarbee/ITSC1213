import java.util.Scanner;

public class DogPark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog[] dogs = new Dog[2];

        // Get input for the first dog
        System.out.println("Enter details for the first dog:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Breed: ");
        String breed1 = scanner.nextLine();
        dogs[0] = new Dog(name1, breed1);

        // Get input for the second dog
        System.out.println("\nEnter details for the second dog:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Breed: ");
        String breed2 = scanner.nextLine();
        dogs[1] = new Dog(name2, breed2);

        // Make the first dog play with the second dog
        System.out.println("\nLet's make them play!");
        dogs[0].play(dogs[1]);

        scanner.close();
    }
}