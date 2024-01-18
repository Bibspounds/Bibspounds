import java.util.Scanner;

/**
 * Write a description of class csp here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTIO TWO - 5)
 */
public class csp
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter score for quiz: ");
        int score = scanner.nextInt();
        char grade;
        if (score == 5) {
            grade = 'A';
        } else if (score == 4) {
            grade = 'B';
        } else if (score == 3) {
            grade = 'C';
        } else if (score == 2) {
            grade = 'D';
        } else if (score == 1) {
            grade = 'F';
        } else {
            grade = 'x';
        }
        System.out.println("The grade is: " + grade);
        scanner.close();
    }
}
