package BroCodeCourse.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide: ");
            int x = scanner.nextByte();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextByte();

            int z = x / y;

            System.out.println("result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0 dummy");
        } catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER!!!!");
        }
        //catch(exception e) { //catches all exception
        //it is better to handle specific exception
        finally {
            scanner.close();
            //finally is good to close any scanner or file
            //that open
        }
    }
}
