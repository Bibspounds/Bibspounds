import java.util.Scanner;

/**
 * Write a description of class sentr here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTION TWO -1)
 */
public class sentr
{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = Input.nextInt();
        System.out.print("Enter years of citizenship: ");
        int yearsofcitizen = Input.nextInt();
        boolean senateEligible = age >= 30 && yearsofcitizen >= 9;
        boolean houseEligible = age >= 25 && yearsofcitizen >= 7;
        System.out.println("Senate Eligibility: " + (senateEligible ? "Eligible" : "Not Eligible"));
        System.out.println("House Eligibility: " + (houseEligible ? "Eligible" : "Not Eligible"));
        Input.close();
    }
}
