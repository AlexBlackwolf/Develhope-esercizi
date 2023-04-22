package javainproduction._1;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        double value = Math.random() * 100;
        System.out.println(value >= 50 ? "x is greater than or equal to 50" : "x is less than 50");
    }

    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        // Create a Person object
        Person person = new Person("Will Smith", 30, "123 Main St");
        // Print the Person object using the toString method
        System.out.println(person.toString());
    }

    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        // Create a BigInteger variable with a large value
        BigInteger bigInteger = new BigInteger("9999999999999999999999");

        // Create a BigDecimal variable with a large value
        BigDecimal bigDecimal = new BigDecimal("9999999999.123456789");

        // Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
        BigInteger bigIntegerResult = bigInteger.divide(BigInteger.valueOf(3));

        // Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
        BigDecimal bigDecimalResult = bigDecimal.divide(BigDecimal.valueOf(Math.PI), BigDecimal.ROUND_HALF_UP);

        // Print the results
        System.out.println("BigInteger divided by 3: " + bigIntegerResult);
        System.out.println("BigDecimal divided by PI: " + bigDecimalResult);
    }
}

