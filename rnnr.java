import java.util.Scanner;

/**
 * Write a description of class rnnr here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTIO TWO - 4)
 */
public class rnnr
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name and time (in minutes) for Runner 1:");
        String runner1Name = scanner.next();
        double runner1Time = scanner.nextDouble();
        System.out.println("Enter the name and time (in minutes) for Runner 2:");
        String runner2Name = scanner.next();
        double runner2Time = scanner.nextDouble();
        System.out.println("Enter the name and time (in minutes) for Runner 3:");
        String runner3Name = scanner.next();
        double runner3Time = scanner.nextDouble();
        System.out.println("Race Results:");
        if (runner1Time < runner2Time && runner1Time < runner3Time) {
            System.out.println("1. " + runner1Name);
            if (runner2Time < runner3Time) {
                System.out.println("2. " + runner2Name);
                System.out.println("3. " + runner3Name);
            } else {
                System.out.println("2. " + runner3Name);
                System.out.println("3. " + runner2Name);
            }
        } else if (runner2Time < runner1Time && runner2Time < runner3Time) {
            System.out.println("1. " + runner2Name);
            if (runner1Time < runner3Time) {
                System.out.println("2. " + runner1Name);
                System.out.println("3. " + runner3Name);
            } else {
                System.out.println("2. " + runner3Name);
                System.out.println("3. " + runner1Name);
            }
        } else {
            System.out.println("1. " + runner3Name);
            if (runner1Time < runner2Time) {
                System.out.println("2. " + runner1Name);
                System.out.println("3. " + runner2Name);
            } else {
                System.out.println("2. " + runner2Name);
                System.out.println("3. " + runner1Name);
            }
        }

        scanner.close();
    }
}
