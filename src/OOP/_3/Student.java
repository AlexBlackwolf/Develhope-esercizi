package OOP._3;

public class Student {
    private String name;
    private int age;
    private String major;
    private String id;
    private double grades;
    private int getNameCounter;

    public Student(String name, int age, String major, String id, double grades) {
        this.name = name;
        this.age = age;
        this.major = major;
        this.id = id;
        this.grades = grades;
    }
     //next time i'll call the variable nameCounter and for future i'll avoid using get to name variables!!!!!!
    public String getName() {
        getNameCounter++;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getGetNameCounter() {
        return getNameCounter;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.length() == 6) {
            this.id = id;
        } else {
            System.out.println("ID must be exactly 6 characters!");
        }
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double gpa) {
        if (gpa >= 0.0 && gpa <= 10.0) {
            this.grades = gpa;
        } else {
            System.out.println("GPA must be between 0.0 and 4.0!");
        }
    }
}
