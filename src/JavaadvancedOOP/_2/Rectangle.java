package JavaadvancedOOP._2;

public class Rectangle extends Shape{
    public Rectangle(double height, double weight) {
        super(height, weight);
    }

    @Override
    public double calculateArea() {
        return height * weight;
    }
}
