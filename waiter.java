//This is a waiter class that represents the network
//part of the Client Server architecture.
public class waiter
{
    private String[] orderSheet;
    private String[] foodTray;

    //Takes request from client.
    public void takeOrder(String[] orders)
    {
        this.orderSheet=orders;
    }
    //Gives request to server.
    public String[] giveOrderSheet()
    {
        return this.orderSheet;
    }
    //Retrieves requested information from server.
    public void takeFood(String[] foodTray)
    {
        this.foodTray=foodTray;
    }
    //Gives requested information to client.
    public String[] bringFood()
    {
        return foodTray;
    }
}