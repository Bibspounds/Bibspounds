import java.util.Scanner;

/**
 * Write a description of class travl here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTIO THREE - 2)
 */
public class travl
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the speed of the vehicle in mph? ");
        int speed = scanner.nextInt();
        System.out.print("How many hours has it traveled? ");
        int hours = scanner.nextInt();
        System.out.println("\nThe Distance Traveled Hour");
        for (int hour = 1; hour <= hours; hour++) {
            int distance = speed * hour;
            System.out.println(hour + "......." + distance);
        }scanner.close();
    }
}
