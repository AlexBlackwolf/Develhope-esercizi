package BroCodeCourse.Interface;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Wolf wolf = new Wolf();
        wolf.hunt();
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}
