//This is the table class that represents a 
//client in the Client Server architecture.
public class table 
{
    private int numCustomers;
    private String[] orders;

    public table(int numCustomers, String[] orders)
    {
        this.numCustomers=numCustomers;
        this.orders=orders;
    }
    //Submits request to network.
    public String[] giveOrders()
    {
        return orders;
    }
    //Accepts requested information from network,
    //and checks if what they recieved is what they
    //asked for.
    public String receiveFood(String[] food)
    {
        if(food.equals(orders))
        {
            return "Order was correct. Happy Customers!";
        }
        else 
        {
            return "Order was wrong. Unhappy Customers!";
        }
    }
}