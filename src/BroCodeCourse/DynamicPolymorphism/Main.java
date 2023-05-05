package BroCodeCourse.DynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("what animal do you want?");
        System.out.println("(1 for Wolf) or (2 for cat)");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Wolf();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println("invalid choice");
            animal.speak();
        }
    }
}
