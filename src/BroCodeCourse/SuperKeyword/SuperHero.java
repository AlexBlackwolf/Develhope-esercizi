package BroCodeCourse.SuperKeyword;

public class SuperHero extends Person {

    String power;

    SuperHero(String name, int age, String power) {
        //super refers to the parent class in this case person
        super(name, age);
        this.power = power;
    }

    public String toString() {
        return super.toString() + this.power;
    }
}