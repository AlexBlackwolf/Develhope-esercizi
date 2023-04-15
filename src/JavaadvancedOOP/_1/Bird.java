package JavaadvancedOOP._1;

public class Bird  extends  Animal{
    private static double wingSpan;
    public Bird(double wingSpan, double height, double weight) {
        super(height, weight);
        this.wingSpan = wingSpan;
        }
        public  static double getWingSpan() {
            return wingSpan;
        }
        public void setWingSpan(double wingSpan) {
            this.wingSpan = wingSpan;
        }
            public static double flySpeedMetersPerSecond() {
                return getWingSpan() * 4;
    }
}

