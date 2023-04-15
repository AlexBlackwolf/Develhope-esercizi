package JavaadvancedOOP._1;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }
    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        new Dog("Golden Retriever" , 0.5 , 56 );
        String dogInfo = "Breed: " + Dog.getBreed() + ", Height: " + Dog.getHeight() + ", Weight: " + Dog.getWeight();
        System.out.println(dogInfo);
        }
    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        new Bird(3, 1, 40);
        new Fish("Blue Marlin", 5, 150);
        String birdInfo= "Wingspan:" + Bird.getWingSpan() +", Height: " + Bird.getHeight() +", Weight: " + Bird.getWeight();
        String fishInfo= "Species:" + Fish.getSpecies() + ", Height: " + Fish.getHeight() + ", Weight: " + Fish.getWeight();
        System.out.println(birdInfo);
        System.out.println(fishInfo);
    }
    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        double dogSpeed = Dog.runSpeedMetersPerSecond();
        double fishSpeed = Fish.swimSpeedMetersPerSecond();
        double birdSpeed = Bird.flySpeedMetersPerSecond();

        String fastestAnimal;
        double fastestSpeed;

        if (dogSpeed >= fishSpeed && dogSpeed >= birdSpeed) {
            fastestAnimal = "Dog";
            fastestSpeed = dogSpeed;
        } else if (fishSpeed >= birdSpeed) {
            fastestAnimal = "Fish";
            fastestSpeed = fishSpeed;
        } else {
            fastestAnimal = "Bird";
            fastestSpeed = birdSpeed;
        }

        System.out.println("The " + fastestAnimal + " is the fastest animal with a speed of " + fastestSpeed + " meters per second.");
        }

    }
