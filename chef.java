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
        try
        {
            for(int i = 0; i < orderList.length; i++)
            {
                System.out.printf("Chef preparing: %s\n",orderList[i]);
                Thread.sleep(1000);
                
            }
            System.out.println("Chef places food on the counter for the waiter.");
        }
        catch(InterruptedException e)
        {
            System.out.println("Error");
        }
        this.preparedFood=this.orderList;
        return true;
    }
    public String[] giveFood()
    {
        return preparedFood;
    }
}