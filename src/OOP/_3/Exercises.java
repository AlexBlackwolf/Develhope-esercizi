package OOP._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student student = new Student("John Doe", 20, "Computer Science", "123456", 3.5);

        // Set the fields using the setter methods
        student.setName("Jane Smith");
        student.setAge(21);
        student.setMajor("Mathematics");
        student.setId("654321");
        student.setGrades(9.3);

        // Print out the values using the getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Major: " + student.getMajor());
        System.out.println("ID: " + student.getId());
        System.out.println("Grades: " + student.getGrades());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        Student student2 = new Student("John", 20, "Computer Science", "245789", 4.7);
        System.out.println(student2.getName()); // prints "John"
        System.out.println(student2.getGetNameCounter()); // prints 1
        System.out.println(student2.getName()); // prints "John" again
        System.out.println(student2.getGetNameCounter()); // prints 2
    }
}
