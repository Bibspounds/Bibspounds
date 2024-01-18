
/**
 * Write a description of class StockItem here.
 *
 * @author (HABIBA JUMA KHAMIS/BITA.6.22.037.TZ)
 * @version (QUSTION TWO)
 */
public class StockItem
{
    private int stocknumber;
    private String name;
    private double price;
    private int totalnumber;
    public StockItem(int stocknumber,String name,double price,int totalnumber)
    {
        this.stocknumber=stocknumber;
        this.name=name;
        this.price=price;
        this.totalnumber=0;
    }
    public void setprice(double newprice)
    {
        this.price=newprice;
    }
    public void addstock(int quantity)
    {
        this.totalnumber+=quantity;
    }
    public double totalvalue()
    {
        return price * totalnumber;
    }
    public int getstocknumber()
    {
        return stocknumber;
    }
    public String getname(){
        return name;
    }
    public double getprice(){
        return price;
    }
    public int gettotalnumber(){
        return totalnumber;
    }
}
