package provaesame._prova2;

public class PersonTester {
        public static void main(String[] args) {
            Person john = new Person("John", "Doe", 25);

            System.out.println("First Name: " + john.getFirstName());
            System.out.println("Last Name: " + john.getLastName());
            System.out.println("Age: " + john.getAge());

            john.setAge(18);
            System.out.println(john.getAge());

            System.out.println("Is a Teenager: " + john.isTeen());
        }
}
