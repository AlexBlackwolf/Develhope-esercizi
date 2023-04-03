package provaesame._prova4;

public class Badge {
    private static int totalNumberOfEmployees = 0;
    private String badgeIdCode;
    public Employee employee;

    // 3.Create a static method to increment the total number of employees
    private static void keepTrackOfEmployeesNumber() {
        totalNumberOfEmployees++;
    }

    // 4.Create a method to generate a badge ID code using the employee's name and surname
    private String generateBadgeIdCode() {
        // Generate two random strings for the start and end of the badge ID code
        String startCode = "ABC";
        String endCode = "ZYX";
        // Combine the start code, employee's name and surname, and end code to create the badge ID code
        return startCode + employee.name + employee.surname + endCode;
    }

    // 5.Create a method to display the badge details
    public void showBadgeDetails() {
        // Call the static method to get the total number of employees
        keepTrackOfEmployeesNumber();
        // Get the employee details from the Employee object and the generated badge ID code
        String employeeDetails = employee.getEmployeeDetails();
        String badgeDetails = "Total number of employees: " + totalNumberOfEmployees + "\n" + employeeDetails + "\nBadge ID code: " + badgeIdCode;
        // Print the badge details to the console
        System.out.println(badgeDetails);
    }

    // 6.Create a constructor to set the employee and generate the badge ID code
    public Badge(Employee employeeThatNeedsBadge) {
        employee = employeeThatNeedsBadge;
        badgeIdCode = generateBadgeIdCode();
    }
}
