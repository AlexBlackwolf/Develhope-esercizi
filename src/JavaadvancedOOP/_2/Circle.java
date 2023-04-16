package JavaadvancedOOP._2;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        super(radius, radius);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
