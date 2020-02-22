public class waiter
{
    private String[] orderSheet;
    private String[] foodTray;

    public void takeOrder(String[] orders)
    {
        this.orderSheet=orders;
    }

    public String[] bringFood()
    {
        return foodTray;
    }
}