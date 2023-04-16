package JavaadvancedOOP._2;

public class Guitar extends Instrument {


    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("playing " + name + ".");
    }
}
