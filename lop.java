import java.util.Scanner;

/**
 * Write a description of class lop here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTIO THREE - 4)
 */
public class lop
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a positive number (enter a negative number to finish): ");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum of positive numbers: " + sum);
        scanner.close();
    }
}
