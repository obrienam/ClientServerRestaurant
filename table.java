public class table 
{
    private int numCustomers;
    private String[] orders;

    public table(int numCustomers, String[] orders)
    {
        this.numCustomers=numCustomers;
        this.orders=orders;
    }

    public String[] giveOrders()
    {
        return orders;
    }

}