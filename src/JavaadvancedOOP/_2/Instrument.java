package JavaadvancedOOP._2;

public abstract class Instrument implements Playable {
    String name;
    String brand;

    public Instrument(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }
}
