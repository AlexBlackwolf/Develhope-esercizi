package OOP._2;

public class Student {
    //Create a constructor inside Student that takes 'name' and 'age'
    private String name;
    private int age;

    public Student(String name, int age) {
        System.out.println("Constructing!");
        this.name = name;
        this.age = age;
        System.out.println("Constructed!");
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void newStudent() {
        System.out.println("List of students: " +
                name + ", "+ age);
    }
}
