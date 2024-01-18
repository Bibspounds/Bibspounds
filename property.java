import java.util.Scanner;

/**
 * Write a description of class property here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTION ONE - 4)
 */
public class property
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the actual value of the property in $");
        double actualvalue = scanner.nextDouble();
        System.out.print("Enter the tax rate for each100.00 assessed value in $");
        double taxRate = scanner.nextDouble();
        double asesvalue = 0.6 * actualvalue;
        double annualTax = (asesvalue / 100) * taxRate;
        System.out.printf("The annual property tax $%.2f is $%.2f.%n", actualvalue, annualTax);
        scanner.close();
    }
}
