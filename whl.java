
/**
 * Write a description of class whl here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTIO THREE - 1)
 */
public class whl
{
    public static void main(String[] args) {
        int No = 1;
        System.out.println("No\t10*No\t100*No\t1000*No");
        while (No <= 5) {
            int tenNo = 10 * No;
            int hundredNo = 100 * No;
            int thousandNo = 1000 * No;
            System.out.println(No + "\t" + tenNo + "\t" + hundredNo + "\t" + thousandNo);
            No++;
        }
    }
}
