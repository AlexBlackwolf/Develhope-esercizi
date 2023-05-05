package BroCodeCourse.WhileLoop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " + name);


        //do loop we move the condition at the end of the block
        //what this will always perform the block of code at least once
        //than check the condition after
        String sureName = "";

        do {
            System.out.println("enter your Surename ");
            sureName = scanner.nextLine();
        }while(sureName.isBlank());
        System.out.println("hello Mr. "+sureName);
        }
    }
