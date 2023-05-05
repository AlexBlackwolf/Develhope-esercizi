package BroCodeCourse.Math;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x; //<-Declaration
        double y;

        x = 3.14; //<-Assign
        y = -10;
        double z = Math.max(x, y);
        System.out.println(z);

        double w = Math.min(x, y);
        System.out.println(w);

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("inter side of a: ");
        a = scanner.nextDouble();
        System.out.println("inter side of b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println(c);

    }
}
