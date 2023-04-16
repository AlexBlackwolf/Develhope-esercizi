package JavaadvancedOOP._3;

public class Exercises {

    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    /**
     * 1:
     *
     *
     * Create a class called "Person" with fields for name, age, and address.
     *
     * Override the `toString()` method in the Person class to display the object's name, age, and address in a user-friendly format.
     *
     * Create instances of the Person class and print them using the overridden `toString()` method.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Person person1 = new Person("Alex", 30, "123 Via X");
        Person person2 = new Person("Paolo", 25, "321 Via Y");

        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }


    /**
     * 2:
     *
     *
     * Override the `hashCode()` method in the Person class to generate a unique hash code based on the object's name, age, and address.
     *
     * You can achieve this by using String.hashCode() to convert strings to ints and adding the fields together
     *
     * Create 2 people and print out their hashcodes
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person person1 = new Person("Alex", 30, "123 Via X");
        Person person2 = new Person("Paolo", 25, "321 Via Y");

        System.out.println("Person 1 hash code: " + person1.hashCode());
        System.out.println("Person 2 hash code: " + person2.hashCode());

        //Hashcode
    }

    /**
     * 3:
     *
     * BONUS: Read about the nuances of hashcodes here:
     *
     * https://www.baeldung.com/java-hashcode
     *
     * Don't necessarily expect to understand it all right away, it can get quite complicated
     *
     */
}
