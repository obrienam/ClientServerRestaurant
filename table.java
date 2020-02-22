
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

    public String receiveFood(String[] food)
    {
        if(food.equals(orders))
        {
            return "Order is correct. Happy Customers!";
        }
        else 
        {
            return "Order is wrong. Unhappy Customers!";
        }
    }
}