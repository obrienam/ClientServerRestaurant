public class chef 
{
    private String[] orderList;
    private String[] preparedFood;

    public void getSheet(String[] orderList)
    {
        this.orderList=orderList;
    }
    public boolean makeFood()
    {
        for(int i = 0; i < orderList.length; i++)
        {
            System.out.printf("Preparing: %s\n",orderList[i]);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Error");
            }
        }
        System.out.println("Order Up!");
        return true;
    }
    public String[] giveFood()
    {
        return preparedFood;
    }
}