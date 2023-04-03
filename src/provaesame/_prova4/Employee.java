package provaesame._prova4;

public class Employee {
    String name;
    String surname;
    String address;

    // 1.Create a constructor to set the properties
    public Employee(String newEmployeeName, String newEmployeeSurname, String newEmployeeAddress) {
        name = newEmployeeName;
        surname = newEmployeeSurname;
        address = newEmployeeAddress;
    }

    // 2.Create a method to return a string with all the employee details
    public String getEmployeeDetails() {
        return "Name: " + name + "\nSurname: " + surname + "\nAddress: " + address;
    }
}
