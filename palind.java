import java.util.Scanner;

/**
 * Write a description of class palind here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTIO TWO - 2)
 */
public class palind
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit integer: ");
        int number = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
        scanner.close();
    }
    private static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversedNumber = 0;
        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
