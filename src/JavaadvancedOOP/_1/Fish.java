package JavaadvancedOOP._1;

    public class Fish extends Animal {
        private static String species;

        public Fish(String species, double height, double weight) {
            super(height, weight);
            this.species = species;
        }

        public static String getSpecies() {
            return species;
        }

        public void setSpecies(String species) {
            this.species = species;
        }
        public static double swimSpeedMetersPerSecond() {
            return getWeight() * 2;
    }
}
