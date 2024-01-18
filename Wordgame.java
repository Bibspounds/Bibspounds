import java.util.Scanner;

/**
 * Write a description of class Wordgame here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTION ONE - 2)
 */
public class Wordgame
{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the name of a city: ");
        String city = scanner.nextLine();
        System.out.print("Enter the name of a college: ");
        String college = scanner.nextLine();
        System.out.print("Enter a profession: ");
        String profession = scanner.nextLine();
        System.out.print("Enter a type of animal: ");
        String animal = scanner.nextLine();
        System.out.print("Enter a pet's name: ");
        String petName = scanner.nextLine();
        System.out.println("There once was a person named " + name + " who lived in " + city + ".");
        System.out.println("At the age of " + age + ", " + name + " went to college at " + college + ".");
        System.out.println(name + " graduated and went to work as a " + profession + ".");
        System.out.println("Then, " + name + " adopted a(n) " + animal + " named " + petName + ".");
        System.out.println("They both lived happily ever after.");

        scanner.close();

    }
}

