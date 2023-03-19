package javabasics._17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;

        //Add the questionable funds to your bank balance and print it out!
        myBankBalanceEuro += questionableFundsEuro;
        System.out.println("New bank balance: " + myBankBalanceEuro + " euro");
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age int(age is rapresented by whole numbers)
     *    2b: The age of a baby in months byte (the age of a baby in months is unlikely to exceed the range of a byte)
     *    2c: Money in a hedgefund in euros ong (money values can be large, and a long can handle a range up to 9,223,372,036,854,775,807)
     *    2d: Price of a good in euros on amazon.com double (prices can have decimal values and require precision)
     *    2e: The exact weight of an apple measured by scientific equipment double (scientific equipment can measure weight with precision and require decimal values)
     *    2f: The number of kilometers from any 2 places in the world int (the maximum value of an int is sufficient for most distances between places in the world)
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");

        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        // Get day of month
        int dayOfMonth = currentDate.getDayOfMonth();
        System.out.println("Day of month: " + dayOfMonth);

        // Get day of week
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
        System.out.println("Day of week: " + dayOfWeek);

        // Get day of year
        int dayOfYear = currentDate.getDayOfYear();
        System.out.println("Day of year: " + dayOfYear);

        // Get month
        Month month = currentDate.getMonth();
        System.out.println("Month: " + month);

        // Get month value
        int monthValue = currentDate.getMonthValue();
        System.out.println("Month value: " + monthValue);

        // Create other dates
        LocalDate otherDate1 = LocalDate.of(2023, 3, 1);
        LocalDate otherDate2 = LocalDate.of(2023, Month.APRIL, 15);

        // Compare dates
        boolean isBefore = otherDate1.isBefore(otherDate2);
        boolean isAfter = otherDate1.isAfter(otherDate2);
        System.out.println(otherDate1 + " is before " + otherDate2 + ": " + isBefore);
        System.out.println(otherDate1 + " is after " + otherDate2 + ": " + isAfter);
    }
}
