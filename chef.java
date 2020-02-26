//This is the chef class that represents the server
//in the Client Server architecture.
public class chef 
{
    private String[] orderList;
    private String[] preparedFood;
    //Accepts request from network.
    public void getSheet(String[] orderList)
    {
        this.orderList=orderList;
    }
    //Fulfills request.
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
    //Gives requested info to network.
    public String[] giveFood()
    {
        return preparedFood;
    }
}