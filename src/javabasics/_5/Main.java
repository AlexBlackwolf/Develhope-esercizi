package javabasics._5;

public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }

    /*
            Remember the symbols you need to do maths are

            Plus = +
            Minus = -
            Multiply or times = *
            Divide = /
     */

    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int num = 6;
        num = num + 1;
        System.out.println("After adding 1, the value of num is: " + num);
        num = num - 1;
        System.out.println("After subtracting 1, the value of num is: " + num);
    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        double num1 = 6;
        num1 = num1 * 2;
        System.out.println("After multiplying by 2, the value of num1 is: " + num1);

        double num2 = num1 / 2;
        System.out.println("After dividing by 2, the value of num2 is: " + num2);
    }

    /**
     * 3: We are going to convert the temperature from celsius to fahrenheit
     * <p>
     * Create a double variable called celsius
     * <p>
     * Create a new variable called fahrenheit
     * <p>
     * The variable fahrenheit should be set as
     * celsius times by 1.8 plus 32
     * <p>
     * Print out celsius and fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        double celsius = 22.5;
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("The temperature in Celsius is: " + celsius);
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4:");
        // Write your code here
        int age = 10;
        age++;
        age++;
        age++;
        age++;
        age++;
        System.out.println("The final age is: " + age);
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("\nExercise 5:");
        // Write your code here
        int age = 50;
        age -= 50;
        System.out.println("Age is now: " + age);

        int secondAge = 50;
        secondAge = secondAge - 10;
        secondAge = secondAge - 20;
        secondAge = secondAge - 20;
        System.out.println("Second age is now: " + secondAge);
    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 5;   // <--- change this value
        int modulus = 4; // <--- and this value to see the results of modulus

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);
    }

}
