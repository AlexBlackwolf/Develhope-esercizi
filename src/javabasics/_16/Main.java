package javabasics._16;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        double celsius = 30;
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String weatherStatement = conversionDescription(celsius, fahrenheit);
        System.out.println(weatherStatement);
    }
        // Enter your function
        // End
        public static String conversionDescription(double celsius, double fahrenheit) {
            return celsius + " Celsius is " + fahrenheit + " Fahrenheit";
    }
    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            String processedName = processName(name);
            System.out.println(processedName);
        }
    }
            // Call your function
            public static String processName(String name) {
                String trimmedName = name.trim();
                boolean containsNumber = false;
                for (int i = 0; i < trimmedName.length(); i++) {
                    if (Character.isDigit(trimmedName.charAt(i))) {
                        containsNumber = true;
                        break;
                    }
                }
                if (containsNumber) {
                    return "Invalid";
                }
                    return trimmedName.toUpperCase();
    }

    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;

        // Call your function
        printVariables(myLunchPrice, lunchType, description, weightInGrams);
    }

    private static void printVariables(double myLunchPrice, String lunchType, String description, int weightInGrams) {
        System.out.println("myLunchPrice = " + myLunchPrice);
        System.out.println("lunchType = " + lunchType);
        System.out.println("description = " + description);
        System.out.println("weightInGrams = " + weightInGrams);
    }
}
