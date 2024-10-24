import java.util.Scanner;

// Superclass
class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Method {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an animal (1 for Dog, 2 for Cat): ");
        int choice = scanner.nextInt();

        Animal animal;

        if (choice == 1) {
            animal = new Dog();
        } else if (choice == 2) {
            animal = new Cat();
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        animal.makeSound();

        scanner.close();
    }
}