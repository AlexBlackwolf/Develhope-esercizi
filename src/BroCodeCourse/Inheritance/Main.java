package BroCodeCourse.Inheritance;

public class Main {
    public static void main(String[] args) {
    Car car = new Car();
    car.go();

    Moto moto = new Moto();
    moto.stop();

    System.out.println("the car has " +car.doors+" doors");
    }
}
