package javaadvanced._6;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     * <p>
     * <p>
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * <p>
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {

        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days days : Days.values()) {
            System.out.println(days);
        }
    }

    /**
     * 2:
     * <p>
     * <p>
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * <p>
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private static void exercise2() {

        System.out.println("\nExercise 2: ");
        // Your code here
        Seasons season = Seasons.SUMMER;
        System.out.println("The months in " + season + " are " + Arrays.toString(season.getMonths()));
    }

    /**
     * 3:
     * <p>
     * <p>
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * <p>
     * Write code that simulate the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        System.out.println("\nExercise 3: ");
        TrafficLight currentLight = TrafficLight.GREEN;
        System.out.println("Current light: " + currentLight);
        TrafficLight nextLight = currentLight.next();
        System.out.println("Next light: " + nextLight);
    }

    /**
     * 4:
     * <p>
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * <p>
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {

        System.out.println("\nExercise 4: ");
        // Your code here
        for (Days day : Days.values()) {
            if (day.isWeekend()) {
                System.out.println(day + " day of Weekend");
            } else {
                System.out.println(day + " is a weekday");
            }
        }
    }

    /**
     * 5:
     * <p>
     * <p>
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * <p>
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;

        Operator operator = Operator.ADD;
        double result;
        switch(operator) {

            case ADD:
                result = num1 + num2;
            case SUBTRACT:
                result = num1 - num2;
                break;
            case MULTIPLY:
                result = num1 * num2;
                break;
            case DIVIDE:
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
        System.out.println("Result: " + result);
    }
}
