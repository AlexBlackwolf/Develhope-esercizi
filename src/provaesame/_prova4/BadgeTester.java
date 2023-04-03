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

//result
//Total number of employees: 1
//Name: John
//Surname: Doe
//Address: 123 Main St
//Badge ID code: ABCJohnDoeZYX
//Total number of employees: 2
//Name: Jane
//Surname: Smith
//Address: 456 Oak Ave
//Badge ID code: ABCJaneSmithZYX
//
//Process finished with exit code 0
