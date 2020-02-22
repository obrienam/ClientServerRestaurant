public class waiter
{
    private String[] orderSheet;
    private String[] foodTray;

    public void takeOrder(String[] orders)
    {
        this.orderSheet=orders;
    }
    public String[] giveOrderSheet()
    {
        return this.orderSheet;
    }
    public void takeFood(String[] foodTray)
    {
        this.foodTray=foodTray;
    }
    public String[] bringFood()
    {
        return foodTray;
    }
}