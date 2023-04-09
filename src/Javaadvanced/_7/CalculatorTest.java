package javaadvanced._7;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Calculator calculator = new Calculator(); // create an instance of Calculator

        Assertions.assertEquals(9, calculator.add(6, 3));

        Assertions.assertEquals(-5, calculator.add(-2, -3));

        Assertions.assertEquals(0, calculator.add(0, 0));


        Assertions.assertEquals(2, calculator.subtract(5, 3));

        Assertions.assertEquals(-2, calculator.subtract(-5, -3));

        Assertions.assertEquals(0, calculator.subtract(0, 0));
    }

    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Calculator calculator = new Calculator();

        Assertions.assertEquals(6, calculator.multiply(2, 3));

        Assertions.assertEquals(-6, calculator.multiply(-2, 3));

        Assertions.assertEquals(0, calculator.multiply(0, 5));

        Assertions.assertEquals(2, calculator.divide(6, 3));

        Assertions.assertEquals(-3, calculator.divide(9, -3));

        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Calculator calculator = new Calculator();

        Assertions.assertEquals(1.0, calculator.power(4.5, 0));
        Assertions.assertEquals(-2, calculator.power(-2, 1));
        Assertions.assertEquals(4, calculator.power(-0.5, -2));
        Assertions.assertEquals(0, calculator.power(0, 5));

    }
}