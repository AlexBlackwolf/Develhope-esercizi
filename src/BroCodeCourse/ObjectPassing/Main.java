package BroCodeCourse.ObjectPassing;

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car("bmw");
        Car car2= new Car("tesla");
        garage.park(car1);
        garage.park(car2);
        //you can pass object as argument
        //but when you declare that method
        //you need to have the parameters set up
        // to accept objects of that data type
        //in this example we had the data type of car
    }
}
