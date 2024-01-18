import java.util.Scanner;

/**
 * Write a description of class last here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTIO THREE - 6)
 */
public class last
{
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        while (true) {
            System.out.print("Enter an integer (enter 99 to finish): ");
            int number = scanner.nextInt();
            if (number == 99) {
                break;
            }
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("The largest number is -" +largest);
        System.out.println("The smallest number is -" +smallest);
        scanner.close();
    }
}
