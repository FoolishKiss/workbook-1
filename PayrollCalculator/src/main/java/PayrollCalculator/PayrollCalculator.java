package PayrollCalculator;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        // starts scanner
        Scanner payrollCalculator = new Scanner(System.in);

        //ask user for name
        System.out.println("Enter employee name: ");
        String name = payrollCalculator.nextLine();

        //ask user hours worked
        System.out.println("Enter hours worked: ");
        double hoursWorked = payrollCalculator.nextDouble();

        //ask user pay rate
        System.out.println("Enter pay rate: ");
        double payRate = payrollCalculator.nextDouble();

        // Gross Pay variable
        double grossPay;

        //what happens when user fills out answers
        if (hoursWorked > 40) {
            double regularPay = 40 * payRate;
            double overTimePay = (hoursWorked - 40) * (payRate * 1.5);
            grossPay = regularPay + overTimePay;
        } else {
            grossPay = hoursWorked * payRate;
        }

        //prints out name and grosspay
        System.out.println("Employee: " + name);
        System.out.println("Gross Pay: $" + grossPay);

    }
}
