package BroCodeCourse.Random;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int y = random.nextInt(5);
                System.out.println(y);

        double x = random.nextDouble(10);
                System.out.println(x);
    }
}
