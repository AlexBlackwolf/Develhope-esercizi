package JavaadvancedOOP._2;

public abstract class Shape {
    double height;
    double weight;

    public Shape(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    public abstract double calculateArea();
}
