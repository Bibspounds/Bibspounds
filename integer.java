import java.util.Scanner;

/**
 * Write a description of class integer here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTION ONE - 1)
 */
public class integer
{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 2-digit integer (rightmost digit non-zero): ");
        int x = scanner.nextInt();
        if (x < 10 || x > 99 || x % 10 == 0) {
            System.out.println("Invalid input. Please enter a 2-digit integer with non-zero rightmost digit.");
        } else {
            int y = (x % 10) * 10 + (x / 10);      
            System.out.println("Original number (x): " + x);
            System.out.println("Reversed number (y): " + y);
            System.out.println("Sum (x + y): " + (x + y));
        }

        scanner.close();
    

    }
}

