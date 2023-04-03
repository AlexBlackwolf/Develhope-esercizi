package provaesame._prova4;

public class BadgeTester {
    public static void main(String[] args) {
        // 7.Create two new employee objects
        Employee employee1 = new Employee("John", "Doe", "123 Main St");
        Employee employee2 = new Employee("Jane", "Smith", "456 Oak Ave");

        // 8.Create their corresponding badges
        Badge badge1 = new Badge(employee1);
        Badge badge2 = new Badge(employee2);

        // 9.Show the badge details for both employees
        badge1.showBadgeDetails();
        badge2.showBadgeDetails();
    }
}
