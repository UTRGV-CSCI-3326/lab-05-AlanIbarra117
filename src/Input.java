import java.util.Scanner; 

public class Input {

    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get and store the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Get and store the user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Get and store the user's weight
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        // Get and store if the user is a smoker
        System.out.print("Are you a smoker? (true/false): ");
        boolean isSmoker = scanner.nextBoolean();

        // Close the scanner to prevent resource leaks
        scanner.close();

        // Output all collected information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("Weight: %.2f kg%n", weight); 
        System.out.println("Smoker: " + isSmoker);
    }
}
