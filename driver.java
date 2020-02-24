public class driver
{    
    public static void main(String[] args)
    {
        chef Chef = new chef();
        String[] orders1={"Steak","Salad","Chicken Strips","Burger"};
        table Table1 = new table(4, orders1);
        String[] orders2={"Wrap","Salad","Ribs","Burger"};
        table Table2 = new table(4, orders2);
        String[] orders3={"Wings","Tacos","Salad","Burger"};
        table Table3 = new table(4, orders3);
        String[] orders4={"Tacos","Chicken Strips","Salad","Burger"};
        table Table4 = new table(4, orders4);
        waiter Waiter = new waiter();
        table[] tables=new table[]{Table1,Table2,Table3,Table4};
        for(int i=0;i<4;i++)
        {
            try
            {
                System.out.printf("Waiter took order from table %d\n",i+1);
                Thread.sleep(1000);
                Waiter.takeOrder(tables[i].giveOrders());
                System.out.printf("Waiter delivering order %d to chef\n",i+1);
                Thread.sleep(1000);
                Chef.getSheet(Waiter.giveOrderSheet());
                Chef.makeFood();
                Waiter.takeFood(Chef.giveFood());
                Thread.sleep(1000);
                System.out.printf("Waiter delivering order %d to table\n",i+1);
                Thread.sleep(2000);
                System.out.println(tables[i].receiveFood(Waiter.bringFood()));
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Error");
            }
        }
        
    }
}