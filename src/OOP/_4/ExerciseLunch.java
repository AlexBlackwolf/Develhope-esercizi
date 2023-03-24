package OOP._4;

public class ExerciseLunch {
    private Double price = null;
    private String nameOfDayEaten = null;
    private int lunchWeightInGrams;

    private static final double MAX_PRICE = 5;

    private int numberOfTimesWeHaveGotPrice = 0;

    protected ExerciseLunch(Double price, String nameOfDayEaten) {  //check video later in case the protected access modifier such as protected as been mentioned, in case it is change to protected
                                                                    //for now use public
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }

    public static void printMaxPrice() {
        System.out.println(MAX_PRICE);
    }

    private void printLunch() {
        System.out.println("Lunch{" +
                "price=" + price +
                ", nameOfDayEaten='" + nameOfDayEaten + '\'' +
                ", lunchWeightInGrams='" + lunchWeightInGrams + '\'' +
                '}');
    }

    private void setPrice(double price) {
        if (price > MAX_PRICE) {
            System.out.println("Cannot set greater than max price");
        } else {
            this.price = price;
        }
    }
    //exercise set instance access modifier from private to protected so i can access this setter in exercise 2
    protected Double getPrice() {
        numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice + 1;
        return this.price;
    }

    private int getNumberOfTimesWeHaveGotPrice() {
        return this.numberOfTimesWeHaveGotPrice;
    }

    protected String getNameOfDayEaten() {
        return nameOfDayEaten;
    }
    //exercise set instance access modifier from private to protected so i can access this setter in exercise 2

    private int getLunchWeightInGrams() {
        return lunchWeightInGrams;
    }

    private void setPrice(Double price) {
        this.price = price;
    }

    private void setNameOfDayEaten(String nameOfDayEaten) {
        this.nameOfDayEaten = nameOfDayEaten;
    }

    protected void setLunchWeightInGrams(int lunchWeightInGrams) {
        this.lunchWeightInGrams = lunchWeightInGrams;
    } //exercise set instance access modifier from private to protected so i can access this setter in exercise 2

    private void setNumberOfTimesWeHaveGotPrice(int numberOfTimesWeHaveGotPrice) {
        this.numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice;
    }
}
