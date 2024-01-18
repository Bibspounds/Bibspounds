import java.util.Scanner;

/**
 * Write a description of class nstd here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTIO THREE - 3)
 */
public class nstd
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numyears = scanner.nextInt();
        double totalRainfall = 0;
        int totalMonths = numyears * 12;
        for (int year = 1; year <= numyears; year++) {
            for (int month = 1; month <= 12; month++) {
                System.out.print("Enter inches of rainfall " + year + ",in  Month " + month + ": ");
                double rainfall = scanner.nextDouble();
                totalRainfall += rainfall;
            }
        }
        double averageRainfall = totalRainfall / totalMonths;
        System.out.println("\nNumber of months: " + totalMonths);
        System.out.println("Total inches of rainfall: " + totalRainfall);
        System.out.println("Average rainfall per month: " + averageRainfall);
        scanner.close();
    }
}
