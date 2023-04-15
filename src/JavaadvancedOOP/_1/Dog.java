package JavaadvancedOOP._1;

public class Dog extends Animal {
    private static String breed;

    public Dog(String breed, double height, double weight) {
        super(height, weight);
        this.breed = breed;
    }

    public static String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static double runSpeedMetersPerSecond() {
        return getHeight() * 2;
    }
}
