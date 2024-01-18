import java.util.Scanner;

/**
 * Write a description of class timtbl here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTIO THREE - 5)
 */
public class timtbl
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number ");
        int value = scanner.nextInt();
        System.out.println();
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= value; j++) {
                int result = i * j;
                System.out.printf("%-6d", result);
            }
            System.out.println();
        }scanner.close();
    }
}
