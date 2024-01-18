import java.util.Scanner;

/**
 * Write a description of class kwalty here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTIO TWO - 3)
 */
public class kwalty
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID number: ");
        int employeeId = scanner.nextInt();
        System.out.print("Enter hourly rate of pay: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Enter number of hours worked for the week: ");
        double totalHoursWorked = scanner.nextDouble();
        double regularHours = Math.min(totalHoursWorked, 40);
        double overtimeHours = Math.max(totalHoursWorked - 40, 0);
        double regularPay = regularHours * hourlyRate;
        double overtimePay = overtimeHours * 1.5 * hourlyRate;
        double grossPay = regularPay + overtimePay;
        double parkingCharge = 20.00;
        double incomeTax = (grossPay > 500.00) ? 0.15 * grossPay : 0;
        double totalDeductions = incomeTax + parkingCharge;
        double netPay = grossPay - totalDeductions;
        System.out.println("ID Number:\t\t" + employeeId);
        System.out.println("Pay Rate:\t\t" + hourlyRate);
        System.out.println("Regular Hours:\t\t" + regularHours);
        System.out.println("Overtime Hours:\t\t" + overtimeHours);
        System.out.println("Total Hours:\t\t" + totalHoursWorked);
        System.out.println("Regular Pay:\t\t" + regularPay);
        System.out.println("Overtime Pay:\t\t" + overtimePay);
        System.out.println("Gross Pay:\t\t" + grossPay);
        System.out.println("Deductions:\t\t" + totalDeductions);
        System.out.println("Net Pay:\t\t" + netPay);
    scanner.close();
    }
}
