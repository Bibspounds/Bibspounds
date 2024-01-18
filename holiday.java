
/**
 * Write a description of class holiday here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUESTION THREE)
 */
public class holiday
{
    private int Day;
    public void holiday(int Day)
    {
        this.Day=Day;
    }
    public static double avgDate(Mapinduzi[] holidays)
    {
        int totalDays = 0;
    for(Mapinduzi holiday : holidays)
    {
    totalDays += holiday.Day ;
    }
    {
    return (double) totalDays / holidays.length;
    }
    }
}
