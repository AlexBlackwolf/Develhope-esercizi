package BroCodeCourse.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name?");
        String name = scanner.nextLine();
        System.out.println("hello " + name);
        System.out.println("What is your age?");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("so your name is " +name+ " and your age is " + age);
    }
}
